package br.com.cc.varzeafc.daos;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.cc.varzeafc.models.Campeonato;
import br.com.cc.varzeafc.models.Temporada;

@Repository
public class CampeonatoDAO {

	@PersistenceContext
	private EntityManager manager;

	public void salva(Campeonato campeonato) {
		manager.persist(campeonato);
	}
	
	public void salva(Temporada temporada) {
		manager.persist(temporada);
	}

	public List<Campeonato> listarTodos() {
		return manager.createQuery("select c from Campeonato c", Campeonato.class).getResultList();
	}

	public Campeonato buscaPorId(Integer id) {
		return manager.find(Campeonato.class, id);
	}

	public void atualizaCampeonato(Campeonato campeonato) {
		campeonato.setDataCriacao(buscaPorId(campeonato.getId()).getDataCriacao());
		manager.merge(campeonato);

	}

	public void excluir(Campeonato campeonato) {
		manager.remove(campeonato);

	}

	public List<Temporada> listarTodasTemporadasAtivas() {
		return manager.createQuery("select t from Temporada t where cast(t.ano as int) >= :ano", Temporada.class)
				.setParameter("ano", LocalDate.now().getYear()).getResultList();
		
	}

}

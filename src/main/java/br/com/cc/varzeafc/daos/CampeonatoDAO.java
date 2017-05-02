package br.com.cc.varzeafc.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.cc.varzeafc.models.Campeonato;

@Repository
public class CampeonatoDAO {

	@PersistenceContext
	private EntityManager manager;

	public void salva(Campeonato campeonato) {
		manager.persist(campeonato);
	}

	public List<Campeonato> listarTodos() {
		return manager.createQuery("select c from Campeonato c", Campeonato.class).getResultList();
	}

	public Campeonato buscaPorId(Integer id) {
		return manager.find(Campeonato.class, id);
	}

	public void atualizaCampeonato(Campeonato campeonato) {
		Query query = manager.createQuery("update Campeonato set nome = :nome , status =:status where id = :id");
		query.setParameter("nome", campeonato.getNome());
		query.setParameter("status", campeonato.getStatus());
		query.setParameter("id", campeonato.getId());
		query.executeUpdate();

	}

	public void excluir(Campeonato campeonato) {
		manager.remove(campeonato);

	}

}

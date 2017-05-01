package br.com.cc.varzeafc.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.cc.varzeafc.models.Patrocinador;

@Repository
public class PatrocionadorDAO {

	@PersistenceContext
	private EntityManager manager;

	public void salva(Patrocinador patrocinador) {
		manager.persist(patrocinador);
	}

	public List<Patrocinador> listarTodos() {
		return manager.createQuery("select p from Patrocinador p", Patrocinador.class).getResultList();
	}

	public Patrocinador buscaPorId(Integer id) {
		return manager.find(Patrocinador.class, id);
	}

	public void atualizaPatrocinador(Patrocinador patrocinador) {
		manager.merge(patrocinador);

	}

	public void excluir(Patrocinador patrocinador) {
		manager.remove(patrocinador);

	}

}

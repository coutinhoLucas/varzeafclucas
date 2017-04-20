package br.com.cc.varzeafc.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cc.varzeafc.models.Patrocinador;

@Repository
@Transactional
public class PatrocionadorDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void salva(Patrocinador patrocinador){
		em.persist(patrocinador);
	}

}

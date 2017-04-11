package br.com.cc.varzeafc.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cc.varzeafc.models.Grupo;
import br.com.cc.varzeafc.models.Permissao;

@Repository
@Transactional
public class PermissaoDAO {
	
	@PersistenceContext
	private EntityManager em;

	public List<Permissao> buscaPermissoesGrupo(Grupo grupo) {
		return em.createQuery("Select p from Permissao p JOIN p.grupos grupo where grupo.id = :i", Permissao.class)
				.setParameter("i", grupo.getId()).getResultList();
	}



}

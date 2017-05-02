package br.com.cc.varzeafc.daos;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cc.varzeafc.models.Usuario;

@Repository
@Transactional
public class UsuarioDAO {

	@PersistenceContext
	private EntityManager manager;

	public void salva(Usuario usuario){
			manager.persist(usuario);
		
	}

	public Usuario buscaPorLogin(String login) {
		try {
			CriteriaBuilder builder = manager.getCriteriaBuilder();
			CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);
			Root<Usuario> root = criteria.from(Usuario.class);
			Predicate like = builder.like(root.<String>get("login"), login);
			return manager.createQuery(criteria.select(root).where(like)).getSingleResult();
			
		}catch (NoResultException  e) {
			return null;
		}
	}

}

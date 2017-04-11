package br.com.cc.varzeafc.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cc.varzeafc.models.Usuario;

@Repository
@Transactional
public class UsuarioDAO {

	@PersistenceContext
	private EntityManager em;

	public void salva(Usuario usuario) {
		em.persist(usuario);
	}

	public Usuario buscaPorLogin(String login) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);
		Root<Usuario> root = criteria.from(Usuario.class);
		Predicate like = builder.like(root.<String>get("login"), login);
		return  em.createQuery(criteria.select(root).where(like)).getSingleResult(); 
	}

}

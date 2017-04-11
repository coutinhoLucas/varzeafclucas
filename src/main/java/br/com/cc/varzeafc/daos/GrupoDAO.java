package br.com.cc.varzeafc.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cc.varzeafc.models.Grupo;
import br.com.cc.varzeafc.models.Usuario;

@Repository
@Transactional
public class GrupoDAO {

	@PersistenceContext
	private EntityManager em;

	public List<Grupo> buscaGrupoUsuario(Usuario usuario) {
		
		return em.createQuery("Select g from Grupo g JOIN g.usuarios usuario where usuario.id = :i", Grupo.class)
				.setParameter("i", usuario.getId())
				.getResultList();
	
	}

	public List<Grupo> all() {
		return em.createQuery("select g from Grupo g where g.id !=2", Grupo.class).getResultList();
	}

}

package br.com.cc.varzeafc.dao;

import org.springframework.stereotype.Repository;

import br.com.cc.varzeafc.models.Usuario;

@Repository
public class UsuarioDao {
	
	public Usuario autentica(Usuario usuario){
		return new Usuario();
	}
	

}

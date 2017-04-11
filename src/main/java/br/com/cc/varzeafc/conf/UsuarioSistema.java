package br.com.cc.varzeafc.conf;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UsuarioSistema  extends User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioSistema(String login, String senha,
			Collection<? extends GrantedAuthority> authorities) {
		super(login, senha, authorities);
	}
	

}

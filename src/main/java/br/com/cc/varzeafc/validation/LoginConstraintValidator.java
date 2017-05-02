package br.com.cc.varzeafc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cc.varzeafc.daos.UsuarioDAO;
import br.com.cc.varzeafc.models.Usuario;

public class LoginConstraintValidator implements ConstraintValidator<Login, String> {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public void initialize(Login login) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValid(String login, ConstraintValidatorContext arg1) {

		if (!login.trim().isEmpty() && usuarioDAO != null && usuarioDAO.buscaPorLogin(login) != null)
			return false;

		return true;

	}

}

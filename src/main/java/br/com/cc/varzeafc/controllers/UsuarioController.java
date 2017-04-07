package br.com.cc.varzeafc.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cc.varzeafc.dao.UsuarioDao;
import br.com.cc.varzeafc.models.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView login(){
		return new ModelAndView("login/login");		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView logon(Usuario usuario){
		
		Usuario autentica = usuarioDao.autentica(usuario);
		
		return new ModelAndView("login/login");		
	}

}

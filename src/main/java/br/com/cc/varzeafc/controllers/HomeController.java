package br.com.cc.varzeafc.controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cc.varzeafc.daos.UsuarioDAO;
import br.com.cc.varzeafc.models.Grupo;
import br.com.cc.varzeafc.models.Presidente;
import br.com.cc.varzeafc.models.Usuario;

@Controller
@Transactional
public class HomeController {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/add")
	public String addAdm() {

		Usuario usuario = new Usuario();
		List<Grupo> grupos = new ArrayList<>();
		Grupo grupo = new Grupo();
		grupo.setId(1);
		grupos.add(grupo);

		usuario.setGrupos(grupos);
		usuario.setLogin("thiago");
		usuario.setSenha(new BCryptPasswordEncoder().encode("123"));
		usuarioDAO.salva(usuario);

		return "redirect:/login";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public ModelAndView login() {
		return new ModelAndView("login/login");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/cadastro")
	public ModelAndView cadastro(Presidente presidente) {
		return new ModelAndView("usuario/cadastro");
	}

	@RequestMapping(method = RequestMethod.POST, value = "/usuario/add")
	public String addPresidente(Presidente presidente) {
		presidente.setGrupos(addGrupo());
		presidente.getEquipe().setDataCriacao(Calendar.getInstance());
		presidente.setSenha(presidente.criptografarSenha(presidente.getSenha()));
		presidente.getEquipe().setPresidente(presidente);
		usuarioDAO.salva(presidente);
		return "redirect:/login";
	}

	private List<Grupo> addGrupo() {
		Grupo grupo = new Grupo();
		List<Grupo> grupos = new ArrayList<>();
		grupo.setId(2);
		grupos.add(grupo);
		return grupos;
	}

	@RequestMapping("/sistema")
	public String sistema() {
		return "sistema";
	}

}

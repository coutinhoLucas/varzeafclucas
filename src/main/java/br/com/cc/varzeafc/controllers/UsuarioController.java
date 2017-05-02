package br.com.cc.varzeafc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cc.varzeafc.daos.GrupoDAO;
import br.com.cc.varzeafc.daos.UsuarioDAO;
import br.com.cc.varzeafc.models.Grupo;
import br.com.cc.varzeafc.models.Usuario;

@Controller
@Transactional
public class UsuarioController {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Autowired
	private GrupoDAO grupoDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/admin/usuario")
	public ModelAndView addUsuario(Usuario usuario) {
		ModelAndView modelAndView = new ModelAndView("admin/add-usuario");
		modelAndView.addObject("allGrupos", carregaGrupos());
		return modelAndView;
	}

	private List<Grupo> carregaGrupos() {
		return grupoDAO.all();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/admin/add")
	public ModelAndView add(@Valid Usuario usuario, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

		if (bindingResult.hasErrors()) {
			return addUsuario(usuario);
		}
		usuario.setSenha(usuario.criptografarSenha(usuario.getSenha()));
		usuarioDAO.salva(usuario);
		redirectAttributes.addFlashAttribute("mensagem", "Cadastro realizado com sucesso.");
		return new ModelAndView("redirect:/admin/usuario");
	}

}

package br.com.cc.varzeafc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cc.varzeafc.daos.PatrocionadorDAO;
import br.com.cc.varzeafc.models.Patrocinador;

@Controller
@RequestMapping("/patrocinador")
public class PatrocionadorController {

	@Autowired
	PatrocionadorDAO patrocinadorDAO;

	@RequestMapping(method = RequestMethod.GET, value = "cadastrar")
	public ModelAndView cadastrar(Patrocinador patrocinador) {
		return new ModelAndView("patrocinador/add-patrocinador");
	}

	@RequestMapping(method = RequestMethod.POST, value = "add")
	public String add(Patrocinador patrocinador, final BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		patrocinadorDAO.salva(patrocinador);
		redirectAttributes.addFlashAttribute("mensagem", "Cadastro realizado com sucesso.");
		return "redirect:cadastrar";
	}

}

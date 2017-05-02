package br.com.cc.varzeafc.controllers;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cc.varzeafc.daos.CampeonatoDAO;
import br.com.cc.varzeafc.daos.PatrocionadorDAO;
import br.com.cc.varzeafc.models.Campeonato;
import br.com.cc.varzeafc.models.CampeonatoStatus;
import br.com.cc.varzeafc.models.Patrocinador;
import br.com.cc.varzeafc.models.Temporada;

@Controller
@Transactional
public class CampeonatoController {

	@Autowired
	private CampeonatoDAO campeonatoDAO;

	@Autowired
	private PatrocionadorDAO patrocionadorDAO;

	@RequestMapping(method = RequestMethod.GET, value = "/campeonato")
	public ModelAndView form(Campeonato campeonato) {
		ModelAndView view = new ModelAndView("campeonato/add-campeonato");
		view.addObject("patrocinadores", carregaPatrocinadores());
		view.addObject("status", Arrays.asList(CampeonatoStatus.values()));
		view.addObject("temporadas", carregaTemporadasAtivas());
		return view;
	}

	private List<Patrocinador> carregaPatrocinadores() {
		return patrocionadorDAO.listarTodos();
	}
	
	private List<Temporada> carregaTemporadasAtivas() {
		return campeonatoDAO.listarTodasTemporadasAtivas();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/campeonato")
	@CacheEvict(value = "campeonatos", allEntries = true)
	public ModelAndView add(@Valid Campeonato campeonato, BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {

		if (bindingResult.hasErrors()) {
			return form(campeonato);
		}
		campeonato.setDataCriacao(Calendar.getInstance());
		campeonatoDAO.salva(campeonato);

		redirectAttributes.addFlashAttribute("mensagem", "Campeonato cadastrado com sucesso.");
		return new ModelAndView("redirect:campeonato");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/campeonatos")
	@Cacheable("campeonatos")
	public ModelAndView list(Campeonato campeonato) {
		ModelAndView view = new ModelAndView("campeonato/list-campeonatos");
		view.addObject("campeonatos", campeonatoDAO.listarTodos());
		return view;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/campeonato/{id}", produces = "application/json")
	public @ResponseBody String carregaCampeonato(@PathVariable("id") Integer id) {
		Campeonato campeonato = campeonatoDAO.buscaPorId(id);
		return campeonato.toJson();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/campeonato/{id}")
	@CacheEvict(value = "campeonatos", allEntries = true)
	public ModelAndView update(@Valid Campeonato campeonato, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return list(campeonato);

		}

		campeonatoDAO.atualizaCampeonato(campeonato);
		return new ModelAndView("redirect:/campeonatos");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/campeonato/excluir/{id}")
	@CacheEvict(value = "campeonatos", allEntries = true)
	public String remove(@PathVariable("id") Integer id) {
		Campeonato campeonato = campeonatoDAO.buscaPorId(id);
		campeonatoDAO.excluir(campeonato);
		return "redirect:/campeonatos";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/temporada")
	public ModelAndView form(Temporada temporada) {
		ModelAndView view = new ModelAndView("campeonato/add-temporada");
		return view;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/temporada")
	public ModelAndView add(@Valid Temporada temporada, BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			return form(temporada);
		}
		campeonatoDAO.salva(temporada);

		redirectAttributes.addFlashAttribute("mensagem", "Temporada cadastrada com sucesso.");
		return new ModelAndView("redirect:temporada");
	}

}

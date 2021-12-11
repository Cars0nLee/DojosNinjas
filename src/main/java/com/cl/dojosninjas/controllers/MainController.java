package com.cl.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cl.dojosninjas.models.Dojo;
import com.cl.dojosninjas.models.Ninja;
import com.cl.dojosninjas.services.DojoService;
import com.cl.dojosninjas.services.NinjaService;

@Controller
public class MainController {

	private final DojoService dojoServ;
	private final NinjaService ninjaServ;
	
	public MainController(DojoService dojoServ, NinjaService ninjaServ) {
		this.dojoServ = dojoServ;
		this.ninjaServ = ninjaServ;
	}
	
	///// Create Dojo
	@RequestMapping("/")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";
	}
	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		else {
			dojoServ.create(dojo);
			return "redirect:/";
		}
	}
	
	///// Create Ninja
	@RequestMapping("/ninja")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoServ.allDojos();
		model.addAttribute("dojos", dojos);
		return "ninja.jsp";
	}
	
	@PostMapping("/createninja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> dojos = dojoServ.allDojos();
			model.addAttribute("dojos", dojos);
			return "ninja.jsp";
		}
		else {
			ninjaServ.createNinja(ninja);
			return "redirect:/ninja";
		}
	}
	
	///// View
	@RequestMapping("/view/{id}")
	public String view(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoServ.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "view.jsp";
	}
}


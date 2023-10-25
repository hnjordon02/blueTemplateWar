package com.dinant.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"/","/index","/home", "/inicio"})
	public String goHome(Model model) {
		model.addAttribute("titulo", "Bienvenido Pagina de Inicio");
		return "inicio";
	}
}

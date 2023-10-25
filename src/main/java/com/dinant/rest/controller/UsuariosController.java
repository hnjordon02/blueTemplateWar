package com.dinant.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuariosController {

	@GetMapping("/users")
	public String users(Model model) {
		model.addAttribute("titulo","Vista usuarios");
		return "views/users/usuarios";
	}
}

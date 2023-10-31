package com.dinant.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RolesController {
	
	@GetMapping("/roles")
	public String goRoles(Model model) {
		model.addAttribute("titulo", "Vista roles");
		return "views/users/roles";
	}

}

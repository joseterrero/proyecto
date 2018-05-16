package com.salesianostriana.proyectofinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping({"/","/inicio"})
	public String inicio(Model model) {
	//	model.addAttribute();
		return "inicio";
	}
	
}

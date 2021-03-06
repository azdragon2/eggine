package com.spectare.eggine.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

	@GetMapping({ "/", "/home", "/index" })
	public @ResponseBody String index(Model model) {
		model.addAttribute("name", "test");
		return "index";
	}

}
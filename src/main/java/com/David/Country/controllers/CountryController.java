package com.David.Country.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.David.Country.services.CountryService;

@Controller
public class CountryController {
	private final CountryService service;
	public CountryController(CountryService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
//		this.service.slovene();
//		this.service.countCity();
		this.service.mexico500k();
		return "index.jsp";
	}
}

package com.rte.bob.collecting.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bob")
public class WebserviceController {
	

	@GetMapping(value = "/{message}")
	public String startJobLancher(@PathVariable String message) {
		
		
		String result = message;
		
			return "Nouveau parametre: message =  "+result;
		
	}
	


}

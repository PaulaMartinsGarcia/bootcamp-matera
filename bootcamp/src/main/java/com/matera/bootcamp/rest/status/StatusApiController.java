package com.matera.bootcamp.rest.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matera.bootcamp.service.ContaCorrenteService;

@RequestMapping("/status") 
@RestController
public class StatusApiController {

	@Autowired
	private ContaCorrenteService contaCorrenteService;
	
	@GetMapping
	public String statusCheck() {
		return "up";
	}
}

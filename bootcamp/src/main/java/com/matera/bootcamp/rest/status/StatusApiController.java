package com.matera.bootcamp.rest.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/status") 
@RestController
public class StatusApiController {

	@GetMapping
	public String statusCheck() {
		return "up";
	}
}

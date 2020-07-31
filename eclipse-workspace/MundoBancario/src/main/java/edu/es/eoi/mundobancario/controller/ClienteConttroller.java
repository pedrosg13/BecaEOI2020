package edu.es.eoi.mundobancario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.mundobancario.service.ClienteService;

@RestController
public class ClienteConttroller {
	
	@Autowired
	ClienteService service;
	
	@GetMapping()

}

package edu.es.eoi.mundobancario.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.mundobancario.entity.Cliente;
import edu.es.eoi.mundobancario.service.ClienteService;
import edu.es.eoi.mundobancario.service.ClienteServiceImpl;

@RestController
public class ClienteConttroller {

	@Autowired
	ClienteService service;
	
	//Devuelve un listado con todos los clientes (información básica sin la contraseña).
	@GetMapping("clientes")
	public ResponseEntity<List<Cliente>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	//Devuelve el cliente solicitado (información básica sin la contraseña).
	@GetMapping("clientes/{id}")
	public ResponseEntity<Cliente> findClienteByIdUsuario(@PathVariable Integer Id) {
		
		return ResponseEntity.ok(service.findClienteById(Id));
	}
	
	//Devuelve el cliente solicitado (información básica sin la contraseña).
	@PostMapping("clientes/login")
	
	//Devuelve las cuentas del cliente solicitado (Toda la información de las cuentas)
	@GetMapping("clientes/{id}/cuentas")
	
	//Modifica el campo email del cliente solicitado
	@UpdateMapping("clientes/{id}")
	
	//Añadimos un nuevo cliente.
	@PostMapping("clientes")

	
}

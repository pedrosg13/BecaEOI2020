package edu.es.eoi.mundobancario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.mundobancario.entity.Cliente;
import edu.es.eoi.mundobancario.entity.Cuenta;
import edu.es.eoi.mundobancario.service.ClienteService;
import edu.es.eoi.mundobancario.service.CuentaService;
import lombok.Getter;

@RestController
public class ClienteController {

	@Autowired
	ClienteService service;

	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/clientes/{id}")
	public ResponseEntity<Cliente> findClienteByIdUsuario(@PathVariable Integer Id) {
		return ResponseEntity.ok(service.findClienteById(Id));
	}

	@PostMapping("/cliente/login")
	public ResponseEntity<String> loginDataFromCliente() {
		List<Cliente> list = service.loadFromFile("src/test/resources/jugadores.xlsx");
		service.saveClienteLoginDto(list);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@GetMapping("/cliente/{id}/cuentas")
	public ResponseEntity<Object> findByIdCuenta(@PathVariable Integer id, @RequestBody Cuenta cuenta) {
		return ResponseEntity.ok(service.findCunetaById(id));
	}

	@PutMapping("/cliente/{id}")
	@ResponseBody
	public ResponseEntity<String> update(@PathVariable String email, @RequestBody Cliente cliente) {

		if (!email.equals(cliente.getEmail())) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		} else {
			service.saveCliente(cliente);
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
	}

	@PostMapping("/clientes")
	public ResponseEntity<String> createCliente(@RequestBody Cliente cliente) {
		cliente.setUsuario(null);
		service.saveCliente(cliente);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

}

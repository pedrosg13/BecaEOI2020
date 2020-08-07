package edu.es.eoi.mundobancario.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
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

import edu.es.eoi.mundobancario.entity.Amortizacion;
import edu.es.eoi.mundobancario.entity.Cliente;
import edu.es.eoi.mundobancario.entity.Cuenta;
import edu.es.eoi.mundobancario.entity.Prestamo;
import edu.es.eoi.mundobancario.service.CuentaService;
import edu.es.eoi.mundobancario.service.PrestamoService;

@RestController
public class CuentasController {

	@Autowired
	CuentaService service;

	@Autowired
	PrestamoService prestamoService;

	@GetMapping("/cuentas")
	public ResponseEntity<Object> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/cuentas/deudoras")
	public ResponseEntity<Object> findBySaldo(@PathVariable Integer Saldo) {
		return ResponseEntity.ok(service.findCuentBySaldo(Saldo));
	}

	@GetMapping("/cuenta/{id}")
	public ResponseEntity<Object> findByIdCuenta(@PathVariable Integer id, @RequestBody Cuenta cuenta) {
		return ResponseEntity.ok(service.findCunetaById(id));
	}

	@PostMapping("/cuenta")
	public ResponseEntity<String> createCuenta(@RequestBody Cuenta cuenta) {
		cuenta.setCuentas(null);
		service.saveCuenta(cuenta);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PutMapping("/cuenta/{id}")
	@ResponseBody
	public ResponseEntity<String> update(@PathVariable String alias, @RequestBody Cuenta cuenta) {

		if (!alias.equals(cuenta.getAlias())) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		} else {
			service.saveCuenta(cuenta);
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
	}

	@GetMapping("/cuenta/{id}/movimientos")
	
	@GetMapping("/cuenta/{id}/prestamos")
	
	@GetMapping("/cuenta/{id}/prestamosVivos")
	
	@GetMapping("/cuenta/{id}/prestamosAmortizados")
	
	@PostMapping("/cuenta/{id}/prestamos")
	public ResponseEntity<String> createPrestamo(@RequestBody Prestamo prestamo) {
		prestamo.setPrestamo(null);
		service.savePrestamo(prestamo);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PostMapping("/cuenta/{id}/ingresos")
	public ResponseEntity<String> createIngreso(@RequestBody Cuenta cuenta) {
		cuenta.setCuentas(null);
		service.saveCuenta(cuenta);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PostMapping("/cuenta/{id}/pagos")
	public ResponseEntity<String> createCuenta(@RequestBody Amortizacion amortizacion) {
		amortizacion.setAmortizacion(null);
		service.saveAmortizacion(amortizacion);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

}

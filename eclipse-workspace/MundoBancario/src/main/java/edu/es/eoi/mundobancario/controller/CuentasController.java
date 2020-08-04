package edu.es.eoi.mundobancario.controller;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.mundobancario.service.CuentaService;

@RestController
public class CuentasController {
	
	@Autowired
	CuentaService cuentaService;
	
	//Devuelve un listado con todas las cuentas (Toda la información y datos del cliente).
	@GetMapping("cuentas")
	
	//Devuelve un listado de las cuentas con saldo negativo (Toda la información y datos del cliente).
	@GetMapping("cuentas/deudoras")
	
	//Devuelve la cuenta solicitada (Toda la información y datos del cliente).
	@GetMapping("cuentas/{id}")
	
	//Añadimos una nueva cuenta.
	@PostMapping("cuentas")
	
	//Modifica el campo alias de la cuenta solicitada
	@UpdateMappping("cuentas/{id}")
	
	//Devuelve los movimientos de la cuenta solicitada. (incluirá el tipo de movimiento)
	@GetMapping("cuentas/{id}/movimientos")
	
	//Devuelve los préstamos de la cuenta. (incluirán las amortizaciones planificadas)
	@GetMapping("cuentas/{id}/prestamos")

	//Devuelve los préstamos vivos de la cuenta. (incluirán las amortizaciones planificadas)
	@GetMapping("cuentas/{id}/prestamosVivos")
	
	//Devuelve los préstamos amortizados de la cuenta. (incluirán las amortizaciones planificadas)
	@GetMapping("cuentas/{id}/prestamosAmortizados")
	
	//Crearemos un préstamo nuevo.
	@PostMapping("cuentas/{id}/prestamos")
	
	//Crearemos un ingreso nuevo.
	@PostMapping("cuentas/{id}/ingresos")
	
	//Crearemos un pago nuevo.
	@PostMapping("cuentas/{id}/pagos")
	
	//Funcionalidad encargada de ejecutar las amortizaciones en caso de cuya fecha coincida con la del sistema, el funcionamiento se explica en detalle en la parte superior.
	@PostMapping("centas/ejecutarAmortizacionesDiarias")

}

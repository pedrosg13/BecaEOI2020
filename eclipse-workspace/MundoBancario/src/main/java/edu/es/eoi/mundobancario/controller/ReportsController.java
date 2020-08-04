package edu.es.eoi.mundobancario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.mundobancario.service.ClienteService;
import edu.es.eoi.mundobancario.service.PrestamoService;

@RestController
public class ReportsController {
	
	@Autowired
	ClienteService ClienteService;
	PrestamoService PrestamoService;
	
	//Devuelve los datos del cliente junto al listado de las cuentas de las que dispone y sus movs
	@GetMapping("reports/clientes/{id}")
	
	//Imprimirá un PDF con los datos del servicio anterior: EOI_BANK_CLIENTE_000.pdf en una ruta estática, los importes de los movimientos de tipo ingreso o préstamo aparecerán de color verde, mientras que el resto de importes se mostrarán en rojo y en negativo, se valorará que tenga una apariencia mínimamente cuidada.
	@PostMapping("reports/clientes/{id}")
	
	//Devuelve los datos del cliente junto a la información del préstamo indicado y las amortizaciones planificadas.
	@GetMapping("reports/prestamos/{id}")
	
	//Imprimirá un PDF con los datos del servicio anterior: EOI_BANK_PRESTAMO_000.pdf en una ruta estática, se valorará que tenga una apariencia mínimamente cuidada.
	@PostMapping("reports/prestamos/{id}")
	
	//Devuelve un listado de los préstamos que no se han pagado todavía junto a la cuenta y al cliente correspondiente
	@GetMapping("reports/prestamosVivos")
	
	//Devuelve un listado de los préstamos que se han pagado totalmente junto a la cuenta y al cliente correspondiente
	@GetMapping("reports/prestamosAmortizados")

}

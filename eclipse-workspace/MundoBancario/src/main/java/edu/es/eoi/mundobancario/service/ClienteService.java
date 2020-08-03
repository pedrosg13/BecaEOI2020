package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import edu.es.eoi.mundobancario.entity.Cliente;

public interface ClienteService {
	public List<Cliente> findAllAmortizacion();

	public Optional<Cliente> findAmortizacionById(Long id);

	public Cliente saveAmortizacion(Cliente customerNew);

	public String deleteAmortizacion(Long id);

	public String updateAmortizacion(Cliente customerNew);

}

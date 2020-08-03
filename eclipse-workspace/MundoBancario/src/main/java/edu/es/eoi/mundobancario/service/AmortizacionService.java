package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import edu.es.eoi.mundobancario.entity.Amortizacion;

public interface AmortizacionService {
	public List<Amortizacion> findAllAmortizacion();

	public Optional<Amortizacion> findAmortizacionById(Long id);

	public Amortizacion saveAmortizacion(Amortizacion customerNew);

	public String deleteAmortizacion(Long id);

	public String updateAmortizacion(Amortizacion customerNew);

}

package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import edu.es.eoi.mundobancario.entity.Amortizacion;
import edu.es.eoi.mundobancario.entity.Cuenta;
import edu.es.eoi.mundobancario.entity.Prestamo;

public interface CuentaService {
	public List<Amortizacion> findAmortizacion();

	public Optional<Amortizacion> findAmortizacionById(Long id);

	public Amortizacion saveAmortizacion(Amortizacion customerNew);

	public String deleteAmortizacion(Long id);

	public String updateAmortizacion(Amortizacion customerNew);

	public Object findAll();

	public void saveCuenta(Cuenta cuenta);

	public Object findCunetaById(Integer id);

	public Object findCuentBySaldo(Integer saldo);

	public void savePrestamo(Prestamo prestamo);

}

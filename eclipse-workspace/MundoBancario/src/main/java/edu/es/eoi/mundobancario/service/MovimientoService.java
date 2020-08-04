package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import edu.es.eoi.mundobancario.entity.Movimiento;

public interface MovimientoService {
	public List<Movimiento> findMovimiento();

	public Optional<Movimiento> findMovimientoById(Integer id);

	public Movimiento saveMovimiento(Movimiento customerNew);

	public String deleteMovimiento(Integer id);

	public String updateMovimiento(Movimiento customerNew);

}

package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import edu.es.eoi.mundobancario.entity.Movimiento;

public class MovimientoServiceImpl implements MovimientoService {

	@Autowired
	MovimientoService movimientoService;

	@Override
	public List<Movimiento> findMovimiento() {
		return null;
	}

	@Override
	public Optional<Movimiento> findMovimientoById(Integer id) {
		return null;
	}

	@Override
	public Movimiento saveMovimiento(Movimiento customerNew) {
		return null;
	}

	@Override
	public String deleteMovimiento(Integer id) {
		return null;
	}

	@Override
	public String updateMovimiento(Movimiento customerNew) {
		return null;
	}

}

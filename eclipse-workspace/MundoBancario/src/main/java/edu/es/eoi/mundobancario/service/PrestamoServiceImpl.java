package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import edu.es.eoi.mundobancario.entity.Prestamo;

public class PrestamoServiceImpl implements PrestamoService {

	@Autowired
	PrestamoService prestamoService;

	@Override
	public List<Prestamo> findPrestamo() {
		return null;
	}

	@Override
	public Optional<Prestamo> findPrestamoById(Integer id) {
		return null;
	}

	@Override
	public Prestamo savePrestamo(Prestamo customerNew) {
		return null;
	}

	@Override
	public String deletePrestamo(Integer id) {
		return null;
	}

	@Override
	public String updatePrestamo(Prestamo customerNew) {
		return null;
	}

}

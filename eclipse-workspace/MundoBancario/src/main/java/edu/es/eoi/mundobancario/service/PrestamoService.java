package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import edu.es.eoi.mundobancario.entity.Prestamo;

public interface PrestamoService {
	public List<Prestamo> findPrestamo();

	public Optional<Prestamo> findPrestamoById(Integer id);

	public Prestamo savePrestamo(Prestamo customerNew);

	public String deletePrestamo(Integer id);

	public String updatePrestamo(Prestamo customerNew);
}

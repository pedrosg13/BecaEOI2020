package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import edu.es.eoi.mundobancario.entity.TipoMovimiento;

public interface TipoMovimientoService {
	public List<TipoMovimiento> findTipoMovimiento();

	public Optional<TipoMovimiento> findTipoMovimientoById(Integer id);

	public TipoMovimiento saveTipoMovimiento(TipoMovimiento customerNew);

	public String deleteTipoMovimiento(Integer id);

	public String updateTipoMovimiento(TipoMovimiento customerNew);

}

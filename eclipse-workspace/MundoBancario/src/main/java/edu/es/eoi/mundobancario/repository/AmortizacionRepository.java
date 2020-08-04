package edu.es.eoi.mundobancario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.mundobancario.entity.Amortizacion;

@Repository
public interface AmortizacionRepository extends JpaRepository<Amortizacion, Integer> {

	public List<Amortizacion> findAll();
	
}

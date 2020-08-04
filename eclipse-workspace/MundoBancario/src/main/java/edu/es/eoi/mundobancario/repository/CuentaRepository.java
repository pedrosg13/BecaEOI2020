package edu.es.eoi.mundobancario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.es.eoi.mundobancario.entity.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {

	public List<Cuenta> findAll();
	
}

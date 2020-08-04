package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.mundobancario.entity.Amortizacion;

@Service
public class AmortizacionServiceImpl implements AmortizacionService {
	
	@Autowired
	AmortizacionService amortizacionService;

	@Override
	public List<Amortizacion> findAllAmortizacion() {
		return null;
	}

	@Override
	public Optional<Amortizacion> findAmortizacionById(Long id) {
		return null;
	}

	@Override
	public Amortizacion saveAmortizacion(Amortizacion customerNew) {
		return null;
	}

	@Override
	public String deleteAmortizacion(Long id) {
		return null;
	}

	@Override
	public String updateAmortizacion(Amortizacion customerNew) {
		return null;
	}
	
}

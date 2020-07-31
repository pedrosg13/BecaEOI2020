package edu.es.eoi.mundobancario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.mundobancario.repository.AmortizacionRepository;

@Service
public class AmortizacionService {
	
	@Autowired
	AmortizacionServiceImpl service;

}

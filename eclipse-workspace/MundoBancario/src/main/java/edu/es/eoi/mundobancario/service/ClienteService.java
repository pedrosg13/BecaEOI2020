package edu.es.eoi.mundobancario.service;

import java.util.List;

import edu.es.eoi.mundobancario.dto.DtoEntity;
import edu.es.eoi.mundobancario.entity.Cliente;

public interface ClienteService {
	public List<Cliente> findAll();

	public DtoEntity findClienteById(Integer id);

	public DtoEntity saveCliente(Cliente customerNew);

	public String deleteCliente(Integer id);

	public String updateCliente(Cliente customerNew);

}

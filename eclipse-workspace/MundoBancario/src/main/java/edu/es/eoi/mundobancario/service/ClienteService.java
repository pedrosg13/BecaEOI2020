package edu.es.eoi.mundobancario.service;

import java.util.List;

import edu.es.eoi.mundobancario.entity.Cliente;

public interface ClienteService {
	public List<Cliente> findAll();

	public Cliente findClienteById(Integer id);

	public Cliente saveCliente(Cliente customerNew);

	public void deleteCliente(Integer id);

	public String updateCliente(Cliente customerNew);

	public List<Cliente> loadFromFile(String string);

	public Object findCunetaById(Integer id);

	public void saveClienteLoginDto(List<Cliente> list);

}

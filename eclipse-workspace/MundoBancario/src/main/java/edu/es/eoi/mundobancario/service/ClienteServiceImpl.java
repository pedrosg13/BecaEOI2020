package edu.es.eoi.mundobancario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.mundobancario.entity.Cliente;
import edu.es.eoi.mundobancario.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente findClienteById(Integer id) {
		Cliente cliente = clienteRepository.findById(id).get();
		return cliente;
	}

	@Override
	public Cliente saveCliente(Cliente clienteNew) {
		if (clienteNew != null) {
			return clienteRepository.save(clienteNew);
		}
		return new Cliente();
	}

	@Override
	public void deleteCliente(Integer id) {
		if (clienteRepository.findById(id).isPresent()) {
			clienteRepository.deleteById(id);
			System.out.println("Cliente eliminado correctamente.");
		}
		System.out.println("Error! El cliente no existe!");
	}

	@Override
	public String updateCliente(Cliente clienteUpdate) {
		Integer num = clienteUpdate.getId();
		if (clienteRepository.findById(num).isPresent()) {
			Cliente clienteToUpdate = new Cliente();
			clienteToUpdate.setEmail(clienteUpdate.getEmail());
		}
		return "Error al modificar el cliente";
	}

}

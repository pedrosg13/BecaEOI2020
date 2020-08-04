package edu.es.eoi.mundobancario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.mundobancario.entity.Cliente;
import edu.es.eoi.mundobancario.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public List<Cliente> findAllCliente() {
		return clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> findClienteById(Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
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
	public String deleteCliente(Integer id) {
		if (clienteRepository.findById(id).isPresent()) {
			clienteRepository.deleteById(id);
			return "Cliente eliminado correctamente.";
		}
		return "Error! El cliente no existe!";
	}

	@Override
	public String updateCliente(Cliente clienteUpdate) {
		Integer num = clienteUpdate.getId();
		if (clienteRepository.findById(num).isPresent()) {
			Cliente clienteToUpdate = new Cliente();
			clienteToUpdate.setId(clienteUpdate.getId());
			clienteToUpdate.setUsuario(clienteUpdate.getUsuario());
			clienteToUpdate.setPass(clienteUpdate.getPass());
			clienteToUpdate.setNombre(clienteUpdate.getNombre());
			clienteToUpdate.setEmail(clienteUpdate.getEmail());
		}
		return "Error al modificar el cliente";
	}

}

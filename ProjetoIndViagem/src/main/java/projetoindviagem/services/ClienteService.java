package projetoindviagem.services;

import java.util.List;

import projetoindviagem.models.Cliente;

public interface ClienteService {

	
	List<Cliente> getAllClientes();
	
	Cliente getClienteById(Long id);
	
	Cliente saveCliente(Cliente cliente);
	
	Cliente updateCliente(Long id, Cliente clienteUpdated);
	
	void deleteById(Long id);
	
	
	
	
	
	
	
}


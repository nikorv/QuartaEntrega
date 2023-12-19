package projetoindviagem.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoindviagem.models.Cliente;
import projetoindviagem.repositories.ClienteRepository;

import projetoindviagem.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteRepository cr;

	@Override
	public List<Cliente> getAllClientes() {

		return cr.findAll();
	}

	@Override
	public Cliente getClienteById(Long id) {

		return cr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Not Found"));
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {

		return cr.save(cliente);
	}

	@Override
	public Cliente updateCliente(Long id, Cliente clienteUpdated) {
		Cliente clienteExists = cr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Not Found"));
		clienteExists.setName(clienteUpdated.getName());

		return cr.save(clienteExists);
	}

	@Override
	public void deleteById(Long id) {
		cr.deleteById(id);

	}


}

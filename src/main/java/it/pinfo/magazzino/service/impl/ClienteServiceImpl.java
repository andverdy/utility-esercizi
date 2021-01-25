package it.pinfo.magazzino.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.pinfo.magazzino.entity.Cliente;
import it.pinfo.magazzino.repository.ClienteRepository;
import it.pinfo.magazzino.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepo;

	@Override
	public List<Cliente> list() {
		return clienteRepo.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepo.save(cliente);
	}

	@Override
	public void delete(Integer idCliente) {
		clienteRepo.deleteById(idCliente);
	}

	@Override
	public Cliente findById(Integer id) {
		return clienteRepo.findById(id).get();
	}

}

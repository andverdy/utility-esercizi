package it.pinfo.magazzino.service;

import java.util.List;

import it.pinfo.magazzino.entity.Cliente;

public interface ClienteService {

	public List<Cliente> list();
	
	public Cliente save(Cliente cliente);
	
	public void delete(Integer idCliente);
	
	public Cliente findById(Integer id);
}

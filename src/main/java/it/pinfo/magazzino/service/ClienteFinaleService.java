package it.pinfo.magazzino.service;

import java.util.List;

import org.springframework.stereotype.Service;

import it.pinfo.magazzino.entity.Cliente;
import it.pinfo.magazzino.entity.ClienteFinale;

@Service
public interface ClienteFinaleService {
	public List<Cliente> list();

	public ClienteFinale save(ClienteFinale clienteFinale);

	public void delete(Long idClienteFinale);

}

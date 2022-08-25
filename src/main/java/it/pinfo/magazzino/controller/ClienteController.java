package it.pinfo.magazzino.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import it.pinfo.magazzino.entity.Cliente;
import it.pinfo.magazzino.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin
public class ClienteController {

	@Autowired
	private ClienteService clienteServ;

	@GetMapping("/list")
	public List<Cliente> list() {
		return clienteServ.list();
	}

	@PutMapping("/save")
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteServ.save(cliente);
	}

	@DeleteMapping("/delete")
	public void delete(Integer idCliente) {
		clienteServ.delete(idCliente);
	}

	@GetMapping("/findBy-id")
	public Cliente findById(@RequestParam Integer idCliente) {
		return clienteServ.findById(idCliente);
	}

}

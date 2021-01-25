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

import it.pinfo.magazzino.entity.PartiRicambio;
import it.pinfo.magazzino.service.PartiRicambioService;

@RestController
@RequestMapping("/api/parti-ricambio")
@CrossOrigin
public class PartiRicambioController {

	@Autowired
	private PartiRicambioService partiService;

	@GetMapping("/list")
	public List<PartiRicambio> list() {
		return partiService.findAll();
	}

	@PutMapping("/save")
	public PartiRicambio save(@RequestBody PartiRicambio partiRicambio) {
		return partiService.save(partiRicambio);
	}

	@GetMapping("/findBy-matricola")
	public PartiRicambio findByMatricola(@RequestParam String matricola) {
		return partiService.findByMatricola(matricola);
	}

	@DeleteMapping("/deleteById")
	public void deleteById(Long idParte) {
		System.out.println("sono nel delete");
		partiService.deleteById(idParte);
	}

	@GetMapping("/listIdParti")
	public List<Long> listIdParti(@RequestParam String stato) {
		return partiService.listIdParti(stato);
	}
	
	@GetMapping("/findBy-id")
	public PartiRicambio findById(@RequestParam Long id) {
		return partiService.findById(id);
	}
}

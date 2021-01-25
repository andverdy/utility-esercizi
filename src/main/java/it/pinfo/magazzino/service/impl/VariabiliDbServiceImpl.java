package it.pinfo.magazzino.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pinfo.magazzino.entity.Cliente;
import it.pinfo.magazzino.entity.VariabiliDb;
import it.pinfo.magazzino.entity.PartiRicambio;
import it.pinfo.magazzino.repository.ClienteRepository;
import it.pinfo.magazzino.repository.IndiciRepository;
import it.pinfo.magazzino.repository.PartiRicambioRepository;
import it.pinfo.magazzino.service.VariabiliDbService;
import it.pinfo.magazzino.service.PartiRicambioService;

@Service
public class VariabiliDbServiceImpl implements VariabiliDbService {

	@Autowired
	private IndiciRepository indiciRepo;

	@Override
	public VariabiliDb findById(Integer id) {
		return indiciRepo.findById(id).get();
	}

	@Override
	public List<VariabiliDb> findAll() {
		return indiciRepo.findAll();
	}

	@Override
	public VariabiliDb save(VariabiliDb indice) {
		return indiciRepo.save(indice);
	}

	@Override
	public void delete(Integer id) {
		indiciRepo.deleteById(id);
	}

	



}

package it.pinfo.magazzino.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pinfo.magazzino.entity.PartiRicambio;
import it.pinfo.magazzino.repository.PartiRicambioRepository;
import it.pinfo.magazzino.service.PartiRicambioService;

@Service
public class PartiRicambioServiceImpl implements PartiRicambioService {

	@Autowired
	private PartiRicambioRepository partiRepo;

	@Override
	public List<PartiRicambio> findAll() {
		return partiRepo.findAll();
	}

	@Override
	public PartiRicambio save(PartiRicambio parti) {

		if (parti != null) {

			return partiRepo.save(parti);
		} else {
			return null;
		}
	}

	@Override
	public void deleteById(Long idParte) {
		partiRepo.deleteById(idParte);
	}

	@Override
	public PartiRicambio findByMatricola(String matricola) {

		return partiRepo.findByMatricola(matricola);
	}

	@Override
	public List<Long> listIdParti(String stato) {
		return partiRepo.listIdParti(stato);
	}

	@Override
	public PartiRicambio findById(Long id) {
		return partiRepo.findById(id).get();
	}

}

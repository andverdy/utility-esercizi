package it.pinfo.magazzino.service;

import java.util.List;

import it.pinfo.magazzino.entity.PartiRicambio;

public interface PartiRicambioService {

	public PartiRicambio save(PartiRicambio parti);

	public PartiRicambio findById(Long id);

	public void deleteById(Long idParte);

	public List<Long> listIdParti(String stato);

	public List<PartiRicambio> findAll();

	public PartiRicambio findByMatricola(String matricola);

}

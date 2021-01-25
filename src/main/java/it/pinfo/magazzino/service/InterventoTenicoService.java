package it.pinfo.magazzino.service;

import java.util.List;

import org.springframework.stereotype.Service;

import it.pinfo.magazzino.entity.InterventoTecnico;

@Service
public interface InterventoTenicoService {

	public List<InterventoTecnico> findAll();

	public InterventoTecnico save(InterventoTecnico interventoTecnico);

	public void delete(Integer idInterventoTenico);

}

package it.pinfo.magazzino.service;

import java.util.List;

import org.springframework.stereotype.Service;

import it.pinfo.magazzino.entity.Movimento;

@Service
public interface MovimentoService {

	public List<Movimento> findAll();

	public Movimento save(Movimento movimento);

	public void delete(Integer idMovimento);

}

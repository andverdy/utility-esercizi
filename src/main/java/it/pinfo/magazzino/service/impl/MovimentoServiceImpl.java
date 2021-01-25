package it.pinfo.magazzino.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.pinfo.magazzino.entity.Movimento;
import it.pinfo.magazzino.repository.MovimentoRepository;
import it.pinfo.magazzino.service.MovimentoService;

public class MovimentoServiceImpl implements MovimentoService {

	@Autowired
	private MovimentoRepository movimentoRepo;

	@Override
	public List<Movimento> findAll() {
		// TODO Auto-generated method stub
		return movimentoRepo.findAll();
	}

	@Override
	public Movimento save(Movimento movimento) {
		// TODO Auto-generated method stub
		return movimentoRepo.save(movimento);
	}

	@Override
	public void delete(Integer idMovimento) {
		movimentoRepo.deleteById(idMovimento);
		
	}

	

}

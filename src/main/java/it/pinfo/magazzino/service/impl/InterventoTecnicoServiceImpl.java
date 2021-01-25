package it.pinfo.magazzino.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import it.pinfo.magazzino.entity.InterventoTecnico;
import it.pinfo.magazzino.repository.InterventoTecnicoRepository;
import it.pinfo.magazzino.service.InterventoTenicoService;

public class InterventoTecnicoServiceImpl implements InterventoTenicoService {

	@Autowired
	private InterventoTecnicoRepository interventoRepo;

	@Override
	public List<InterventoTecnico> findAll() {
		return interventoRepo.findAll();
	}

	@Override
	public InterventoTecnico save(InterventoTecnico interventoTecnico) {

		return interventoRepo.save(interventoTecnico);
	}

	@Override
	public void delete(Integer idInterventoTenico) {
		interventoRepo.deleteById(idInterventoTenico);
	}

}

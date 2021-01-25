package it.pinfo.magazzino.step;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import it.pinfo.magazzino.entity.VariabiliDb;
import it.pinfo.magazzino.entity.PartiRicambio;
import it.pinfo.magazzino.service.VariabiliDbService;
import it.pinfo.magazzino.service.PartiRicambioService;

@Component
public class Writer implements ItemWriter<List<PartiRicambio>> {

	PartiRicambioService partiServ;
	VariabiliDbService indiciServ;

	VariabiliDb variabileDb = null;

	public Writer(PartiRicambioService partiService, VariabiliDbService indiciService) {
		partiServ = partiService;
		indiciServ = indiciService;
	}

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void write(List<? extends List<PartiRicambio>> listaParti) throws Exception {
		for (List<PartiRicambio> parti : listaParti) {
			for (PartiRicambio parte : parti) {
				if (parte.getAggiornato() == true) {
					partiServ.save(parte);
				}
			}
		}
		variabileDb = new VariabiliDb();
		variabileDb = indiciServ.findById(1);
		variabileDb.setPrimoProcessoEffettuato(true);
		indiciServ.save(variabileDb);
	}

}
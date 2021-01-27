package it.pinfo.magazzino.step;

import java.util.ArrayList;
import java.util.List;
import org.springframework.batch.item.ItemProcessor;
import it.pinfo.magazzino.entity.InterventoTecnico;
import it.pinfo.magazzino.entity.Movimento;
import it.pinfo.magazzino.entity.PartiRicambio;
import it.pinfo.magazzino.service.PartiRicambioService;

public class Processor implements ItemProcessor<List<Object>, List<PartiRicambio>> {
	PartiRicambioService partiServ;

	public Processor(PartiRicambioService partiService) {
		partiServ = partiService;
	}

	@Override
	public List<PartiRicambio> process(List<Object> listOb) throws Exception {
		InterventoTecnico interventoExcel = null;
		Movimento movimentoExcel = null;
		PartiRicambio parteFunzionante = new PartiRicambio();
		List<InterventoTecnico> interventi = new ArrayList<InterventoTecnico>();
		List<Movimento> movimenti = new ArrayList<Movimento>();
		List<PartiRicambio> parti = new ArrayList<PartiRicambio>();

		for (Object ob : listOb) {
			System.out.println(ob.getClass());
			if (ob.getClass().getTypeName().equals("it.pinfo.magazzino.entity.InterventoTecnico")) {
				new InterventoTecnico();
				interventoExcel = (InterventoTecnico) ob;
				interventi.add(interventoExcel);
			} else {
				new Movimento();
				movimentoExcel = (Movimento) ob;
				movimenti.add(movimentoExcel);
			}
		}

		for (InterventoTecnico intervento : interventi) {
			parteFunzionante = partiServ.findByMatricola(intervento.getMatricolaParteNew());
			if (parteFunzionante != null) {
				if (intervento.getEsito().equals("POSITIVO") && intervento.getTipoIntervento().equals("SOST")) {
					parteFunzionante.setStato("LAVORATO");
					parteFunzionante.setAggiornato(true);
					parti.add(parteFunzionante);
				}
				if (intervento.getEsito().equals("POSITIVO") && intervento.getTipoIntervento().equals("RIPR")) {
					parteFunzionante.setStato("IN CARICO");
					parteFunzionante.setAggiornato(true);
					parti.add(parteFunzionante);
				}

				PartiRicambio parteGuasta = new PartiRicambio();
				parteGuasta.setMatricola(intervento.getMatricolaParteOld());
				parteGuasta.setCliente(intervento.getCliente());
				parteGuasta.setCondizioniParte("GUASTO");
				parteGuasta.setAggiornato(true);
				parti.add(parteGuasta);

			}

		}

		for (Movimento movimento : movimenti) {
			if (movimento.getTipoMovimento().equals("IN ENTRATA")) {
				PartiRicambio parteInEntrata = new PartiRicambio();
				parteInEntrata.setCondizioniParte(movimento.getCondizioniParte());
				parteInEntrata.setCliente(movimento.getCliente());
				parteInEntrata.setMatricola(movimento.getMatricolaParte());
				parteInEntrata.setDescParte(movimento.getDescrizioneParte());
				parteInEntrata.setAggiornato(true);
				parteInEntrata.setStato("IN CARICO");
				parti.add(parteInEntrata);

			} else {
				PartiRicambio parteInUscita = new PartiRicambio();
				parteInUscita = partiServ.findByMatricola(movimento.getMatricolaParte());
				if (parteInUscita != null) {
					parteInUscita.setStato("SPEDITO");
					parteInUscita.setAggiornato(true);
					parti.add(parteInUscita);
				}
			}
		}
		return parti;
	}
}

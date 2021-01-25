//package it.pinfo.magazzino.jobs;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import it.pinfo.magazzino.entity.PartiRicambioGuasteRispedite;
//import it.pinfo.magazzino.entity.PartiRicambioInCarico;
//import it.pinfo.magazzino.entity.PartiRicambioLavorate;
//import it.pinfo.magazzino.repository.PartiRicambioGuasteRispediteRepository;
//import it.pinfo.magazzino.repository.PartiRicambioInCaricoRepository;
//import it.pinfo.magazzino.repository.PartiRicambioLavorateRepository;
//
//@Component
//public class SeparaPartiJob {
//
//	@Autowired
//	private PartiRicambioInCaricoRepository partiInCaricoRepo;
//
//	@Autowired
//	private PartiRicambioLavorateRepository partiRicambioLavorateRepo;
//	
//	@Autowired
//	private PartiRicambioGuasteRispediteRepository partiRicambioGuasteRispediteRepo;
//
//	@Scheduled(cron = "*00 30 17 * * ?")
//	public void separaParti() {
//		String statoLavorato = "LAVORATO";
//		String statoRispedito = "RISPEDITO IN ASSISTENZA";
//		PartiRicambioLavorate parteLavorata = new PartiRicambioLavorate();
//		PartiRicambioGuasteRispedite parteRispedita = new PartiRicambioGuasteRispedite();
//
//		PartiRicambioInCarico parteInCarico;
//		List<Long> listIdLavorato = partiInCaricoRepo.listIdParti(statoLavorato);
//		List<Long> listIdRispedito = partiInCaricoRepo.listIdParti(statoRispedito);
//
//		if (listIdLavorato != null) {
//			for (Long id : listIdLavorato) {
//				parteInCarico = partiInCaricoRepo.findById(id).get();
//				parteLavorata.setIdParte(parteInCarico.getIdParte());
//				parteLavorata.setCondizioniParte(parteInCarico.getCondizioniParte());
//				parteLavorata.setDataMovimento(parteInCarico.getDataMovimento());
//				parteLavorata.setDescParte(parteInCarico.getDescParte());
//				parteLavorata.setMatricola(parteInCarico.getMatricola());
//				parteLavorata.setSocietaTrasporto(parteInCarico.getSocietaTrasporto());
//				parteLavorata.setStato(parteInCarico.getStato());
//				parteLavorata.setCliente(parteInCarico.getCliente());
//				// partiInCaricoRepo.save(parteInCarico);
//				partiRicambioLavorateRepo.save(parteLavorata);
//				partiInCaricoRepo.deleteById(id);
//				
//			}
//
//		}
//		if (listIdRispedito != null) {
//			for (Long id : listIdRispedito) {
//				parteInCarico = partiInCaricoRepo.findById(id).get();
//				parteRispedita.setIdParte(parteInCarico.getIdParte());
//				parteRispedita.setCondizioniParte(parteInCarico.getCondizioniParte());
//				parteRispedita.setDataMovimento(parteInCarico.getDataMovimento());
//				parteRispedita.setDescParte(parteInCarico.getDescParte());
//				parteRispedita.setMatricola(parteInCarico.getMatricola());
//				parteRispedita.setSocietaTrasporto(parteInCarico.getSocietaTrasporto());
//				parteRispedita.setStato(parteInCarico.getStato());
//				parteRispedita.setCliente(parteInCarico.getCliente());
//				// partiInCaricoRepo.save(parteInCarico);
//				partiRicambioGuasteRispediteRepo.save(parteRispedita);
//				partiInCaricoRepo.deleteById(id);
//			}
//
//		}
//
//	}
//}

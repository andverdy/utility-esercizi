package it.pinfo.magazzino.step;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import it.pinfo.magazzino.entity.VariabiliDb;
import it.pinfo.magazzino.entity.InterventoTecnico;
import it.pinfo.magazzino.entity.Movimento;
import it.pinfo.magazzino.service.VariabiliDbService;

public class Reader implements ItemReader<List<Object>> {

	VariabiliDbService variabiliDbServ;

	public Reader(VariabiliDbService variabiliDbService) {
		variabiliDbServ = variabiliDbService;
	}

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<Object> read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		String interventoExcelFilePath = "C:\\Users\\music\\OneDrive\\Desktop\\magazzino\\intervento.xls";
		List<Object> listOb = new ArrayList<Object>();
		FileInputStream inputStream = new FileInputStream(new File(interventoExcelFilePath));
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		int cellOrdernum = 0;
		HSSFSheet sheet = workbook.getSheetAt(0);
		System.out.println(sheet.getLastRowNum());
		Iterator<Row> iterator = sheet.iterator();
		int countRowsIntevento = 0;
		int countRows2Intevento = 1;

		if (sheet.getLastRowNum() > 0) {

			while (iterator.hasNext() && countRowsIntevento < sheet.getLastRowNum()) {
				Row nextRow = iterator.next();
				Iterator<Cell> cellIterator = nextRow.cellIterator();
				while (cellIterator.hasNext() && countRowsIntevento < sheet.getLastRowNum()) {
					InterventoTecnico intervento = new InterventoTecnico();
					Row row = sheet.getRow(countRows2Intevento);
					Cell cell = cellIterator.next();

					cell = row.getCell(cellOrdernum++);
					Integer idConverted = (int) cell.getNumericCellValue();
					intervento.setIdInterventoTecnico(idConverted);

					cell = row.getCell(cellOrdernum++);
					String esito = cell.getStringCellValue();
					intervento.setEsito(esito);

					cell = row.getCell(cellOrdernum++);
					String matricolaNew = cell.getStringCellValue();
					intervento.setMatricolaParteNew(matricolaNew);

					cell = row.getCell(cellOrdernum++);
					String matricolaOld = cell.getStringCellValue();
					intervento.setMatricolaParteOld(matricolaOld);

					cell = row.getCell(cellOrdernum++);

					String tipo = cell.getStringCellValue();
					intervento.setTipoIntervento(tipo);

					cell = row.getCell(cellOrdernum++);
					String cliente = cell.getStringCellValue();
					intervento.setCliente(cliente);

					listOb.add(intervento);
					cellOrdernum = 0;
					countRowsIntevento++;
					countRows2Intevento++;
				}
			}
		}
		workbook.close();
		inputStream.close();

		String movimentoExcelFilePath = "C:\\Users\\music\\OneDrive\\Desktop\\magazzino\\movimento.xls";
		FileInputStream inputStreamMovim = new FileInputStream(new File(movimentoExcelFilePath));
		HSSFWorkbook workbookMovim = new HSSFWorkbook(inputStreamMovim);
		int cellOrdernumMovim = 0;
		HSSFSheet sheetMovim = workbookMovim.getSheetAt(0);
		Iterator<Row> iteratorMovim = sheetMovim.iterator();
		int countRowsMovimento = 0;
		int countRows2Movimento = 1;

		if (sheetMovim.getLastRowNum() > 0) {

			while (iteratorMovim.hasNext() && countRowsMovimento < sheetMovim.getLastRowNum()) {
				Row nextRow = iteratorMovim.next();
				Iterator<Cell> cellIterator = nextRow.cellIterator();
				while (cellIterator.hasNext() && countRowsMovimento < sheetMovim.getLastRowNum()) {
					Movimento movimento = new Movimento();
					Row row = sheetMovim.getRow(countRows2Movimento);
					Cell cell = cellIterator.next();

					cell = row.getCell(cellOrdernumMovim++);
					Integer idConverted = (int) cell.getNumericCellValue();
					movimento.setIdMovimento(idConverted);

					cell = row.getCell(cellOrdernumMovim++);
					String descrizioneParte = cell.getStringCellValue();
					movimento.setDescrizioneParte(descrizioneParte);

					cell = row.getCell(cellOrdernumMovim++);
					String matricola = cell.getStringCellValue();
					movimento.setMatricolaParte(matricola);

					cell = row.getCell(cellOrdernumMovim++);
					String statoParte = cell.getStringCellValue();
					movimento.setCondizioniParte(statoParte);

					cell = row.getCell(cellOrdernumMovim++);
					String tipo = cell.getStringCellValue();
					movimento.setTipoMovimento(tipo);

					cell = row.getCell(cellOrdernumMovim++);
					String cliente = cell.getStringCellValue();
					movimento.setCliente(cliente);

					listOb.add(movimento);
					cellOrdernumMovim = 0;
					countRowsMovimento++;
					countRows2Movimento++;
				}
			}
		}

		VariabiliDb variabileDb = variabiliDbServ.findById(1);
		if (variabileDb.getPrimoProcessoEffettuato() == true) {
			variabileDb.setPrimoProcessoEffettuato(false);
			variabiliDbServ.save(variabileDb);
			System.out.println("spring batch basardo");
			return null;
		} else {
			return listOb;
		}

	}
}

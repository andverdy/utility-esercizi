package it.pinfo.magazzino.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.pinfo.magazzino.entity.PartiRicambio;
import it.pinfo.magazzino.repository.PartiRicambioRepository;
import it.pinfo.magazzino.service.ExcelFileDownloadService;

@Component
public class ExcelFileDownloadServiceImpl implements ExcelFileDownloadService {

	@Autowired
	private PartiRicambioRepository partiRicambioInCaricoRepository;

	@Override
	public HSSFWorkbook excelFileGenerate() throws IOException {
		List<PartiRicambio> listPartiRicambioInCarico = partiRicambioInCaricoRepository.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();
		if (listPartiRicambioInCarico != null) {
			int rownum = 0, index = 0, cellOrdernum = 0;
			HSSFSheet sheet = workbook.createSheet();
			FileOutputStream out = null;
			// String orderNumber = Integer.toString(order.getNumero());
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			//String dataParse = df.format(listPartiRicambioInCarico.get(index).getDataMovimento());
			Row row1 = sheet.createRow(rownum++);
			Cell cell1 = row1.createCell(cellOrdernum++);
			cell1.setCellValue("ID PARTE");
			cell1 = row1.createCell(cellOrdernum++);
			cell1.setCellValue("CONDIZIONI");
			cell1 = row1.createCell(cellOrdernum++);
			cell1.setCellValue("MATRICOLA");
			cell1 = row1.createCell(cellOrdernum++);
			cell1.setCellValue("DESCRIZIONE");
			cell1 = row1.createCell(cellOrdernum++);
			cell1.setCellValue("STATO");
			cell1 = row1.createCell(cellOrdernum++);
			cell1.setCellValue("CLIENTE");
			cellOrdernum = 0;

			while (index < listPartiRicambioInCarico.size()) {

				Row row = sheet.createRow(rownum++);
				Cell cell = row.createCell(cellOrdernum++);
				cell.setCellValue(listPartiRicambioInCarico.get(index).getIdParte());
				cell = row.createCell(cellOrdernum++);
				cell.setCellValue(listPartiRicambioInCarico.get(index).getCondizioniParte());
				cell = row.createCell(cellOrdernum++);
				cell.setCellValue(listPartiRicambioInCarico.get(index).getMatricola());
				cell = row.createCell(cellOrdernum++);
				cell.setCellValue(listPartiRicambioInCarico.get(index).getDescParte());
				cell = row.createCell(cellOrdernum++);
				cell.setCellValue(listPartiRicambioInCarico.get(index).getStato());
				cell = row.createCell(cellOrdernum++);
				cell.setCellValue(listPartiRicambioInCarico.get(index).getCliente());
				cellOrdernum = 0;
				index++;
			}
			try {
				String filePathName = "listaPartiInCarico";
				out = new FileOutputStream(filePathName);
				workbook.write(out);
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return workbook;
	}
}

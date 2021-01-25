package it.pinfo.magazzino.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.pinfo.magazzino.service.ExcelFileDownloadService;

@RestController
@RequestMapping("/api/download")
@CrossOrigin
public class ExcelFileDownloadController {

	@Autowired
	private ExcelFileDownloadService excelDownlService;

	@GetMapping("/excel-file")
	public void downloadExcelFile(HttpServletResponse response,
			HttpServletRequest request) throws IOException {

		HSSFWorkbook workbook = excelDownlService.excelFileGenerate();
		//String fileNamePath = (String) request.getAttribute("fileName");
		if (workbook != null) {
			response.setContentType("application/vnd.ms-excel");
			response.setHeader("Content-Disposition", "attachment; filename=");
			workbook.write(response.getOutputStream());
			workbook.close();
		}
	}
}
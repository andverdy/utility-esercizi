package it.pinfo.magazzino.service;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public interface ExcelFileDownloadService {

	public HSSFWorkbook excelFileGenerate() throws IOException;

}

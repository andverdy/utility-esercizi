//package algoritmi;
//package apache.poi;
//
//import java.io.FileOutputStream;
//import java.util.Iterator;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.util.CellReference;
//import org.apache.poi.xssf.streaming.SXSSFWorkbook;
//
//public class WriteListToExcelFile {
//
//	public static void main(String[] args) {
//		 Workbook wb = new SXSSFWorkbook(100); // creo il file (100 righe massimo in memoria)
//	      Sheet sh = wb.createSheet(); // creo un foglio
//
//	      for(int numRighe = 0; numRighe < 100; numRighe++){
//	         Row row = sh.createRow(numRighe); // creo una riga
//
//	         for(int cellnum = 0; cellnum < 10; cellnum++) {
//	            Cell cell = row.createCell(cellnum); // creo una cella all'interno della riga
//	            String indirizzoCella = new CellReference(cell).formatAsString(); // prendo le coordinate della cella
//	            cell.setCellValue(indirizzoCella); // setto il valore
//	         }
//	      }
//
//	      FileOutputStream out = new FileOutputStream("C:\\prova.xlsx");
//	      wb.write(out);
//	      out.close();
//	      System.out.println("File creato correttamente");
//	   }
//	}
//		

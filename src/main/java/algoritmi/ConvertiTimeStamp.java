package algoritmi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConvertiTimeStamp {

	public static void main(String[] args) {

	}

	public static String dateConvertToString(Long dateInput) {
		String result = "";
		if(dateInput != null) {
			Date date = new Date(dateInput);
			SimpleDateFormat df2 = new SimpleDateFormat("dd-MM-yyyy");
			result = df2.format(date);
		}
		return result;
	}

	public static String dateConvertToStringWithoutSeparators(Long dateInput) {
		String result = "";
		if(dateInput != null) {
			Date date = new Date(dateInput);
			SimpleDateFormat df2 = new SimpleDateFormat("yyyyMMdd");
			result = df2.format(date);
		}
		return result;
	}

	public static LocalDate convertLocalDateToStringDate(String date) {
		LocalDate localDate = null;
		if(date != null) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			localDate = LocalDate.parse(date, formatter);
		}
		return localDate;
	}

	// 197074800000
}

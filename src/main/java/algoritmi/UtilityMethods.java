//package algoritmi;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.commons.lang3.StringUtils;
//
//import lombok.experimental.UtilityClass;
//
//@UtilityClass
//public class UtilityMethods {
//	
//	protected static final String COBOL_DATE_NOTIME_FORMAT = "yyyy-MM-dd";
//
//	
//	public String dateConvertToString(Long dateInput) {
//		String result = StringUtils.EMPTY;
//		if (dateInput != null) {
//			Date date = new Date(dateInput);
//			SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
//			result = df2.format(date);
//		}
//		return result;
//	}
//
//	public String defaultStringField(Integer length) {
//		String result = "";
//		result += StringUtils.rightPad("", length, ' ');
//		return result;
//	}
//
//	public String defaultNumericField(Integer length) {
//		String result = StringUtils.leftPad("0", length, '0');
//		return result;
//	}
//
//	public static Long toLongFromCobolDate(String date) {
//		Long dateLong = null;
//
//		if (!date.trim().equals(StringUtils.EMPTY)) {
//			SimpleDateFormat f = new SimpleDateFormat(COBOL_DATE_NOTIME_FORMAT);
//			Date parseDate;
//			try {
//				parseDate = f.parse(date);
//			} catch (ParseException e) {
//				return dateLong;
//			}
//			dateLong = parseDate.getTime();
//
//		}
//		return dateLong;
//	}
//
//}

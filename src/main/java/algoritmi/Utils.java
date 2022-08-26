//package algoritmi;
//
//import java.sql.Timestamp;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import com.generaligroup.sag.batch.p111.model.flatFile.MasterDataFromDb;
//import com.sun.tools.javac.util.StringUtils;
//
//public class Utils {
//
//	public static String buildNumericFieldFromStringInput(String input, Integer length) {
//		String result = null;
//		if(input.equals(" ")) {
//			result = StringUtils.leftPad("", length, '0');
//		} else {
//			result = StringUtils.leftPad(input, length, '0');
//		}
//		return result;
//	}
//
//	public static String buildAlphanumericFieldFromStringInput(String input, Integer length) {
//		if(input == null) {
//			input = "";
//		}
//		String result = null;
//		if(input.equals(" ")) {
//			result = StringUtils.rightPad("", length, ' ');
//		} else {
//			if(input.length() > length) {
//				result = StringUtils.rightPad(input.substring(0, length), length, ' ');
//			} else {
//				result = StringUtils.rightPad(input, length, ' ');
//			}
//		}
//		return result;
//	}
//
//	public static String rightStringCut(String field, int index) {
//		String result = "";
//		if(field.length() > index) {
//			result = field.substring(0, index);
//			return result;
//		} else {
//			result = field;
//			return result;
//		}
//	}
//
//	public static String buildNumericFieldFromIntegerInput(Integer input, Integer length) {
//		return StringUtils.leftPad(String.valueOf(input), length, '0');
//	}
//
//	public static String buildNumericFieldFromLongInput(Long input, Integer length) {
//		return StringUtils.leftPad(String.valueOf(input), length, '0');
//	}
//
//	public static Integer findAfterDateByMediaContactEntityList(MasterDataFromDb masterToFlatFile, int usageCode) {
//		Timestamp createDate = null;
//		Integer datePosition = 0;
//		createDate = masterToFlatFile.getMediaContactEntityList().get(0).getCreateDate();
//
//		for(int i = 0; i < masterToFlatFile.getMediaContactEntityList().size(); i++) {
//			if((masterToFlatFile.getMediaContactEntityList().get(i).getCreateDate().after(createDate) || masterToFlatFile.getMediaContactEntityList().get(i).getCreateDate().equals(createDate)) && masterToFlatFile.getMediaContactEntityList().get(i).getUsageCode() != null && masterToFlatFile.getMediaContactEntityList().get(i).getUsageCode() == usageCode) {
//				createDate = masterToFlatFile.getMediaContactEntityList().get(i).getCreateDate();
//				datePosition = i;
//			}
//		}
//		return datePosition;
//	}
//
//	public static List<Integer> findAfterDateByPhoneContactEntityList(MasterDataFromDb masterToFlatFile, Integer[] type) {
//		Timestamp createDate = null;
//		List<Integer> datePosition = new ArrayList<Integer>();
//		createDate = masterToFlatFile.getPhoneContactEntityList().get(0).getCreateDate();
//
//		for(int i = 0; i < masterToFlatFile.getPhoneContactEntityList().size(); i++) {
//			if((masterToFlatFile.getPhoneContactEntityList().get(i).getCreateDate().after(createDate) || masterToFlatFile.getPhoneContactEntityList().get(i).getCreateDate().equals(createDate)) && masterToFlatFile.getPhoneContactEntityList().get(i).getTypeCode() != null && Arrays.stream(type).anyMatch(masterToFlatFile.getPhoneContactEntityList().get(i).getTypeCode()::equals)) {
//				createDate = masterToFlatFile.getPhoneContactEntityList().get(i).getCreateDate();
//				datePosition.add(i);
//			}
//		}
//		return datePosition;
//	}
//
//	public static Integer findAfterDateByPhoneContactEntityList(MasterDataFromDb masterToFlatFile, int typeCode) {
//		Timestamp createDate = null;
//		Integer datePosition = 0;
//		createDate = masterToFlatFile.getPhoneContactEntityList().get(0).getCreateDate();
//
//		for(int i = 0; i < masterToFlatFile.getPhoneContactEntityList().size(); i++) {
//			if((masterToFlatFile.getPhoneContactEntityList().get(i).getCreateDate().after(createDate) || masterToFlatFile.getPhoneContactEntityList().get(i).getCreateDate().equals(createDate)) && masterToFlatFile.getPhoneContactEntityList().get(i).getTypeCode() != null && masterToFlatFile.getPhoneContactEntityList().get(i).getTypeCode() == typeCode) {
//				createDate = masterToFlatFile.getPhoneContactEntityList().get(i).getCreateDate();
//				datePosition = i;
//			}
//		}
//		return datePosition;
//	}
//
//	public static String buildDateFieldFromInput(Timestamp input, Integer length) {
//		String result = StringUtils.leftPad("", length, ' ');
//		if(length == 8) {
//			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//			result = dateFormat.format(input);
//		}
//		if(length == 14) {
//			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//			result = dateFormat.format(input);
//		}
//		return result;
//	}
//
//	public static String defaultAlphanumericField(Integer length) {
//		String result = "";
//		result += StringUtils.rightPad("", length, ' ');
//		return result;
//	}
//
//	public static String defaultNumericField(Integer length) {
//		return StringUtils.leftPad("0", length, '0');
//	}
//
//}

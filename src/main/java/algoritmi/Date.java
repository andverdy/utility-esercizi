package algoritmi;

import java.sql.Timestamp;
import java.text.ParseException;

public class Date {

	public static void main(String[] args) throws ParseException {

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Timestamp timestamp2 = new Timestamp(1627543920);
		System.out.println(timestamp2.after(timestamp));
	}
}

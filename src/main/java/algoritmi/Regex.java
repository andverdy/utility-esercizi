package algoritmi;

public class Regex

{
	public static void main(String[] args) {
		 String str="+39sdfv /sdf68fsdfsf8999fsdf09";
		   String numberOnly= str.replaceAll("\\D+", "");
		   System.out.println(numberOnly);
		   
	}

}

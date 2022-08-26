package algoritmi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListChar {

	public static void main(String[] args) {

		List<Character> list = Arrays.asList('c', 'd', 'f');
		StringBuilder sb = new StringBuilder();
		sb.append(list.stream().map(ob -> createString(ob)).collect(Collectors.toList()));
		@SuppressWarnings("unused")
		String result = sb.toString();
		sb.replace(0, 1, "");
		sb.replace(sb.length()-1, sb.length(), "");
		sb.deleteCharAt(1);
		sb.deleteCharAt(3);
		sb.deleteCharAt(1);
		sb.deleteCharAt(2);
		System.out.println(sb.toString());
	}

	public static String createString(Character ch) {
		StringBuilder sb = new StringBuilder();
		sb.append(ch);
		return sb.toString();
	}
}

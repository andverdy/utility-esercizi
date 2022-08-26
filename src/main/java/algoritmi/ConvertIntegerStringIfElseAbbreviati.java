package algoritmi;

import java.util.Optional;

public class ConvertIntegerStringIfElseAbbreviati {

	public static void main(String[] args) {
		Integer initialResult = 24;
		Long result = 0L;
		String newString = toStringFromCobolData(initialResult);

		System.out.println(newString);

		result = initialResult == 24 && initialResult > result ? Long.valueOf(initialResult) : 0L;
	}

	protected static String toStringFromCobolData(Integer data) {
		return Optional.ofNullable(data).map(String::valueOf).orElse(" ");
	}

}

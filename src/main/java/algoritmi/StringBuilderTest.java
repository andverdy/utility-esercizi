package algoritmi;

public class StringBuilderTest {

	public static void main(String[] args) {

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("pillo");
		strBuilder.append("tillo");
		strBuilder.insert(0, "pippo");

		System.out.println(strBuilder);

	}
}

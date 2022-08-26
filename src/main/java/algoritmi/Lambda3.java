package algoritmi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda3 {

	public static void main(String[] args) {

		List<String> stepsNames = Arrays.asList("MyStepA", "MyStepB", "MyStepC", "MyStepD");
		@SuppressWarnings("unused")
		List<String> steps = stepsNames.stream().map(stepName -> createStep(stepName)).collect(Collectors.toList());

	}

	public static String createStep(String stepName) {
		return stepName + "-NewStep";
	}
}

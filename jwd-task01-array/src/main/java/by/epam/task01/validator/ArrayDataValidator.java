package by.epam.task01.validator;

public class ArrayDataValidator {
	
	public boolean arrayDataValidator (String lineData) {
		
		final String stringIntegersRegex = "(\\d+\\,\\s)+\\d+";
		
		return lineData.matches(stringIntegersRegex);
	}
}

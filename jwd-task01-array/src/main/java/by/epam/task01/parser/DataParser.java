package by.epam.task01.parser;

import java.util.List;

import by.epam.task01.validator.ArrayDataValidator;

public class DataParser {

	public int [] parse (List<String> data) {
		
		ArrayDataValidator validator = new ArrayDataValidator();
		final String NUMBER_SPLIT = ", ";
		
		for (String lineData : data) {
			
			if (validator.arrayDataValidator(lineData)) {
				String [] arrayData = lineData.split(NUMBER_SPLIT);
				int[] array = new int [arrayData.length];
				
				for (int i = 0; i < array.length; i++) {
					array[i] = Integer.parseInt(arrayData[i]);
				}
				return array;
			} 	
		}	
		return null;
	}

}

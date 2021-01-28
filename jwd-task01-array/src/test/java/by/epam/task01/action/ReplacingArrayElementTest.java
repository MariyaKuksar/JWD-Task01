package by.epam.task01.action;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.epam.task01.entity.ArrayInteger;
import by.epam.task01.exception.ArrayIntegerException;

public class ReplacingArrayElementTest {

	ReplacingArrayElement replace;
	ArrayInteger array;

	@BeforeClass
	public void setUp() {
		replace = new ReplacingArrayElement();
	}

	@BeforeMethod
	public void setUpBeforeMethod() {
		array = new ArrayInteger(new int[] { -1, 2, -3, 4, -5, 6, -7, 8, 9 });
	}

	@Test
	public void replaceEvenElementTest() throws ArrayIntegerException {
		replace.replaceEvenNumber(array, 55);
		int [] expected = { -1, 55, -3, 55, -5, 55, -7, 55, 9 };
		int [] actual = array.getArray();
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void replaceEvenElementExceptionTest() throws ArrayIntegerException {
		replace.replaceEvenNumber(null, 0);
	}

	@Test
	public void replaceNegativeElementWithZeroTest01() throws ArrayIntegerException {
		replace.replaceNegativeElementWithZero(array);
		int[] expected = { 0, 2, 0, 4, 0, 6, 0, 8, 9 };
		int[] actual = array.getArray();
		Assert.assertEquals(actual, expected);
	}

	@Test(expectedExceptions = ArrayIntegerException.class)
	public void replaceNegativeElementWithZeroExceptionTest() throws ArrayIntegerException {
		replace.replaceNegativeElementWithZero(null);
	}

	@AfterClass
	public void tierDown() {
		replace = null;
		array = null;
	}

}

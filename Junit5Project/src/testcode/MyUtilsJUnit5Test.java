package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import businesscode.MyUtils;
import businesscode.NAMES;

class MyUtilsJUnit5Test {

	/*
	 @ParameterizedTest annotation is used for Parameterized tests make it possible to run a 
	 test multiple times with different arguments.
	 we must declare at least one source that will provide the arguments for each invocation and 
	 then consume the arguments in the test method.
	 */
	
	/*
	@Test
	void testAdd() {
		fail("Not yet implemented");
	}*/

	/*
	Test with @ValueSource as Sources of Arguments
	@param inputText
	 */
	@ParameterizedTest
	@ValueSource(strings = {"madam","radar","dad"})
	void testIsPalindrome(String inputText) {
		assertTrue(()->MyUtils.isPalindrome(inputText),()->"Not Palindrome");
	}
	
	/**
	* Test with Custom enum as Sources of Arguments
	* @param names
	*/

	@ParameterizedTest
	@EnumSource(NAMES.class)
	void testWithCustomeEnumNames(NAMES names)
	{
		assertTrue(names.toString().length()==2);
	}
	
	/**
	* ParameterizedTest with external source method
	* @param fruitName
	*/
	
	@ParameterizedTest
	@MethodSource("businesscode.SourceProviders#friutMethodSource")
	void testWithExternalMethodSource(String fruit) 
	{
		assertNotNull(fruit);
	}
	
	/*
	@Test
	void testMultiply() {
		fail("Not yet implemented");
	}*/

}

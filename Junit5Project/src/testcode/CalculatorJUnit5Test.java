package testcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.hamcrest.CoreMatchers;

import businesscode.Calculator;

/*
 In Junit 5, test classes and test methods can declare custom 
 display names via Junit 5 @DisplayName annotation.
 */

@DisplayName("Calculator Test Case")
class CalculatorJUnit5Test {
//create an object of class to be tested
	
	Calculator calc;
	@BeforeEach
	void setUp() throws Exception {
		calc=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calc=null;
	}

	@Test
	@DisplayName("Calculator add Test")
	void testAdd() {
		assumeTrue(15>10);
		double result=calc.add(10.50, 10.32);
		assertEquals(20.82,result,0);
	}

	@Test
	@DisplayName("Calculator subtract Test")
	void testSubtract() {
		assumeFalse(5<1);
		double result=calc.subtract(100.5, 95);
		assertEquals(5.5,result,0);
	}

	@Test
	void testMultiply() {
		double result=calc.multiply(200, 2.5);
		
		String user="gosling";
		//assumingThat(true, user.equals("raj"));
		assumeThat("passes",user,CoreMatchers.is("gosling"));
		assertEquals(500,result,0);
	}
	
	

	@Test
	@DisplayName("Calculator divide Test")
	void testDivide() {
		double result=calc.divide(100, 10);
		assertEquals(10,result,0);
	}

}

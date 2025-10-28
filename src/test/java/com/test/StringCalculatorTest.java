package com.test;


import org.junit.jupiter.api.Test;

import com.main.StringCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
	
	@Test
    void testEmptyStringReturnsZero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }
	
	@Test
	void testSingleNumberReturnsValue() {
	    StringCalculator calc = new StringCalculator();
	    assertEquals(1, calc.add("1"));
	}

	@Test
	void testTwoNumbersCommaSeparated() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(3, calculator.add("1,2"));
	}

	@Test
	void testMultipleNumbersCommaSeparated() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(10, calculator.add("1,2,3,4"));
	}
	
	@Test
	void testNewLineAsDelimiter() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(6, calculator.add("1\n2,3"));
	}



}

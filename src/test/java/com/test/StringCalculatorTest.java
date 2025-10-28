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

}

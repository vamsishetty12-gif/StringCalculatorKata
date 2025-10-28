package com.main;

public class StringCalculator {
	
	public int add(String numbers) {
	    if (numbers.isEmpty()) return 0;

	    String delimiter = "[,\n]";
	    String numString = numbers;

	    if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("\n");
	        delimiter = numbers.substring(2, delimiterIndex);
	        numString = numbers.substring(delimiterIndex + 1);
	    }

	    String[] parts = numString.split(delimiter);
	    int sum = 0;
	    for (String num : parts) {
	        sum += Integer.parseInt(num);
	    }
	    return sum;
	}



}

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
	    StringBuilder negatives = new StringBuilder();

	    for (String num : parts) {
	        int n = Integer.parseInt(num);
	        if (n < 0) {
	            if (negatives.length() > 0) negatives.append(",");
	            negatives.append(n);
	        }
	        sum += n;
	    }

	    if (negatives.length() > 0) {
	        throw new IllegalArgumentException("negative numbers not allowed " + negatives);
	    }

	    return sum;
	}



}

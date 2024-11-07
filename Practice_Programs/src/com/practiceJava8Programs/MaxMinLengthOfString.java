package com.practiceJava8Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MaxMinLengthOfString {

	public static void main(String[] args) {
		
		//Find Highest length of given String using stream
		
		List<String> str=Arrays.asList("Ashwin","Ramesh","Nagelwar");
		String string = str.stream().max(Comparator.comparing(String::length)).get();
		System.out.println("Highest Lenght STring is: "+string);
		
		//Find Lowest length of given String using stream
		
		String string2 = str.stream().min(Comparator.comparing(String::length)).get();
		System.out.println("Lowest Lenght STring is: "+string2);
	}
}

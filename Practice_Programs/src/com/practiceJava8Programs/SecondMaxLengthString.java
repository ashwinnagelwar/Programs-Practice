package com.practiceJava8Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMaxLengthString {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("Ashwini","Ramesh","Nagelwar");
		String string = str.stream().sorted(Comparator.comparing(String::length)).skip(1).findFirst().get();
		System.out.println("Second Highest length of String is: "+string);
	}
}

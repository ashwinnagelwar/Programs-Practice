package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintUniqueCharacterFromString {

	//Print non-repeating/unique character from string
	public static void main(String[] args) {
		
		String s="jasbdhgaandjsbbbddsccc";
		String collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
				.stream().filter(x->x.getValue()==1).map(x->x.getKey()).collect(Collectors.joining());
		System.out.println(collect);
	}
}

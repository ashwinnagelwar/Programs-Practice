package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HigestOccurenceOfNo {

	public static void main(String[] args) {
		
		//find the highest occurence of number from array using stream api
		
		int array []={1,2,1,3,11,23,3,1,7,32,3,1,2};
		 Optional<Entry<Integer,Long>> max = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet().stream().max(Map.Entry.comparingByValue());
		 System.out.println(max);
		 
		 //find second highest occurence of number
		 Entry<Integer, Long> secondMax = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		 						.stream().sorted((num1,num2)->num2.getValue().compareTo(num1.getValue())).skip(1).findFirst().get();
		 System.out.println(secondMax);
		 
		 //find count of each string
		 String[] str= {"Ashwin","Ramesh","Nagelwar","Ashwin","Nagelwar"};
		 Map<String,Long> collect = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(collect);
		 
		 //find the occurrence of substring
		 String s1="I am Ashwin, I aM Ram";
		 Map<String,Long> collect2 = Arrays.stream(s1.split(" ")).map(word->word.replaceAll("^a-zA-Z", "").toLowerCase())
		 							 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(collect2);
		 
		 //find the longest substring in given string and longest string should contain all unique character
		 String s2="I am Ashwin Nagelwar";
		 HashSet<Character> set=new HashSet<>();
		 String string = Arrays.stream(s2.split(" ")).filter(
				 											 word->word.chars()
				 											 .mapToObj(ch->Character.toLowerCase((char)ch))
				 											 .collect(Collectors.toSet())
				 											 .size()==word.length())
				 		.max(Comparator.comparingInt(String::length)).get();
		 System.out.println(string);
		 
	}
}

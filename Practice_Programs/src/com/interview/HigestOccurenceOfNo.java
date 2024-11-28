package com.interview;

import java.util.Arrays;
import java.util.Comparator;
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
	}
}

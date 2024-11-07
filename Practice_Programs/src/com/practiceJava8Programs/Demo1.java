package com.practiceJava8Programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		//find first non repetitive char in string
		
		String input="ushhhasg";
		Optional<Entry<String,Long>> findFirst = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet()
		.stream().filter(x->x.getValue()==1).findFirst();
		System.out.println(findFirst);
		
		// find the occurrence of each character in string
		
		Map<String,Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		//find first repetitive char i string
		
		Optional<Entry<String,Long>> findFirst2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()> 1).findFirst();
		System.out.println("First repetitive char in string is "+findFirst2.get());
		
		//find all repetitive char in string
		
		Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().filter(x->x.getValue()>=2).forEach(c->System.out.println(c));
		
		//find all non-repetitive char in string
		
		List<String> list = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
		.filter(x->x.getValue()==1).map(x1->x1.getKey()).collect(Collectors.toList());
		System.out.println("all non-repetitive char in string is: "+list);
		
		//find the occurence of h
		Optional<Entry<String,Long>> findFirst3 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
		.filter(x->x.getKey().equals("h")).findFirst();
		System.out.println("Occurence of h is "+findFirst3.get());
		
		
		//find the occurence of each char in list words
		
		List<String> words=Arrays.asList("Ashwin","Nagelwar");
				
		Map<Character, Long> charFrequency = words.stream()
	            .flatMap(word -> word.chars().mapToObj(c -> (char) c)) // Flatten all characters into a single stream
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));// Group by character and count occurrences
		System.out.println("occurence of each char in list words: "+charFrequency);
		
		//find the words which start with A
		
		List<String> words2=Arrays.asList("Ashwin","Nagelwar","ashish","Abhay");
		List<String> collect2 = words2.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		System.out.println("ords which start with A: "+collect2.toString());
		
		//Reverse the words in sentence
		
		String sentence="My name is Ashwin";
		String string = Arrays.stream(sentence.split(" ")).map(x->new StringBuilder(x).reverse().toString()).collect(Collectors.toList()).toString();
		System.out.println(string);

	}
}

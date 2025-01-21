package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicate {
//list=1,1,2,2,2,3,4,5
	//Remove duplicate witout using distinct method in stream
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,1,2,2,3,3,4,5);
		HashSet<Integer> set=new HashSet<>();
		List<Integer> list2 = list.stream().filter(set::add).collect(Collectors.toList());
		
		System.out.println(list2);
		
		//Get list of duplicate numbers using stream
		List<Integer> list3 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
		.filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toList());
		System.out.println(list3);
		
		HashSet<Integer> set2=new HashSet<>();
		Set<Integer> set3 = list.stream().filter(x->!set2.add(x)).collect(Collectors.toSet());
		System.out.println("Duplicate numbers: "+set3.stream().collect(Collectors.toList()));
	}
}

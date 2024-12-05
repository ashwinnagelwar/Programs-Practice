package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortListOfSringFromEnd {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc321", "pqr121", "lmn112", "bab412", "aba402");
//		output=lmn112, pqr121, abc321, aba402, bab412
		
		List<String> collect = strList.stream().sorted((a,b)->a.substring(3).compareTo(b.substring(3))).collect(Collectors.toList());
		System.out.println(collect);
		
		//conver list of list into single list
		List<List<Integer>> asList = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6)) ;
		Stream<Integer> flatMap = asList.stream().flatMap(x->x.stream());
		System.out.println(flatMap.toList());
	}
}

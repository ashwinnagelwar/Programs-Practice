package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOddSorting {

//	Even numbers in ascending, Odd numbers in descending. Each should come one after the other.

//Sample Input : 3,4,7,2,5,1,9,0,8
//Sample Output : [0, 9, 2, 7, 4, 5, 8, 3, 1]
	
	//Create List for 50 numbers using stream api
//	List<Integer> collect = IntStream.range(1, 50).boxed().collect(Collectors.toList());//
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,7,2,5,1,9,0,8);
		
		List<Integer> evenList = list.stream().filter(x->x%2==0).sorted().collect(Collectors.toList());
		List<Integer> oddList = list.stream().filter(x->x%2!=0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		List<Integer> result=new ArrayList<>();
		
		int maxSize=Math.max(evenList.size(), oddList.size());
		
		for(int i=0;i<maxSize;i++)
		{
			if(i<evenList.size())
			{
				result.add(evenList.get(i));
			}
			if(i<oddList.size())
			{
				result.add(oddList.get(i));
			}
		}
		
		System.out.println(result);
		
	}
}

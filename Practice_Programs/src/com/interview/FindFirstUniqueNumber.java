package com.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstUniqueNumber {

	//find first unique number from list
	public static void main(String[] args) {
		
		//using stream api
		List<Integer> list = Arrays.asList(12,23,12,34,56,67,56);
		
		Integer integer = list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
					.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).findFirst().get();
		
		System.out.println(integer);
		
		//using normal way
		
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();
		for(int number:list)
		{
			if(map.containsKey(number))
			{
				map.put(number, map.get(number)+1);
			}else
			{
				map.put(number, 1);
			}
		}
		
		int count=1;
	for(Map.Entry<Integer, Integer> entry:map.entrySet())
	{
		if(entry.getValue()==1 && count <=1)
		{
			System.out.println(entry.getKey());
			count++;
		}
	}
		
		
	}
}

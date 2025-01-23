package com.interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
        map.put("Apple", 5);
        map.put("Banana", 2);
        map.put("Cherry", 8);
        map.put("Date", 4);
        
        //ascending order
        
        Map<String, Integer> collect=map.entrySet().stream().sorted((x1,x2)->x1.getValue().compareTo(x2.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->newValue,LinkedHashMap::new));
        System.out.println(collect);
        
        //descending order
        LinkedHashMap<String,Integer> collect2 = map.entrySet().stream().sorted((x1,x2)->x2.getValue().compareTo(x1.getValue()))
        				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->newValue,LinkedHashMap::new));
        System.out.println(collect2);
	}
}

package com.interview;

import java.util.Arrays;
import java.util.HashMap;

public class CustomizedSort {

//	Sort the array in such way 6s appear first,
//	followed by all 9s, 
//	followed by all 1s, 
//	followed by all 15s, 
//	followed by all 7s and last all 12s.
	 
	//Eg: 1,15,6,12,7,1,15,6,12,9,15,1,7,12,6,9,7
	
	public static void main(String[] args) {
		int []arr= {1,15,6,12,7,1,15,6,12,9,15,1,7,12,6,9,7};
		
		//create Hashmap to store position of each number as per required output
		HashMap< Integer, Integer> map=new HashMap<>();
		map.put(6, 0);
		map.put(9, 1);
		map.put(1, 2);
		map.put(15, 3);
		map.put(7, 4);
		map.put(12, 5);
		
		//We have stored position as value for each number in hashmap
		
		int[] array = Arrays.stream(arr).boxed().sorted((a,b)->map.get(a).compareTo(map.get(b))).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(array));
		
	}
}

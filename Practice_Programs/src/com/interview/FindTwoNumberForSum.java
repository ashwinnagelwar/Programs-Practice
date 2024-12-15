package com.interview;

import java.util.HashSet;

public class FindTwoNumberForSum {

	public static void main(String[] args) {
		//Find Two numbers whose sum is 19 in array//sum can be any number
		int[] arr = {10, 5, 7, 3, 12, 8, 9};
	    int targetSum = 19;
	    
	    HashSet<Integer> set=new HashSet<>();
	    
	    for(int num:arr)
	    {
	    	int number=targetSum-num;
	    	if(set.contains(number))
	    	{
	    		System.out.println("The two number whose sum "+targetSum+ " is "+number +"and "+num);
	    		break;
	    	}else
	    	{
	    		set.add(num);
	    	}
	    	
	    }
	}
	

}

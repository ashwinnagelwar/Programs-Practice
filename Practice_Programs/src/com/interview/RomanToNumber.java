package com.interview;

import java.util.HashMap;

public class RomanToNumber {

	public static void main(String[] args) {
		String input="MCMLXXXVII";
		HashMap<Character, Integer>romanMap=new HashMap<>();
		romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int number=0;
        int prevValue=0;
        
        for(int i=input.length()-1;i>=0;i--)
        {
        	int currentvalue=romanMap.get(input.charAt(i));
        	if(currentvalue<prevValue)
        	{
        		number=number-currentvalue;
        	}else
        	{
        		number=number+currentvalue;
        	}
        	
        	prevValue=currentvalue;
        }
        
        System.out.println(number);
	}
}

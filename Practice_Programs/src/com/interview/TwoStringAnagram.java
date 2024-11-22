package com.interview;

import java.util.Arrays;
import java.util.Collections;

public class TwoStringAnagram {

	public static void main(String[] args) {
		String s1="RaceCar";
		String s2="CarRace";
		
		//using stream API
//		s1.chars().mapToObj(null)
		
		//using normal way
		boolean normalWayCheck = normalWayCheck(s1,s2);
		if(normalWayCheck)
		{
			System.out.println("String is Anagram");
		}else
		{
			System.out.println("String is not Anagram");
		}
		
	}
	
	public static boolean normalWayCheck(String s1,String s2)
	{
		boolean result = false;
		if(s1.length()!=s2.length())
		{
			return false;
		}else if(s1.length()==s2.length())
		{
			char[] s1Char = s1.toCharArray();
			char[] s2Char = s2.toCharArray();
			Arrays.sort(s1Char);
			Arrays.sort(s2Char);
			
			boolean equals = Arrays.equals(s1Char, s2Char);
			result=equals;
		}
		return result;
	}
}

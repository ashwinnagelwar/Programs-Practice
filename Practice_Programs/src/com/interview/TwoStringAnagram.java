package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class TwoStringAnagram {

	public static void main(String[] args) {
		String s1="RaceCar";
		String s2="CarRace";
		
		//using stream API
		boolean streamApiWayCheck = streamApiWayCheck(s1,s2);
		if(streamApiWayCheck)
		{
			System.out.println("String is Anagram");
		}else
		{
			System.out.println("String is not Anagram");
		}
		
		
		//using normal way
//		boolean normalWayCheck = normalWayCheck(s1,s2);
//		if(normalWayCheck)
//		{
//			System.out.println("String is Anagram");
//		}else
//		{
//			System.out.println("String is not Anagram");
//		}
		
	}
	
	public static boolean streamApiWayCheck(String s1,String s2)
	{
		boolean equals = s1.chars().boxed().sorted().collect(Collectors.toList()).equals(s2.chars().boxed().sorted().collect(Collectors.toList()));
		return equals;
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

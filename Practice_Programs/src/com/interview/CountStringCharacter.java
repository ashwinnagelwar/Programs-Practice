package com.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountStringCharacter {

	public static void main(String[] args) {
		String s="abbcccdddd";
		
		//Using normal java 7
		StringBuffer buffer=new StringBuffer();
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			
			if( i+1<s.length() && s.charAt(i)==(s.charAt(i+1)))
			{
			count++;
			
			}else
			{
				buffer.append(s.charAt(i));
				buffer.append(count);
				count=1;
			}
		}
		
		System.out.println(buffer);
		
		//Using Java 8 stream api
		
		String string = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
						.stream().map(x->new StringBuffer().append(x.getKey()+x.getValue())).collect(Collectors.joining());
		System.out.println(string);
	}
	
}

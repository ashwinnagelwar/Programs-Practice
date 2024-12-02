package com.interview;

public class StringAppend {

	public static void main(String[] args) {
		String input="aaaabbbccd";
		System.out.println(input);
		StringBuffer str1=new StringBuffer();
		int count=1;
		for(int i=0;i<input.length();i++)		
		{
			if(i+1<input.length() && input.charAt(i)==input.charAt(i+1))
			{
				count++;
			}else 
			{
				str1.append(input.charAt(i));
				str1.append(count);
				count=1;
			}
		}
		
		String output = str1.toString();
		System.out.println(output);
	}
}

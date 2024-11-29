package com.interview;

public class CountStringCharacter {

	public static void main(String[] args) {
		String s="abbcccdddd";
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
		
	}
	
	
}

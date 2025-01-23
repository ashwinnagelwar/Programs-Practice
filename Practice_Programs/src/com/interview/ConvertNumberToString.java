package com.interview;

public class ConvertNumberToString {

	
	//convert input number into String
	//eg. input=123 and output=One Hundred Twenty Three
	private static final String LessThanTwenty[]= {" ","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ",
			"Nine ","Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
	
	private static final String Ten[]= {" ","","Tewnty","Thirty","Fourty","Fifty","Sixty","Seventy","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	
	public static void main(String[] args) {
		int input=546;
		String string = convertToString(input);
		System.out.println(string);
	}

	private static String convertToString(int input) {
		StringBuilder builder=new StringBuilder();
		if(input==0)
		{
			return "Zero";
		}
		
		if(input>=100)
		{
			builder.append(LessThanTwenty[input/100]).append("Hundred ");
			input=input%100;
		}
		
		if(input>=20)
		{
			builder.append(Ten[input/10]).append(" ");
			input=input%10;
		}
		
		if(input>0)
		{
			builder.append(LessThanTwenty[input]).append(" ");
			
		}
		
		return builder.toString();
		
	}
}

package com.interview;

public class FindNoEvenOrOddWithoutModulus {

	//find the given number is even or odd without using modulus operator like (num%2==0)
	
	public static void main(String[] args) {
		int number=21;
		if((number & 1)==0)
				{
					System.out.println("Given Number: "+number+" is Even");
				}else
				{
					System.out.println("Given Number: "+number+" is Odd");
				}
		
		//so how number & 1==0 works?
		//we perform bitwise operation between number and 1
		//first convert number and 1 in bitwise binary format
		//21=10101, 1=00001
		//now if 21 & 1==0 then the number is even else odd
		//every bit of given number and 1 is checked and if first bit from right side which represent 1st position of bit of both number
		//is compared with & operator and if comparison comes 1, when both operator is 1, then number is odd else any one operator is zero then 
		//& operator comparison gives 0 then it is even.
	}
}

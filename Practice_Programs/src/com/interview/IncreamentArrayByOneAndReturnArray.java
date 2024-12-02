package com.interview;

import java.util.Arrays;

public class IncreamentArrayByOneAndReturnArray {

	public static void main(String[] args) {
//		You are given a large integer represented as an integer 
//		array digits, where each digits[i] is the ith digit of the integer.
//		The digits are ordered from most significant to least significant in left-to-right order. 
//		The large integer does not contain any leading 0's.
//		Increment the large integer by one and return the resulting array of digits.
//		Example 1:
//		Input: digits = [1,2,3]
//		Output: [1,2,4]
//		Explanation: The array represents the integer 123.
//		Incrementing by one gives 123 + 1 = 124.
//		Thus, the result should be [1,2,4].
//		Constraints:
//		1 <= digits.length <= 100
//		0 <= digits[i] <= 9
//		digits does not contain any leading 0's.\  
		int [] input={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,9,9,9};
		int[] incrementedArray = getIncrementedArray(input);
		System.out.println(Arrays.toString(incrementedArray));
	}

	private static int[] getIncrementedArray(int[] input) {
		//to increament array by one we have to go from last to first index and increment the last value by one
	for(int i=input.length-1;i>=0;i--)
	{
		if(input[i]<9)
		{
			input[i]=input[i]+1;
			return input;
		}
		//if digit is 9, then convert it to 0 by increamenting it by 1, and then go to previous index number to increment by 1
		input[i]=0;
	}
	
	//this following code will run if above all digit are 9 and only first digit need to update
	
	//if all digits are 9 and we converted it to 0, then first digit need to make 1
	int [] result=new int[input.length+1];//all elements will be 0 at this stage
	result[0]=1;//only first element will become 1 and all will be zero
	return result;
		
	}
}

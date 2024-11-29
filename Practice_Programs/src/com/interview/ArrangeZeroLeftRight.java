package com.interview;

public class ArrangeZeroLeftRight {

	public static void main(String[] args) {
		int[]arr= {1,5,2,6,0,2,0,4,0,5};
		int []arr2=new int[arr.length];
//		int count=0;
		
		
		//arrange all zeros to right
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]!=0)
//			{
//				arr2[count]=arr[i];
//				count++;
//			}
//		}
//		
//		while(count<arr.length)
//		{
//			arr2[count]=0;
//			count++;
//		}
//		
//		for(int x:arr2)
//		{
//			System.out.print(x);
//		}
		
		//Arrange all zeroes to left
		int count=arr.length-1;
		int length1 = arr.length-1;
		for(int i=length1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count--;
			}
		}
		
		while(count>=0)
		{
			arr[count]=0;
			count--;
		}
		for(int x:arr)
			{
				System.out.print(x);
			}
	
	}
}

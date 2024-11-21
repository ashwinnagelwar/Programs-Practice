package com.interview;

public class FindSmallNoInRotatedSortedArray {

	//find smallest/largets element in rotated sorted array 
	public static void main(String[] args) {
		
		int [] num= {4,5,6,7,0,1,2};
		int start=0;
		int end=num.length-1;
		
		//for smallest number
//		while(start<end)
//		{
//			int mid=start+(end-start)/2;
//			if(num[mid]>num[end])
//			{
//				start=mid+1;
//			}else
//			{
//				end=mid;
//			}
//			
//		}
//		System.out.println(num[start]);
		
		//for largest number
		while (start < end) {
		    int mid = start + (end - start) / 2;
		    if (num[mid] > num[end]) {
		        start = mid; // Move start to mid because mid might be the largest
		    } else {
		        end = mid - 1; // Discard mid because it cannot be the largest
		    }
		}
		System.out.println(num[start]);
	}
}

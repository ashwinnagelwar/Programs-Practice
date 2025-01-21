package com.interview;

import java.util.HashMap;

public class TwoSum {

	//find the index of two number from array whose total is given target number
	public static void main(String[] args) {
		
		int target=9;
		int nums[]= {2,7,11,15};
		int[] twoSum = getTwoSum(nums,target);
		for(int x:twoSum)
		{
			System.out.print(x);
		}
		
	}
	static int[] getTwoSum(int[] nums,int target)
	{
	HashMap<Integer, Integer> map=new HashMap<>();
	for(int i=0;i<nums.length;i++)
	{
		int num=target-nums[i];
		if(map.containsKey(num))
		{
			return new int[] {map.get(num),i};
		}else
		{
			map.put(nums[i], i);
		}
	}
	return new int[] {};
	}
}

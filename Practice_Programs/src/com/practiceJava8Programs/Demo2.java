package com.practiceJava8Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		//Check that two given strings are anagram or not(char in two string is same and length of string is same)
		
		String s1="Silent";
		String s2="Listen";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] s3 = s1.toCharArray();
		char[] s4 = s2.toCharArray();
		Arrays.sort(s3);
		Arrays.sort(s4);
		
		if(Arrays.equals(s3, s4))
		{
			System.out.println("Given String is Anagram");
		}else
		{
			System.out.println("Given String is not Anagram");
		}
		
		//Swap two number without third variable
		
		int a1=10;
		int a2=34;
		
		a1=a1+a2;
		a2=a1-a2;
		a1=a1-a2;
		System.out.println("a1: "+a1+" a2: "+a2);
		
		//find the given number is Amstrong or not, Amstrong number is a number which is equal to the sum of qube of all digits in that number
		int num=153;
		int temp=num;
		int res=0;
		int sum=0;
		while(num>0)
		{
			res=num%10;
			sum=sum+(res*res*res);
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Given Number "+temp +" is Amstrong");
		}else
		{
			System.out.println("Given number is not Amstrong");
		}
		
		//check if given number is palindrom or not
		
		int num1=12321;
		int rev=0;
		int temp1=num1;
		int rem=0;
		
		while(temp1>0)
		{
			rem=temp1%10;
			rev=(rev*10)+rem;
			temp1=temp1/10;
		}
		if(rev==num1)
			
		{
			System.out.println("Given Number "+num1 +" is palindrom");
		}
		
		
		//find duplicates from given array
		
		String[] strArr= {"a","b","c","a"};
		HashSet<String> hashSet=new HashSet<>();
		for(String s:strArr)
		{
			hashSet.add(s);
		}
		System.out.println(hashSet);
		
		//find first and second smallest number from array
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,2,1,3);
		Integer smallest = list.stream().sorted(Comparator.naturalOrder()).distinct().findFirst().get();
		Integer secondSmallest = list.stream().sorted(Comparator.naturalOrder()).distinct().skip(1).findFirst().get();
		System.out.println("First Smallest Number: "+smallest+" and Second Smallest number is: "+secondSmallest);
		
		//find first and second largest number from array
		
		Integer largest = list.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().get();
		Integer secondLargest = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("First largest Number: "+largest+" and Second largest number is: "+secondLargest);
		
		//find sum of even numbers without using sum method
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8);
		Integer integer = list2.stream().filter(x->x%2==0).reduce((a,b)->a+b).get();
		System.out.println(integer);
		
		//Seperate even and odd numbers from list

		List<Integer> list3 = Arrays.asList(1,2,3,4,5,2,1,3);
		List<Integer> evenList = list3.stream().filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> oddList = list3.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println("Even Number List : "+evenList+" and SOdd Number List: "+oddList);
	}
}

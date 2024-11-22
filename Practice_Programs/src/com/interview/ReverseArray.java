package com.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {
		int[]arr= {1,4,6,7,4,8};
		int[] reversedArr = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i]) // Reverse the index
                .toArray();
		for(int x:reversedArr)
		{
			System.out.print(x);
		}
	}
	
}

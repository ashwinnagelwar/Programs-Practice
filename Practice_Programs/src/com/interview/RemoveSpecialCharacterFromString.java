package com.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveSpecialCharacterFromString {

	public static void main(String[] args) {
		
		String s="Hel#*loWo%!rld";
		
		//Remove Special Character from String
		
	
		String removedString = s.chars().filter(ch->Character.isLetterOrDigit((char)ch))
				.mapToObj(x->String.valueOf((char)x)).collect(Collectors.joining());
		
		System.out.println("String after removal of special character "+removedString);
		
		//Get special character from string
		
		
		String specialCharacterString = s.chars().filter(ch->!Character.isLetterOrDigit((char)ch)).mapToObj(x->String.valueOf((char)x))
		.collect(Collectors.joining());
		System.out.println("Special Character String "+specialCharacterString);
	}
}

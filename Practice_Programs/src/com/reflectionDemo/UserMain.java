package com.reflectionDemo;

import java.lang.reflect.Field;

public class UserMain {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		User user=new User(1, "Ashwin");
		System.out.println("Before Reflection: "+user.getName());
		Field declaredField = User.class.getDeclaredField("name");
		declaredField.setAccessible(true);
		
		declaredField.set(user, "Ramesh");
		System.out.println("After Reflection to change name value: "+user.getName());
	}
}

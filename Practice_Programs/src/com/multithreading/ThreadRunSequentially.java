package com.multithreading;

import java.util.HashMap;

public class ThreadRunSequentially{

	//run t1,t2,t3 thread sequentially first t1, then t2 and last t3

	public static void main(String[] args)  {
		
	
		Thread t1=new Thread(()->{System.out.println("Thread t1 is running");});
		Thread t2=new Thread(()->{System.out.println("Thread t2 is running");});
		Thread t3=new Thread(()->{System.out.println("Thread t3 is running");});
		
		 try {
			 t1.start();
			t1.join();
			t2.start();
			 t2.join();
			 t3.start();
			 t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		
		
	}
}

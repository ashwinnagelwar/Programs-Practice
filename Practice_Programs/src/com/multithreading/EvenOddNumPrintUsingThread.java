package com.multithreading;

import com.interview.FindNoEvenOrOddWithoutModulus;

public class EvenOddNumPrintUsingThread extends Thread{

	private final Object lock;
	private static int number=1;
	private int threadType;
	

	public EvenOddNumPrintUsingThread(Object lock, int threadType) {
		super();
		this.lock = lock;
		this.threadType = threadType;
	}



	@Override
	public void run() {
		
		while(number<=10)
		{
			synchronized (lock) {
				if(number%2==threadType)
				{
					System.out.println(Thread.currentThread().getName()+":" +number);
					number++;
					lock.notify();
				}else
				{
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Object lock=new Object();
		
		EvenOddNumPrintUsingThread OddThread=new EvenOddNumPrintUsingThread(lock,1);
		EvenOddNumPrintUsingThread evenThread=new EvenOddNumPrintUsingThread(lock, 0);
		
		OddThread.setName("Odd Thread");
		evenThread.setName("Even Thread");
		
		OddThread.start();
		evenThread.start();
	}

	
	
}

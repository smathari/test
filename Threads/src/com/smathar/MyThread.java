package com.smathar;

public class MyThread extends Thread {

	MyThread()
	{
		super("my extending thread");
		System.out.println("my thread created : " + this);
		
		start();
	}
	
	MyThread(String threadName)
	{
		super(threadName);
		
		System.out.println("my thread created : " + this);
		
		start();
	}

	public void run(){  
		
		
		try
	     {
	        for (int i=0 ;i<10;i++)
	        {
	           System.out.println(this.getName() + " Printing the count from " + i);
	           Thread.sleep(1000);
	        }
	     }
	     catch(InterruptedException e)
	     {
	        System.out.println("my thread interrupted");
	     }
	     System.out.println("My thread run is over"  + this.getName());
	     
	}   


}

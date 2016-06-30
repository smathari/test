package com.smathar;

public class MyRunnableThread implements Runnable{

	
	
	private String threadName;
	
	public MyRunnableThread(){

		System.out.println("Runnable constructer default");
	}
	
	public MyRunnableThread(String threadName){
		
		System.out.println("Runnable constructer custom :"+ threadName);
		
		this.threadName = threadName;
						
	}
	
	
	
	@Override
	public void run() {
		
		
		
		try
	     {
	        for (int i=0 ;i<10;i++)
	        {
	           System.out.println(this.threadName + " Printing the count from " + i);
	           Thread.sleep(1000);
	        }
	     }
	     catch(InterruptedException e)
	     {
	        System.out.println("my thread interrupted");
	     }
	     System.out.println("My runnable run is over : " + this.threadName  );
	     
		
	}

}

package com.smathar;

public class Main {

	public static void main(String[] args) {
		System.out.println("Application Starts Running");

		runThreads();
		
		System.out.println("Thread over . Next Runnable");
		
		
		runRunnables();

		System.out.println("Application Stops Running");



	}

	private static void runThreads(){


		for(int i=0; i<5 ; i++){
			MyThread mythread = new MyThread("thread "+i);
		}


	}

	private static void runRunnables(){

		MyRunnableThread myrunthread = null;

		for(int i=0; i<5 ; i++){
			myrunthread = new MyRunnableThread("runnable "+i);
			Thread mythread = new Thread(myrunthread);
			mythread.start();	
		}


	}

}

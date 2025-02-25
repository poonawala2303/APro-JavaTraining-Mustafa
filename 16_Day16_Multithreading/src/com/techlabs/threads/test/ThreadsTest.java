package com.techlabs.threads.test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsTest 
{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		// creating thread using Executor interface and implementing Runnable interface 
		
		Runnable myTask = ()-> System.out.println("Inside a Thread");
		
		ExecutorService service = Executors.newSingleThreadExecutor(); // same for callable
		
		service.execute(myTask);
		
		Future<?> future = service.submit(myTask);
		
		// creating thread using Executor interface and implementing Callable interface 
		
		Random random = new Random();
		
		Callable callableTask = ()-> random.nextInt() ;
		
		Future<Integer> result = service.submit(callableTask);
		
		System.out.println(result.get());
		
		// end of Program and shutting down the executor service
		
		System.out.println("End of Program");
		service.shutdown();
	}
	
	
}

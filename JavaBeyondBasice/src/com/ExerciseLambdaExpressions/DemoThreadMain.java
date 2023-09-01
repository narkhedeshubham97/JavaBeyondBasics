package com.ExerciseLambdaExpressions;

public class DemoThreadMain {

	public static void main(String[] args) {
//		 Thread threadInstance = new Thread(new Runnable() {
//	            //run --- implementation
//	            public void run() {
//	                System.out.println(" Its me from thread");
//	            }
//			});
//			threadInstance.start();

//		or

		new Thread(() -> System.out.println("Its me from thread")).start();
	}

}

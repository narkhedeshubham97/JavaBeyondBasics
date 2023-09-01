package ExerciseExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable {
	private int counter;

	public int incrementCtr() {
		return counter++;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(incrementCtr());
	}

	public Task(int counter) {
		this.counter = counter;
	}

	public static void main(String[] args) throws InterruptedException {
		Task obj = new Task(5);
		ExecutorService Service = Executors.newFixedThreadPool(1);
		Runnable r = () -> {
			System.out.println("After increment:" + obj.incrementCtr());
		};
		for (int i = 0; i < 5; i++) {

			Service.execute(r);
		}

	}

}

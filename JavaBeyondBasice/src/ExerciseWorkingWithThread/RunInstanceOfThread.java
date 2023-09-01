package ExerciseWorkingWithThread;

class ThreadAndRunnable extends Thread {

	public void run() {

		System.out.println("Hello Thread");
		super.run();
	}
}

public class RunInstanceOfThread {

	public static void main(String args[]) {
		ThreadAndRunnable t1 = new ThreadAndRunnable();
		ThreadAndRunnable t2 = new ThreadAndRunnable();
		ThreadAndRunnable t3 = new ThreadAndRunnable();
		ThreadAndRunnable t4 = new ThreadAndRunnable();
		ThreadAndRunnable t5 = new ThreadAndRunnable();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		;

	}

}

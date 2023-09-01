package ExerciseThreadSynchronization;

public class DataContainer {

	private int intData;

	public synchronized int get() {
		return intData;
	}

	public synchronized void put(int value) {
		this.intData = value;
	}

	public static void main(String[] args) {

		DataContainer dc = new DataContainer();
		Runnable r = () -> {
			synchronized (dc) {

				dc.put(434);

			}
		};

		Runnable r1 = () -> {
			synchronized (dc) {
				System.out.println(dc.intData);
			}
		};

		var Producer = new Thread(r);
		var Consumer = new Thread(r1);

		Producer.start();
		Consumer.start();
	}
}

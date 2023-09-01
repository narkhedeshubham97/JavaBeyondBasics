package serialization;

class DataContainer {

	private int intData;

	public synchronized int get() {

		return intData;

	}

	public synchronized void put(int value) {

		intData = value;

	}

}

class Producer extends Thread {

	DataContainer dcontainer;

	int putting;

	public Producer(DataContainer datac, int put) {

		this.dcontainer = datac;

		this.putting = put;

	}

	@Override

	public void run() {

		dcontainer.put(putting);

	}

}

class Consumer extends Thread {

	DataContainer dcontainer;

	public Consumer(DataContainer datac) {

		this.dcontainer = datac;

	}

	@Override

	public void run() {

		System.out.println(dcontainer.get());

	}

}

public class ProducerAndConsumerThreads {

	public static void main(String[] args) {

		DataContainer dc = new DataContainer();

		Producer p = new Producer(dc, 2000);

		Consumer c = new Consumer(dc);

		p.start();

		// for Serialized execution(not recommended),use synchronized instead

//    try {

//        p.join();

//        }catch (InterruptedException e) {

//            System.out.println("Some exception of:"+e.getLocalizedMessage());

//        }

		c.start();

	}

}
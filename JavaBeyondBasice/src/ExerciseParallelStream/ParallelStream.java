package ExerciseParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<Integer>();

		for (int i = 1; i <= 1000; i++) {

			numList.add(i);

		}

		int t1 = (int) System.currentTimeMillis();

//		numList.stream().filter((x) -> x % 2 == 0).forEach(x -> {
//			System.out.print(x + " ");
//		});

		Stream<Integer> st = numList.stream().filter((s) -> s % 2 == 0);
		System.out.println("Total number of even number are : " + st.count());

		int t2 = (int) System.currentTimeMillis();

		System.out.println("Total time for streams:" + (t2 - t1));

		// Parallel Stream
		int t3 = (int) System.currentTimeMillis();

		numList.parallelStream().filter((x) -> x % 2 == 0).forEach(x -> System.out.print(x + " "));

		int t4 = (int) System.currentTimeMillis();

		System.out.println("\nTotal time for Parallelstreams:" + (t4 - t3));

	}

}

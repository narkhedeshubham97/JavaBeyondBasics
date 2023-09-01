package com.ExerciseStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCubes {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> newList = integerList.stream().map((x) -> x * x * x).collect(Collectors.toList());
		System.out.println(newList.toString());

		IntStream rangeStream = IntStream.range(1, 51);

		int sum = rangeStream.sum();
		System.out.println("Sum of range 0 to 50:" + sum);

	}

}

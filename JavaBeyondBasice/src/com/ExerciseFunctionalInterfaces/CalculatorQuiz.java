package com.ExerciseFunctionalInterfaces;

import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculatorQuiz {

	public static void main(String pars[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int i = sc.nextInt();
		System.out.println("Enter Second number");
		int j = sc.nextInt();
		
		// adding two int values
		System.out.println("add:"+evaluate(i,j, (a,b)->a+b));
		//subtracting two int values
		System.out.println("Subtract:"+evaluate(i,j, (a,b)->a-b));
		// multiplying two int values
		System.out.println("multiply:"+evaluate(i,j ,(a,b)->a*b));
	}

	public static Integer evaluate(Integer t, Integer u, BiFunction<Integer, Integer, Integer> fn) {
		return fn.apply(t, u);
	}

}

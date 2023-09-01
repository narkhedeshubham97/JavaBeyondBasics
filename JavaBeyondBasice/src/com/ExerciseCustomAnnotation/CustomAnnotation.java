package com.ExerciseCustomAnnotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface MethodInfo {

	String author();
}

class Customer {

	public void calculateAmount() {
		System.out.println("amount Calculated");
	}
}

class DiamondCustomer extends Customer {
	@MethodInfo(author = "John")
	public void calculateAmount() {
		super.calculateAmount();
	}
}

public class CustomAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer dc = new DiamondCustomer();

		Class c = dc.getClass();
		System.out.println(c);

		MethodInfo anno = (MethodInfo) c.getAnnotation(MethodInfo.class);
		System.out.println(anno);
		System.out.println(anno.author());

	}

}
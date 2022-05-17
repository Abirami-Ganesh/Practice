package com.te.java_8;

public class LambdaEx {

	public static void main(String[] args) {

		/* shape s1 = () -> { System.out.println("square"); }; s1.square(); */
		course c1 = name -> {
			return "welcome to " + name;
		};
		System.out.println(c1.program("java"));

	}

}

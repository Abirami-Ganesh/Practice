package com.te.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodRefDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("100", "200", "300");
		list.forEach(a -> System.out.println(a));
		list.forEach(System.out::println);
		list.forEach(MethodRefDemo::getData);
	}
	
		
	public static void getData(String a) {
	System.out.println(a);	
	}

}

package com.te.java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamAPIDemo {
public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	arrayList.add(23);
	arrayList.add(23);
	arrayList.add(32);
	arrayList.add(45);
	arrayList.add(56);
	
	System.out.println(arrayList.stream().filter(i->i%2==0).collect(Collectors.toList()));
	System.out.println(arrayList.stream().filter(i->i%2==0).count());
	System.out.println(arrayList.stream().distinct().collect(Collectors.toList()));
	System.out.println(arrayList.stream().sorted().collect(Collectors.toList()));
	Comparator<Integer> c=(i1,i2)->{
		return i2.compareTo(i1);
	};
	System.out.println(arrayList.stream().sorted(c).collect(Collectors.toList()));
	System.out.println(arrayList.stream().sorted(c).min(c).get());
	System.out.println(arrayList.stream().sorted(c).max(c).get());

	System.out.println(arrayList.stream().map(i->i*i).collect(Collectors.toList()));

}
}

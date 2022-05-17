package com.te.java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLEx {
	public static void main(String[] args) {
		ArrayList<UdemyCourse> arrayList = new ArrayList<UdemyCourse>();
		arrayList.add(new UdemyCourse("mySQL", 1500.00));
		arrayList.add(new UdemyCourse("spring", 4500.00));
		arrayList.add(new UdemyCourse("web services", 3500.00));
		arrayList.add(new UdemyCourse("spring Boot", 4000.00));

		System.out.println("Before sorting");
		for (UdemyCourse course : arrayList) {
			System.out.println(course);
		}
//		Comparator<UdemyCourse> c = new Comparator<UdemyCourse>() {

//			@Override
//			public int compare(UdemyCourse o1, UdemyCourse o2) {
//				if (o1.getPrice() < o2.getPrice())
//					return 1;
//				else if (o1.getPrice() > o2.getPrice())
//					return -1;
//				return 0;
//			}
//
//		};
		
		System.out.println("After sorting :");
		Collections.sort(arrayList, (o1,o2)->{
			
			if (o1.getPrice() < o2.getPrice())
				return -1;
			else if (o1.getPrice() > o2.getPrice())
				return 1;
			return 0;
		});
		// create comparator for sorting based on price
		//Collections.sort(arrayList, c);
		for (UdemyCourse course : arrayList) {
			System.out.println(course);
		}
		Collections.sort(arrayList,(a1,a2)->{
			return a1.getCourse_name().compareTo(a2.getCourse_name());
		});
		System.out.println("sorting based on course name :");
		for (UdemyCourse course : arrayList) {
			System.out.println(course);
	}
}
}
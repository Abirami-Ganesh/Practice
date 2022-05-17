package com.te.java_8;

import java.security.PublicKey;

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			// System.out.println("RUNNABLE r1");
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1 :" + i);
			}
		};

		Runnable r2 = () -> {
			// System.out.println("RUNNABLE r2");
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 2 :" + i);
			}
		};
		Thread t=new Thread(r1);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(r2).start();

	}
}

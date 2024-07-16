package com.newlecture.code.oop.thread;

// 동기형 비동기형 thread

public class App {

	private static void print(String name, int count) {

		for (int i = 0; i < count; i++) {
			System.out.printf("%s : %d\n", name, i + 1);
		}
	}

	public static void main(String[] args) {

		print("a", 100);

		new Thread(() -> {
			print("b", 200);
		}).start();

		print("c", 100);

	}

}

package com.newlecture.code.func;

public class App4 {

	public static void main(String[] args) {

		// Notice
		int id = 0;
		String title = null;
		String content = null;
		int hit = 0;

		input(id, title, content, hit);

		print(id, title, content, hit);

		hit = hitUp(hit);
	}

	private static int hitUp(int hit) {
		return ++hit;
	}

	private static void print(int id, String title, String content, int hit) {
		System.out.printf("ID : %d, Title : %s, Content : %s, Hit : %d\n", id, title, content, hit);
	}

	private static void input(int id, String title, String content, int hit) {

	}

}

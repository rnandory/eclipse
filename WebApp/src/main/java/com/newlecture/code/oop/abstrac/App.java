package com.newlecture.code.oop.abstrac;

public class App {

	public static void main(String[] args) {

		도형[] 도형들 = new 도형[10];

		도형들[0] = new 원();
		도형들[1] = new 원();
		도형들[2] = new 네모();

		for (int i = 0; i < 3; i++) {
			도형들[i].이동(i, i);
			도형들[i].그리기();
			// System.out.println(도형들[i].toString());
		}
	}
}

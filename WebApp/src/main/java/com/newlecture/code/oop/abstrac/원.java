package com.newlecture.code.oop.abstrac;

public class 원 extends 도형 {

	private int 반지름;
	static private final String 형식;

	static {
		형식 = "원";
	}

	public 원() {

	}

	public void 그리기() {
		System.out.println(toString());
	}

//	public void 이동(int x, int y) {
//
//	}

	@Override
	public String toString() {
		return "원 [x=" + x + ", y=" + y + ", 반지름=" + 반지름 + "]";
	}
}

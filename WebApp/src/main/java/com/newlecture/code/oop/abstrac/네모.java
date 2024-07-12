package com.newlecture.code.oop.abstrac;

public class 네모 extends 도형 {

	private int 너비;
	private int 높이;
	static private final String 형식;

	static {
		형식 = "네모";
	}

	public 네모() {

	}

	public void 그리기() {
		System.out.println(toString());
	}

//	public void 이동(int x, int y) {
//
//	}

	@Override
	public String toString() {
		return "네모 [x=" + x + ", y=" + y + ", 너비=" + 너비 + ", 높이=" + 높이 + "]";
	}

}

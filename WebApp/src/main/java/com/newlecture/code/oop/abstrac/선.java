package com.newlecture.code.oop.abstrac;

public class 선 extends 도형 {

	static private final String 형식;

	static {
		형식 = "선";
	}

	public 선() {

	}

	public void 그리기() {
		System.out.println(toString());
	}

//	public void 이동(int x, int y) {
//
//	}

	@Override
	public String toString() {
		return "선 [x=" + x + ", y=" + y + "]";
	}

}

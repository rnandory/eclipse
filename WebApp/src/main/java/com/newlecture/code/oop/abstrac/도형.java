package com.newlecture.code.oop.abstrac;

public class 도형 {

	protected int x;
	protected int y;

	public void 이동(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void 그리기() {
		System.out.println("도형 그리기");
	}
}

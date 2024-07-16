package com.newlecture.code.oop.abstrac;

public abstract class 도형 {

	protected int x;
	protected int y;

	public void 이동(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 자식 클래스들의 그리기 메소드를 호출가능토록하는 용도
	// 이게 없으면 부모형식으로 참조한 자식객체는 그리기 메소드 사용불가
	// 자식이 부모의 메소드를 그대로 사용하지 않고 반드시 오버라이딩해서 사용토록 강제하는 방법
	public abstract void 그리기(); /*
								 * { System.out.println("도형 그리기"); }
								 */
}

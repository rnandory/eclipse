package com.newlecture.code.oop.lotto;

public class App {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Lotto lotto1 = new Lotto();

		// Lotto.init(); // 정적함수, 고전적 함수(다른 언어에선 그냥 펑션. 자바는 완전한 객체지향이라 메서드라함은 모두 인스턴스함수.
		// 인스턴스함수랑 구분되는 함수:정적함수)
		// Lotto.init()은 단순히 init함수가 Lotto라는 클래스 안에 포함되어있다는 의미
		lotto.init(); // 인스턴스함수, 객체를 넘겨받은 함수, 메서드함수(객체를 통해서(메서드, 수단)만 접근가능), 서비스함수
		lotto1.init();
		// init은 lotto객체가 가진 데이터 int[] nums를 관리함.
		// nums는 lotto객체의 책임이므로 init은 lotto객체를 통해서 사용되어야 됨

		// swap 0 <-> 1; swap(0, 1)
		lotto.swap(0, 1);

		// print();
		System.out.println(lotto.nums[0]);
	}

}

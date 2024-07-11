package com.newlecture.code.oop.lotto;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("main started");

		LottoService service = new LottoService();

		// 1. 로또 관리 메뉴를 출력하고

		// 2. 메뉴를 입력받고

		// 2-1 로또 자동 생성
		// 몇개를 생성할까요?
		int count = 3;
		service.genLottos(count);

		// 2-2 로또 수동 생성
		// 계속할까요?

		// 2-3 로또 번호 수정

		int index = 2;
		// 현재 로또번호 확인
		System.out.println(service.getLottos()[index].toString());
		// 어떤 로또번호를 수정하고 싶으세요
		// 인덱스입력>2

		// 어떤 번호로 바꾸고 싶으세요
		// 번호입력> 2 3 5 6 7 8
		System.out.print("어떤 번호로 바꾸고 싶으세요? \n번호입력>");
		Scanner sc = new Scanner(System.in);
		String[] nums_ = sc.nextLine().split(" ");
		int[] nums = new int[6];
		for (int i = 0; i < 6; i++) {
			nums[i] = Integer.parseInt(nums_[i]);
		}

		// lottos의 index번째 lotto를 nums로 대체
		service.changeLotto(index, nums);
		System.out.println(service.getLottos()[index].toString());

//		Lotto lotto = new Lotto();
//		Lotto lotto1 = new Lotto();
//
//		// Lotto.init(); // 정적함수, 고전적 함수(다른 언어에선 그냥 펑션. 자바는 완전한 객체지향이라 메서드라함은 모두 인스턴스함수.
//		// 인스턴스함수랑 구분되는 함수:정적함수)
//		// Lotto.init()은 단순히 init함수가 Lotto라는 클래스 안에 포함되어있다는 의미
//		// lotto.reset(); // 인스턴스함수, 객체를 넘겨받은 함수, 메서드함수(객체를 통해서(메서드, 수단)만 접근가능), 서비스함수
//		// lotto1.reset();
//		// init은 lotto객체가 가진 데이터 int[] nums를 관리함.
//		// nums는 lotto객체의 책임이므로 init은 lotto객체를 통해서 사용되어야 됨
//
//		// swap 0 <-> 1; swap(0, 1)
//		lotto.swap(0, 1);
//		lotto.setNum(2, 4);
//
//		// print();
//		for (int i = 0; i < 6; i++) {
//			int num = lotto.getNum(i);
//			System.out.println(num);
//		}
	}
}
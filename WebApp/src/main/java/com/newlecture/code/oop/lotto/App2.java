package com.newlecture.code.oop.lotto;

public class App2 {

	public static void main(String[] args) {
		// 보너스 번호가 있는 로또
		NamedLotto lotto = new NamedLotto("dragon", new int[] { 2, 5, 8, 12, 3, 11 });

//		lotto.genAuto();
//		lotto.setName("newlec");
		System.out.println(lotto);

	}

}

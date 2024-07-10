package com.newlecture.code.struct.lotto;

import java.util.Random;

public class Lotto {

	public int[] nums;// = new int[6]; new:연산. class안쪽은 정의공간(선언x), 함수 안이 연산공간
	// 정의하면서 연산까지 해도 되지만, 엄밀히 따지면 연산은 함수 안으로 옮겨져서 실행됨(생성자?)

	public static void genAuto(Lotto lotto) {
		System.out.println("[자동 발권]\n");

		// 랜덤으로 뽑기
		Random rand = new Random();

		for (int i = 0; i < 6; i++)
			lotto.nums[i] = rand.nextInt(45) + 1;
	}

	public static void parse(Lotto lotto, String strLotto) {
		String[] tokens = strLotto.split(" ");
		for (int i = 0; i < 6; i++)
			lotto.nums[i] = Integer.parseInt(tokens[i]);
	}
}

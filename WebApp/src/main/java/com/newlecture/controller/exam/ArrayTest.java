package com.newlecture.controller.exam;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int a;
		int[] x = new int[4];

		for (int i = 0; i < 4; i++) {
			x[i] = 20 + i;
		}

		// 오브젝트 id 해시값
		System.out.println(x);
		String str = Arrays.toString(x);
		System.out.println(str);

		// 배열 값 바꾸기
		// [20][21][22][23]
		// [23][21][22][20]
		{
			int temp;
			temp = x[0];
			x[0] = x[3];
			x[3] = temp;

			System.out.println(Arrays.toString(x));
		}

		{
			int b = 1;
			int c = 2;
		}
	}

}

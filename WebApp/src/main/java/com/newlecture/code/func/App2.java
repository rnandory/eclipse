package com.newlecture.code.func;

public class App2 {
	// 덧셈 출력
	static int add(int x, int y) {
		return x + y;
	}

//	------------------------------------------
	// 뺄셈 출력
	static int sub() {
		int x = 3;
		int y = 4;

		return x - y;
	}

	public static void main(String[] args) {
		// 덧셈출력
		{
			int x = 3;
			int y = 4;
			int result = add(x, y);
			System.out.println(result);
		}
	}

}

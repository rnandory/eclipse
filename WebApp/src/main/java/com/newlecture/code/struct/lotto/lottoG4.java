package com.newlecture.code.struct.lotto;

import java.util.Scanner;

public class lottoG4 {

	public static void main(String[] args) {

		final int MANUAL_MENU = 1;

		Lotto lotto = new Lotto();
		lotto.nums = new int[6];

		boolean isRun = true;

		while (isRun) {

			switch (inputMenu()) {
			case MANUAL_MENU:
				genManual(lotto);
				break;
			case 2:
				Lotto.genAuto(lotto);
				break;
			case 3:
				print(lotto);
				break;
			case 4:
				isRun = exit();
				break;
			}
		}
	}

	private static boolean exit() {

		System.out.print("종료하시겠습니까?(Y/n)>");

		Scanner scanner = new Scanner(System.in);
		String cmd = scanner.nextLine();

		if (cmd.equalsIgnoreCase("Y")) {
			System.out.println("\nBye~");
			return false;
		}

		return true;
	}

	private static void print(Lotto lotto) {
		// way1 : static
		System.out.printf("%d %d %d %d %d %d\n", lotto.nums[0], lotto.nums[1], lotto.nums[2], lotto.nums[3],
				lotto.nums[4], lotto.nums[5]);
		// way2 : loop
//      for(int i=0; i<6; i++) {
//         System.out.printf("%d", lotto[i]);
//         
//         if(i<5)
//            System.out.print(" ");         
//      }
	}

	private static void genManual(Lotto lotto) {

		System.out.println("""
				          [수동 발권]

				※1~45 숫자 범위에서 원하는 번호를 스페이스를 구분자로 6개 입력하세요. 숫자는 정렬되어 있지 않아도 상관없다※\n

				번호>
				                        """);

		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();

		// 분리 :
		Lotto.parse(lotto, line);
	}

	private static int inputMenu() {
		System.out.println("""
				[로또 복권 프로그램]

				1. 수동 발권
				2. 자동 발권
				3. 발권 번호 조회
				4. 종료
				메뉴입력>
				""");

		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();

		return menu;
	}
}

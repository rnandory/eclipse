package com.newlecture.controller.lotto;

import java.util.Random;
import java.util.Scanner;

public class lottoG3 {

	public static void main(String[] args) {

		final int MANUAL_MENU = 1;
		final int AUTO_MENU = 2;
		final int CHECK_MENU = 3;
		final int EXIT = 4;

		int[] lotto = new int[6];

		boolean isRun = true;

		while (isRun) {

			switch (inputMenu()) {
			case MANUAL_MENU:
				genManual(lotto);
				break;
			case AUTO_MENU:
				genAuto(lotto);
				break;
			case CHECK_MENU:
				print(lotto);
				break;
			case EXIT:
				isRun = exit();
				break;
			}
		}
	}

	static void genAuto(int[] lotto) {
		System.out.println("[자동 발권]\n");

		// 랜덤으로 뽑기
		// autoLottoPicker(lotto);
		Random rand = new Random();
		for (int i = 0; i < 6; i++)
			lotto[i] = rand.nextInt(45) + 1;

		// 정렬
		sort(lotto);

		// 출력
		System.out.print("자동으로 발권한 번호>");
		showLotto(lotto);

		// 화면 전환용 프롬프트
		pause();
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

	static void genManual(int[] lotto) {
		boolean isRun = true;
		do {
			System.out.print("""
					                    [수동 발권]

					※1~45 숫자 범위에서 원하는 번호를 스페이스를 구분자로 6개 입력하세요. 숫자는 정렬되어 있지 않아도 상관없다※

					번호>""");

			// nums 수동입력받기
			{
				Scanner sc = new Scanner(System.in);
				String line = sc.nextLine();

				String[] tokens = line.split(" ");
				for (int i = 0; i < 6; i++)
					lotto[i] = Integer.parseInt(tokens[i]);
			}

			// 정렬
			sort(lotto);

			// 출력
			System.out.println("\n입력한 번호확인");
			showLotto(lotto);

			// 확인
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("\n위의 번호가 맞나요?(Y/N)");
				if (sc.nextLine().equals("Y"))
					isRun = false;
			}
		} while (isRun);
	}

	static void autoLottoPicker(int[] lotto) {
		// 중복되지 않는 숫자 6개 추첨
		for (int i = 0; i < 6; i++) {
			// 이전에 뽑은 숫자와 중복되지 않는 숫자가 뽑힐 때까지 while반복
			boolean isUniq = true;
			do {
				// 추첨
				lotto[i] = (int) (Math.random() * 45) + 1;
				// 중복검사
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						isUniq = false;
						break;
					}
				}
			} while (!isUniq);
		}
	}

	static void print(int[] lotto) {
		System.out.println("[발권한 로또번호]\n");

		// 출력
		showLotto(lotto);

		// 화면 전환용 프롬프트
		pause();
	}

	static void showLotto(int[] lotto) {
		System.out.printf("%d %d %d %d %d %d\n", lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]);
		// for (int i = 0; i < 6; i++) {
		// System.out.print(lotto[i]);
		// if (i < 5)
		// System.out.print(" ");
		// else
		// System.out.println();
		// }
	}

	static void sort(int[] lotto) {
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5 - i; j++)
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
	}

	static void pause() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n상위메뉴로 가려면 아무키나 누르세요.");
		sc.nextLine();
	}

	static boolean exit() {
		System.out.println("종료하시겠습니까?(Y/N)>");
		Scanner sc = new Scanner(System.in);
		if (sc.nextLine().equals("Y")) {
			System.out.println("Bye~");
			return false;
		} else
			return true;
	}
}
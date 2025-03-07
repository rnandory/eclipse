package com.newlecture.code.struct.exam;

import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {

		Exam exam = new Exam();

		while (true) {
			// intro출력
			int menu = inputMenu();

			switch (menu) {
			case 2: // 입력
				clear();
				set(exam);
				pause();
				break;
			case 3: // 출력
				clear();
				print(exam);
				pause(); // 화면전환용 임시프롬프트
				break;
			}// swich
		} // while
	}// main

	static void set(Exam exam) {
		Exam.setName(exam, "홍길동");
		Exam.setKor(exam, 30);
		Exam.setEng(exam, 40);
		Exam.setMath(exam, 50);
	}

	static int inputMenu() {
		// 화면 지우고
		clear();
		// 메뉴화면 출력
		String menu_view = """
				    ┌───────────────────────────────┐
				    │            성적관리           │
				    └───────────────────────────────┘

				    2. 성적입력
				    3. 성적출력
				""";

		System.out.print(menu_view);

		// 메뉴 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴번호를 입력하세요 >_");
		int menu = Integer.parseInt(scan.nextLine());
		return menu;
	}

	static void print(Exam exam) {
		System.out.printf("name:%s, kor:%d, eng:%d, math:%d", Exam.getName(exam), Exam.getKor(exam), Exam.getEng(exam),
				Exam.getMath(exam));
	}

	static void pause() {
		System.out.println();
		System.out.println("────────────────────────────────────────────────────");
		System.out.println("Press any key to continue>");

		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

	static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	static void clear() {
		try {
			String operatingSystem = System.getProperty("os.name");
			if (operatingSystem.contains("Windows")) {
				ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
				Process startProcess = pb.inheritIO().start();
				startProcess.waitFor();
			} else {
				ProcessBuilder pb = new ProcessBuilder("clear");
				Process startProcess = pb.inheritIO().start();
				startProcess.waitFor();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

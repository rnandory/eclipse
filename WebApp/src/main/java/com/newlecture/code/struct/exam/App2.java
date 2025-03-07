package com.newlecture.code.struct.exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) throws IOException {

		Exam exam = new Exam();

		EXIT_LOOP: while (true) {

			clear();// 화면 지우고
			// intro출력
			int menu = inputMenu();

			switch (menu) {
			case 1: // 성적목록
				// 페이지 정보
				int page = 1;
				int postPerPage = 6;

				clear();
				printRecords(page, postPerPage);
				break;
			case 2: // 성적추가
				clear();
				regRecord();
				promptToContinue();
				break;
			case 3: // 성적로드
				clear();
				loadRecord();
				promptToContinue(); // 화면전환용 임시프롬프트
				break;
			case 4: // 성적저장
				clear();
				saveRecord();
				promptToContinue();
				break;
			case 5: // 종료
				clear();
				exit();
				break EXIT_LOOP;
			default:
				System.out.println("오류 : 1~5까지의 값만 입력할 수 있습니다.");
				promptToContinue();
			}// swich
		} // while
	}// main

	private static void promptToContinue() {
		// TODO Auto-generated method stub

	}

	private static void exit() {
		// TODO Auto-generated method stub

	}

	private static void saveRecord() {
		// TODO Auto-generated method stub

	}

	private static void loadRecord() {
		// TODO Auto-generated method stub

	}

	private static void regRecord() {
		// TODO Auto-generated method stub

	}

	private static int inputMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void printRecords(int page, int postPerPage) throws IOException {
		page_menu: while (true) {
			// 성적목록출력
			{
				FileInputStream fis = new FileInputStream("res/data.csv");
				Scanner scan = new Scanner(fis);

				// 성적목록 제목 컬럼명 출력
				{
					System.out.printf("%d page\n", page);
					System.out.println("┌──────────────────────────────────────────────────┐");
					System.out.println("│                     성적 목록                    │");
					System.out.println("└──────────────────────────────────────────────────┘");

					// String[] caption = scan.nextLine().split(",");
					// System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\n", caption[0], caption[1],
					// caption[2], caption[3]);

					// 컬럼명 한줄 버리기
					scan.nextLine();

					// 캡션 출력
					System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-4s\t%-4s\t%-4s\n", "이름", "국어", "영어", "수학", "총점", "평균",
							"학점");
				}

				// 현재 페이지에 이전 라인들 읽어서 버리기
				{
					// 버릴 라인의 수 = (page - 1) * (한 페이지에 보여지는 글의 개수)

					// 버릴 라인만큼 반복
					for (int i = 0; scan.hasNextLine() && i < (page - 1) * postPerPage; i++) {
						scan.nextLine();
					}
				}

				// 파일에서 한 줄씩 읽어서 화면출력
				{
					// postPerPage만큼 라인출력 반복
					for (int i = 0; scan.hasNextLine() && i < postPerPage; i++) {
						String line = scan.nextLine();
						String[] tokens = line.split(",");

						int kor;
						int eng;
						int math;
						int total;
						double avg;
						String grade;

						String name = tokens[0];

						// kor
						// tokens값이 숫자가 아니라면 초기값을 0으로
						if (!isNumeric(tokens[1])) {
							kor = 0;
						} else
							kor = Integer.parseInt(tokens[1]);

						// kor값이 유효범위에 있지 않다면 0
						if ((!(0 <= kor && kor <= 100)))
							kor = 0;

						// eng
						// tokens값이 숫자가 아니라면 초기값을 0으로
						if (!isNumeric(tokens[2]))
							eng = 0;
						else
							eng = Integer.parseInt(tokens[2]);

						// eng값이 유효범위에 있지 않다면 0
						if (!(0 <= eng && eng <= 100))
							eng = 0;

						// math
						// tokens값이 숫자가 아니라면 초기값을 0으로
						if (!isNumeric(tokens[3]))
							math = 0;
						else
							math = Integer.parseInt(tokens[3]);

						// math값이 유효범위에 있지 않다면 0
						if (!(0 <= math && math <= 100))
							math = 0;

						// total avg 계산
						total = kor + eng + math;
						avg = total / 3.0;

						// grade 계산
						if (90 <= avg)
							grade = "A";
						else if (80 <= avg)
							grade = "B";
						else if (70 <= avg)
							grade = "C";
						else
							grade = "F";

						System.out.printf("%-4s\t%-4d\t%-4d\t%-4d\t%-4d\t%-5.2f\t%-4s\n", name, kor, eng, math, total,
								avg, grade);
					} // for

					// // 화면전환용 임시 프롬프트
					// {
					// System.out.println("────────────────────────────────────────────────────");
					// System.out.println("Press any key to continue>");

					// Scanner sc = new Scanner(System.in);
					// scan.nextLine();
					// }

				} // 목록출력 지역블록

				// 페이지 메뉴
				// -1. 이전페이지
				// 1. page지정해서 이동
				// 2. 메인메뉴로
				{
					Scanner sc = new Scanner(System.in);
					System.out.println("-1 : 이전페이지");
					System.out.println("1 : 페이지 이동");
					System.out.println("2 : 이전 메뉴");
					System.out.print("메뉴번호를 입력하세요.>_");
					int page_menu = Integer.parseInt(sc.nextLine());

					switch (page_menu) {
					case -1:// 이전페이지
						page = page == 1 ? 1 : page - 1;
						break;
					case 1:// page지정해서 이동
					{
						System.out.print("이동할 페이지 >_");
						page = Integer.parseInt(sc.nextLine());
						System.out.println("입력받은 페이지 : " + page);
					}
						break;
					case 2:// 메인메뉴로
						break page_menu;
					default:// 유효하지 않은 메뉴입력
					{
						System.out.println("유효하지 않은 입력.");
						// 화면전환용 임시 프롬프트
						{
							System.out.println("────────────────────────────────────────────────────");
							System.out.println("Press any key to continue>");
							sc.nextLine();
						}
					}
					}
				} // 페이지메뉴 지역블록
				fis.close();
				scan.close();
			}
		} // while 전체화면출력
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void clear() {
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

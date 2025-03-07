package com.newlecture.code.struct;

public class App {

	public static void main(String[] args) {

		// Notice데이터 1개
		Notice notice = new Notice();

		// 입력(모든 속성 상수로 직접대입)
		input(notice);
		// 출력(모든 속성 출력)
		print(notice);
		// 조회수 1업
		hitUp(notice);
	}

	private static void input(Notice notice) {
		notice.id = 1;
		notice.title = "데이터란?";
		notice.content = "hehe";
		// notice.hit = 0;
	}

	private static void hitUp(Notice notice) {
		notice.hit++;
	}

	private static void print(Notice notice) {
		System.out.println(notice);
		String view = """
				id : %d
				title : %s
				content : %s
				hit : %d
				""";
		System.out.printf(view, notice.id, notice.title, notice.content, notice.hit);
	}
}

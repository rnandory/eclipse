package com.newlecture.code.struct.exam;

public class Exam {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public static void setName(Exam exam, String name) {
		exam.name = name;
	}

	public static void setKor(Exam exam, int kor) {
		exam.kor = kor;
	}

	public static void setEng(Exam exam, int eng) {
		exam.eng = eng;
	}

	public static void setMath(Exam exam, int math) {
		exam.math = math;
	}

	public static String getName(Exam exam) {
		return exam.name;
	}

	public static int getKor(Exam exam) {
		return exam.kor;
	}

	public static int getEng(Exam exam) {
		return exam.eng;
	}

	public static int getMath(Exam exam) {
		return exam.math;
	}
}

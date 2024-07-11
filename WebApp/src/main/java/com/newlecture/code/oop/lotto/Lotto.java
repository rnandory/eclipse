package com.newlecture.code.oop.lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	private int[] nums;

	public Lotto() {
		nums = new int[6];
	}

//	public void reset() {
//		this.nums = new int[6]; // this는 약속된 참조변수. init을 호출한 객체
//		nums[0] = 3; // 자바는 this생략가능
//		nums[1] = 3;
//	}

	public Lotto(int[] nums) {
		this.nums = nums;
	}

	public void swap(int s, int d) {
		int temp = nums[s];
		nums[s] = nums[d];
		nums[d] = temp;
	}

	protected int[] getNums() {
		return nums;
	}

	@Override
	public String toString() {
		return "Lotto [nums=" + Arrays.toString(nums) + "]";
	}

	public int getNum(int index) {
		return nums[index];
	}

	public void setNum(int index, int value) {
		nums[index] = value;
	}

	public void genAuto() {
		Random rand = new Random();

		for (int i = 0; i < 6; i++)
			nums[i] = rand.nextInt(45) + 1;
	}

	public void setNums(int[] nums) {
		this.nums = nums;
	}
}

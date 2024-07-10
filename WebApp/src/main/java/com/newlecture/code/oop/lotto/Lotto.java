package com.newlecture.code.oop.lotto;

public class Lotto {

	int[] nums;

	public void init() {
		this.nums = new int[6]; // this는 약속된 참조변수. init을 호출한 객체
		this.nums[0] = 3; // 자바는 this생략가능
	}

	public void swap(int s, int d) {
		int temp = nums[s];
		nums[s] = nums[d];
		nums[d] = temp;
	}
}

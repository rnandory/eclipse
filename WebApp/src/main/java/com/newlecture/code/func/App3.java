package com.newlecture.code.func;

import java.util.Arrays;

public class App3 {

	public static void main(String[] args) {
		int[] nums = { 3, 6, 5, 2, 3, 7 };
		int num = 30;

		print(nums);
		print(num);

		sort(nums);
		num = update(num);

		print(nums);
		print(num);
	}

	private static int update(int num) {
		return ++num;
	}

	private static void print(int num) {
		System.out.println(num);
	}

	private static void sort(int[] nums) {
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = 0; j < nums.length - 1; j++) {
//				if (nums[j] < nums[j + 1]) {
//					int temp = nums[j];
//					nums[j] = nums[j + 1];
//					nums[j + 1] = temp;
//				}
//			}
//		}
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
	}

	private static void print(int[] nums) {
		System.out.println(Arrays.toString(nums));
	}

}

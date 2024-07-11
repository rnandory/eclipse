package com.newlecture.code.oop.lotto;

public class NamedLotto extends Lotto {
	private String name;

	public NamedLotto() {
		super();// nums 초기화
		name = "unknown";
	}

	public NamedLotto(String name) {
		super();// nums 초기화
		this.name = name;
	}

	public NamedLotto(String name, int[] nums) {
		super(nums);// nums 초기화
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// return name + ":Lotto [nums=" + Arrays.toString(getNums()) + "]";
		return name + ":" + super.toString();
	}
}

package com.newlecture.code.oop.lotto;

public class LottoService {

	private static final int max;
	private Lotto[] lottos;
	private int capacity;

//	{
//		System.out.println("초기화 블럭");
//	}

	static {
		max = 100;
		System.out.println("static : " + max);
	}

	public LottoService() {
		System.out.println("constructor call");
		capacity = 2;
		lottos = new Lotto[capacity];
	}

	public void genLottos(int count) {
		if (capacity < count) { // 공간이 모자라다면
			// 1. 임시배열 temp를 만든다. 기본 count보다 크게
			Lotto[] temp = new Lotto[capacity + count];

			// 2. 배열 데이터를 이주시킨다.
			for (int i = 0; i < capacity; i++)
				temp[i] = lottos[i];

			// 3. 이주한 temp배열의 이름을 lottos로 바꾼다.
			lottos = temp;

			capacity += count;
		}

		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = new Lotto();
			lottos[i].genAuto();
		}
	}

	public void changeLotto(int index, int[] nums) {
		lottos[index].setNums(nums);
	}

	public Lotto[] getLottos() {
		return lottos;
	}
}

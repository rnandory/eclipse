import java.util.Arrays;

import com.newlecture.code.struct.lotto.Lotto;

public class App {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.nums = new int[6];

		Lotto.genAuto(lotto);

		System.out.println(Arrays.toString(lotto.nums));
	}

}

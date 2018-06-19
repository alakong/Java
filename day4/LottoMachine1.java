package day4;

public class LottoMachine1 {

	public static void main(String[] args) {
		System.out.print("오늘의 로또 번호 - ");
		int[] lott = new int[6];
		for (int i = 0; i < lott.length; i++) {
			lott[i] = (int) (Math.random() * 45) + 1;
			for (int n = 0; n <= i - 1; n++) {
				if (lott[i] == lott[n]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < lott.length; i++) {
			System.out.print(lott[i]);
			if (i != lott.length - 1) {
				System.out.print(", ");
			}

		}
	}
}




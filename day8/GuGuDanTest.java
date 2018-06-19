package day8;

import day5.MethodLab3;

class GuGu {
	private int dan;
	private int number;

	GuGu() {
	}

	GuGu(int dan) {
		this.dan = dan;
	}

	GuGu(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}

	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDan extends GuGu {
	GuGuDan() {
	}

	GuGuDan(int dan) {
		super(dan);
	}

	GuGuDan(int dan, int number) {
		super(dan, number);
	}

	public static void printAll() {
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
		}

	}
}

public class GuGuDanTest {

	public static void main(String[] args) {
		int dan = MethodLab3.getRandom(20);
		int number = MethodLab3.getRandom(20);

		if (dan <= 9) {
			if (number <= 9) {
				GuGuDan g1 = new GuGuDan(dan, number);
				System.out.print(dan + "*" + number + "=");
				g1.printPart();
			} else {
				//number = 0;
				GuGuDan g1 = new GuGuDan(dan);
				System.out.print(dan + "단: ");
				g1.printPart();
			}
		}

		else {
			GuGuDan.printAll();// static메소드는 클래스.호출
		}

	}

}

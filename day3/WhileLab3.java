package day3;

public class WhileLab3 {
	public static void main(String[] args) {
		int a = 9;
		while (a >= 5) {
			System.out.print("\n" + a + "´Ü : ");
			int b = 1;
			while (b <= 9) {
				System.out.print(a + "x" + b + "=" + a * b + "\t");
				b++;
			}
			a--;
		}

	}

}

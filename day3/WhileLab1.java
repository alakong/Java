package day3;

public class WhileLab1 {
	public static void main(String[] args) {
		System.out.println("[for ���]");
		int n = (int) (Math.random() * 6) + 5;
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " -> " + i * i);
		}
		System.out.println("[while ���]");
		int i = 1;
		while (i <= n) {
			System.out.println(i + " -> " + i * i);
			i++;

		}
	}
}

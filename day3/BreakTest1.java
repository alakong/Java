package day3;

public class BreakTest1 {
	public static void main(String[] args) {
		System.out.println("구구단");
		abc: for (int dan = 1; dan <= 9; dan++) {
			System.out.print(dan + "단:");

			for (int num = 1; num <= 9; num++) {
				if (dan * num > 30)
					break abc;// 기본적으로 가장 가까운 곳의 반복문을 끝내는것,태그를 달면 위여도 빠져나감
				System.out.print(dan * num + "\t");
			}
			System.out.println();
		}
	}
}

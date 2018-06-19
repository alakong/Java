package day6;

import java.util.Scanner;

//삼각형의 행의 갯수를 입력받는 부분에서 음의 값이 입력되면 다시 입력받게하기
public class ContinueTest4 {

	public static void main(String[] args) {
		final char DECO_MARK = '$';
		Scanner scan = new Scanner(System.in);

		int ans = 1;
		while (ans == 1) {
			int num;
		
				System.out.print("숫자를 입력하세요 : ");
				num = scan.nextInt();
				if (num <= 0)
					continue;//다시 조건식으로 가게하는 역할
			

			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}

			System.out.print("계속하겠습니까? 계속하려면 1을 입력 / 종료하려면 2를 입력");
			ans = scan.nextInt();

		}
		scan.close();
		System.out.println("-수행종료-");

	}
}

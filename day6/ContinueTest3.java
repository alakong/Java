package day6;

import java.util.Scanner;

//사용자가 원할 때 까지 숫자 입력받고 삼각형을 출력한 후 계속할것인지 물어보고 결정->1입력시 계속 2입력하면 종료 
public class ContinueTest3 {

	public static void main(String[] args) {
		final char DECO_MARK = '$';
		Scanner scan = new Scanner(System.in);

		int ans = 1;
		while (ans == 1) {

			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
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

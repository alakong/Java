package day6;

import java.util.Scanner;

//�ﰢ���� ���� ������ �Է¹޴� �κп��� ���� ���� �ԷµǸ� �ٽ� �Է¹ް��ϱ�
public class ContinueTest4 {

	public static void main(String[] args) {
		final char DECO_MARK = '$';
		Scanner scan = new Scanner(System.in);

		int ans = 1;
		while (ans == 1) {
			int num;
		
				System.out.print("���ڸ� �Է��ϼ��� : ");
				num = scan.nextInt();
				if (num <= 0)
					continue;//�ٽ� ���ǽ����� �����ϴ� ����
			

			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}

			System.out.print("����ϰڽ��ϱ�? ����Ϸ��� 1�� �Է� / �����Ϸ��� 2�� �Է�");
			ans = scan.nextInt();

		}
		scan.close();
		System.out.println("-��������-");

	}
}

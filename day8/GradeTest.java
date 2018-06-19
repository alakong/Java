package day8;

import java.util.Scanner;

class GradeExpr {
	int jumsu[];

	GradeExpr(int jumsu[]) {
		this.jumsu = jumsu;//������ ���� �迭�� �������� �о�ͼ� ���� �迭�� ó�������� ���⿡ ���� �迭�� �����ϴ� ����� ����ϸ� ���ο� �ִ� �迭�� ��ȭ��Ű�� �ʴ´�
	}

	int getTotal() {
		int sum = 0;
		for (int j : jumsu)
			sum += j;
		return sum;
	}

	double getAverage() {
		return (double) getTotal() / jumsu.length;// �Ҽ������� ������ �ϱ����� ����ȯ ������ �ʿ���
		// getTotal()/jumsu.length;->�̷��� �������ϸ� �Ҽ������ϰ� ����!!
	}

	int getGoodScore() {
		int maxJumsu = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if (maxJumsu < jumsu[i])
				maxJumsu = jumsu[i];
		}
		return maxJumsu;

	}

	int BadScore() {
		int minJumsu = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if (minJumsu > jumsu[i])
				minJumsu = jumsu[i];
		}
		return minJumsu;
	}
}

public class GradeTest {

	public static void main(String[] args) {

		System.out.println("������ ������ �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int[] jumsuArr = new int[scan.nextInt()];

		System.out.println("������ ��� �Է��ϼ��� : ");
		for (int i = 0; i < jumsuArr.length; i++)
			jumsuArr[i] = scan.nextInt();

		System.out.print("������ : ");
		for (int i = 0; i < jumsuArr.length; i++) {
			System.out.print(jumsuArr[i]);
			if (i != jumsuArr.length - 1)
				System.out.print(", ");
		}

		System.out.println();

		GradeExpr jumsu = new GradeExpr(jumsuArr);

		System.out.printf("����: %d%n���: %.2f%n�ְ� ����: %d%n���� ����: %d", jumsu.getTotal(), jumsu.getAverage(),
				jumsu.getGoodScore(), jumsu.BadScore());

		scan.close();

	}

}

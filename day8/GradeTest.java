package day8;

import java.util.Scanner;

class GradeExpr {
	int jumsu[];

	GradeExpr(int jumsu[]) {
		this.jumsu = jumsu;//지금은 메인 배열을 참조값을 읽어와서 메인 배열을 처리하지만 여기에 직접 배열을 복사하는 방법을 사용하면 메인에 있는 배열을 변화시키지 않는다
	}

	int getTotal() {
		int sum = 0;
		for (int j : jumsu)
			sum += j;
		return sum;
	}

	double getAverage() {
		return (double) getTotal() / jumsu.length;// 소수점까지 나오게 하기위해 형변환 연산자 필요함
		// getTotal()/jumsu.length;->이렇게 나눗셈하면 소수점이하가 날라감!!
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

		System.out.println("점수의 개수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int[] jumsuArr = new int[scan.nextInt()];

		System.out.println("점수를 모두 입력하세요 : ");
		for (int i = 0; i < jumsuArr.length; i++)
			jumsuArr[i] = scan.nextInt();

		System.out.print("점수들 : ");
		for (int i = 0; i < jumsuArr.length; i++) {
			System.out.print(jumsuArr[i]);
			if (i != jumsuArr.length - 1)
				System.out.print(", ");
		}

		System.out.println();

		GradeExpr jumsu = new GradeExpr(jumsuArr);

		System.out.printf("총점: %d%n평균: %.2f%n최고 점수: %d%n최저 점수: %d", jumsu.getTotal(), jumsu.getAverage(),
				jumsu.getGoodScore(), jumsu.BadScore());

		scan.close();

	}

}

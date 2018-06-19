package day3;

public class ForLab4 {
	public static void main(String[] args) {
		for (int line = 1; line <= 7; line++) {
			for (int num = 1; num <= (8 - line); num++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}

/*for (int line = 7; line >= 1; line--) {
	for (int num = 1; num <= line; num++) {
		System.out.print('*');
	}
	System.out.println();
*/


/*실습4 - 모양 출력
1. ForLab4 라는 클래스를 생성한다.
2. 다음과 같은 결과가 되도록 구현한다.

    *******
    ******
    *****
    ****
    ***
    **
    *
    단!! 별을 출력할 때는 '*' 을 출력한다.*/
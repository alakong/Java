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


/*�ǽ�4 - ��� ���
1. ForLab4 ��� Ŭ������ �����Ѵ�.
2. ������ ���� ����� �ǵ��� �����Ѵ�.

    *******
    ******
    *****
    ****
    ***
    **
    *
    ��!! ���� ����� ���� '*' �� ����Ѵ�.*/
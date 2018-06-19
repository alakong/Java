package day5;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		char play[][] = { 
				{ 'X', 'X', 'X', 'R', 'X', 'R'},
				{ 'R', 'X', 'X', 'X', 'X', 'X'},
				{ 'X', 'X', 'R', 'X', 'X', 'X'},
				{ 'R', 'X', 'X', 'F', 'X', 'X'},
				{ 'X', 'R', 'X', 'X', 'X', 'X'},
				{ 'X', 'R', 'X', 'R', 'X', 'R'},
				};
		
		int catchNum = 0;
		int fa = 0;
		int fb = 0;
		
		a:for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (play[i][j] == 'F') {
					fa = i;
					fb = j;
					break a;
				}
			}
		}
		for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (j == fb && play[i][j] == 'R') {
					catchNum++;
				} else if (i == fa && play[i][j] == 'R') {
					catchNum++;
				} else if (i + j == fa + fb && play[i][j] == 'R') {
					catchNum++;
				} else if (i - j == fa - fb && play[i][j] == 'R') {
					catchNum++;
				}

			}
		}
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);
	}

}
		
		
		

		
		/*
		 * R�� �䳢�̰� F�� �����
		 * ����� ���찡 �����ϴ� ��ġ���� �밢���� 
		 * �������θ� �̵� �����ϴ�. 
		 * ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 */
		//���ƴٴϸ鼭 ������ ��ġ�� ���� ã�ƾ���->2�����迭�� ���ƴٴϸ� ã�¹��or for��������
		
		
		




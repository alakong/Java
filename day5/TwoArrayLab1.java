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
		System.out.printf("여우는 토끼를 %d 마리 잡는다.", catchNum);
	}

}
		
		
		

		
		/*
		 * R은 토끼이고 F는 여우다
		 * 여우는 여우가 존재하는 위치에서 대각선과 
		 * 직선으로만 이동 가능하다. 
		 * 위와 같은 2차원 배열 데이터에서
		 * 토끼를 몇마리 잡겠는가?
		 */
		//돌아다니면서 여우의 위치를 먼저 찾아야함->2차원배열을 돌아다니며 찾는방법or for문여러개
		
		
		




package day3;

public class ForTest5 {
	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			for (int num = 1; num <= line; num++) {
				System.out.print('$');
			}
			System.out.println();
		}
		char munja='A';
		for (int line = 1; line <= 5; line++) {
			for (int num = 1; num <= line; num++) {
				System.out.print(munja++);
			}
			System.out.println();
		}
		munja='가';
		for (int line = 1; line <= 5; line++) {
			for (int num = 1; num <= line; num++) {
				System.out.print(munja++);
			}
			System.out.println();
		}
	}

}


/*int count =(int)(Math.random()*7)+1;
for(int i=1;i<=count;i++)
	System.out.print('@');//@를 추출된 count 랜덤개수만큼 반복
*/


/*for (int dan = 1; dan <= 9; dan++) {
	System.out.print(dan + "단: ");
	for (int num = 1; num <= 9; num++) {
		System.out.print(dan * num + "\t");
	}
	System.out.println();//빈괄호이면 개행처리
}*/
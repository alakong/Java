package day4;

public class ArrayTest3 {

	public static void main(String[] args) {
		int score[]= new int[5];
		for(int i=0;i<score.length;i++)//�迭�� ũ�⸦ ���������� ������� �ʾƵ� score.length�� �迭�� ũ�⸦ �˼�����
			System.out.println(score[i]);	
		/*score[0]=100;
		score[1]=200;
		score[2]=300;
		score[3]=400;
		score[4]=500;*/
		for(int i=0;i<score.length;i++)
			score[i]=(i+1)*100;
		for(int i=0;i<5;i++)
			System.out.println(score[i]);
		for(int i=0;i<5;i++)
			System.out.println(++score[i]);
	}
}

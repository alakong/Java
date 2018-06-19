package day4;

public class ArrayTest1 {

	public static void main(String[] args) {
		int score[]= new int[5];
		System.out.println(score);//출력값에서 골뱅이 앞의 기호가 타입값/그뒤는 16진수로 나타낸 참조값(논리적 주소값)
		System.out.println(score[0]);
		System.out.println(score[1]);
		double score1[]= new double[5];
		System.out.println(score1);
		System.out.println(score1[0]);
		System.out.println(score1[1]);
		boolean score2[]= new boolean[5];//기본값false
		System.out.println(score2);
		System.out.println(score2[0]);
		System.out.println(score2[1]);
	}
	
}

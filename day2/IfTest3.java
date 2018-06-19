package day2;

public class IfTest3 {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 101);// 0부터 100까지 점수나옴
		if (90 <= score && score <= 100)
			System.out.println(score + ": A 등급");
		else if (80 <= score && score <= 89)
			System.out.println(score + ": B 등급");
		else if (70 <= score && score <= 79)
			System.out.println(score + ": C 등급");
		else if (60 <= score && score <= 69)
			System.out.println(score + ": D 등급");
		else
			System.out.println(score + ": F 등급");
	}
}




















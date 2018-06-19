package day2;

public class SwitchTest3 {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 101);
		int temp = score / 10;

		switch (temp) {
		case 10:
		case 9:
			System.out.println(score + ": A 등급");
			break;
		case 8:
			System.out.println(score + ": B 등급");
			break;
		case 7:
			System.out.println(score + ": C 등급");
			break;
		case 6:
			System.out.println(score + ": D 등급");
			break;
		default:
			System.out.println(score + ": F 등급");
		}
	}
}

/*int score = (int) (Math.random() * 101);


switch (score/10) {
case 10:
case 9:
	System.out.println(score + ": A 등급");
	break;
case 8:
	System.out.println(score + ": B 등급");
	break;
case 7:
	System.out.println(score + ": C 등급");
	break;
case 6:
	System.out.println(score + ": D 등급");
	break;
default:
	System.out.println(score + ": F 등급");
*/
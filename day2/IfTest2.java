package day2;

public class IfTest2 {
	public static void main(String[] args) {
		int month = (int) (Math.random() * 12) + 1;
		if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "월은 겨울");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println(month + "월은 봄");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println(month + "월은 여름");
		} else {
			System.out.println(month + "월은 가을");
		}
	}
}

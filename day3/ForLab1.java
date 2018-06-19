package day3;

public class ForLab1 {
	public static void main(String[] args) {
		int count = (int) (Math.random() * 8) + 3;
		int deco = (int) (Math.random() * 3) + 1;
		if (deco == 1) {
			for (int i = 1; i <= count; i++)
				System.out.print("*");
		} else if (deco == 2) {
			for (int i = 1; i <= count; i++)
				System.out.print("$");
		} else {
			for (int i = 1; i <= count; i++)
				System.out.print("#");
		}
	}

}


/*실습1  
1. ForLab1 이라는 클래스를 생성한다.
2. 3부터 10사이의 난수를 추출한다.(count)
3. 1부터 3사이의 난수를 추출한다.(deco)
4. deco가 1이면 "*"을 첫번째 count 값만큼 출력한다.
    deco가  2이면 "$"을 첫번째 count 값만큼 출력한다.
    deco가  3이면 "#"을 첫번째 count 값만큼 출력한다.*/
package day5;
public class MethodLab3 {
	public static void main(String[] args) {
		int result;
		for (int i = 1; i <= 5; i++) {
			result = getRandom(10);//한번쓸꺼면 변수설정 안하고 호출식을 직접 대입해도됨
			System.out.print(result);
			if (i != 5)
				System.out.print(", ");
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			result = getRandom(10, 20);
			System.out.print(result);
			if (i != 5)
				System.out.print(", ");

		}

	}

	public static int getRandom(int n) {
		return (int) (Math.random() * n) + 1;

	}

	public static int getRandom(int n1, int n2) {
		if (n1 < n2)
			return (int) (Math.random() * (n2 - n1 + 1) + n1);
		else
			return (int) (Math.random() * (n1 - n2 + 1) + n2);
	}

}


/*[ 실습 3 ]
1. 클래스명 : MethodLab3

2. 구현해야 하는 메서드
    public static int getRandom(int n) 
	1 부터 n 까지 범위의 난수 리턴
    public static int getRandom(int n1, int n2) 
	n1 부터 n2 범위의 난수 리턴

3. main() 메서드
       getRandom(10) 을 5번 호출하고 리턴값을 하나의 행에 출력
	x, x, x, x, x

       getRandom(10, 20) 을 5번 호출하고 리턴값을 하나의 행에 출력
	x, x, x, x, x

*/
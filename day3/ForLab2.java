package day3;

public class ForLab2 {
	public static void main(String[] args) {
		int even = 1;  //int even=1, odd=1 같은 타입이면 한 줄에 선언해도 됨
		int odd = 1;
		for (int n = 5; n <= 20; n++) {
			if (n % 2 == 0) {
				even = even * n; // even *= n  랑 같음
			} else {
				odd = odd * n;// odd*=n
			}

		}
		System.out.println("짝수의 곱 : " + even + "\n" + "홀수의 곱 : " + odd);
	}
}

/*실습2  
1. ForLab2 이라는 클래스를 생성한다.
2. 5부터 20사이의 자연수중에서
   짝수끼리 곱한 결과 홀수끼리 곱한 결과를 다음과 같이 출력한다.
   [ 출력 형식 ]
   짝수의 곱 : xxx
   홀수의 곱 : xxx
3. for 문은 반드시 하나만 사용한다.
*/
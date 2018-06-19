package day2;
public class TimeTest {
	public static void main(String[] args) {
		int time=32150;
		int a=time/3600;
		int b=time/60-a*60;
		int c=time-3600*a-60*b;
		System.out.println(a+"시간"+b+"분"+c+"초");
		
		/*int time=32150;
		int a=time/3600;
		int b=(time%3600)/60;
		int c=(time%3600)%60;
		
		int c=time%60;
		int b=(time/60)%60;
		int a=time/3600;*/

	}

}



/*실습 3 : 연산자 실습

1. TimeTest 라는 클래스를 생성한다.
2. time 이라는 변수를 선언하여 32150 이라는 값을 초기화 한다.   
3. time 변수의 값으로 "XX시간 XX분 XX초" 형식으로 변환하여 출력한다.*/

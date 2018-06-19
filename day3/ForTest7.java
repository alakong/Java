package day3;
public class ForTest7 {
	public static void main(String[] args) {
		int x=1, y=10;//for문 밖에서도 사용가능
		for(;x<=5 && y>=5; x++,y--){//초기식 생략가능, 조건식엔 식이 하나만. 식이 두개면 논리연산자로 하나식으로만 만들어서 가능!
			System.out.println("x="+x+", y="+y);
		}
		System.out.println("종료 : x="+x+", y="+y);

	}

}

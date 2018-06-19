package day1;
public class TypeTest2 {
	public static void main(String[] args) {
		System.out.println(7777777777L);//기본인 int는 9개까지 10개는 그 범위를 넘으므로 뒤에  L 을 붙여 롱형으로 만들어줌
		//System.out.println(true+1);불가능
		System.out.println(10+1);
		System.out.println("10"+1);//문자열결합
		//+연산자(덧셈, 문자열 결함 두가지 기능이있음)
		System.out.println("곱셈결과:" +10*2);
		System.out.print("곱셈결과:");//ln을 빼면 줄바꿈이 안됨
		System.out.println(10*2);
		System.out.println("덧셈결과:"+10+2);//연산자의 우선순위에 의해 왼쪽의+가 먼저 문자열과 결합되기 때문에 102가 나오는것 
		System.out.println("덧셈결과:"+(10+2));
		System.out.println("나눗셈결과:"+10/2);//얘는 나눗셈이 +보다 우선순위가 높기 때문에 괄호 안 묶어도 제대로 나옴
		//System.out.println("뺄셈결과:"+10-2); -연산자는 문자열에 대해 결합이 안되므로 오류가 뜨는 것
		System.out.println("뺄셈결과:"+(10-2));
	}

}

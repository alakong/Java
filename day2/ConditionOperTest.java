package day2;

public class ConditionOperTest {
	public static void main(String[] args) {
		//출력 형식 조건 (단, 출력문장은 한 번만 구현한다.)
		int a = (int) (Math.random() * 5) + 1;
		int result;
		if (a == 1) {
			result=(300 + 50);
		} else if (a == 2) {
			result=(300 - 50);
		} else if (a == 3) {
			result=(300 * 50);
		} else if (a == 4) {
			result=(300 / 50);
		} else {
			result=(300 % 50);
		}
		System.out.println("결과값:"+result);
	}

}
/*실습 2 - if 문 사용 실습
1. ConditionOperTest 라는 클래스를 생성한다.
2. 1부터 5사이의 랜덤값을 추출한다.
3. 추출된 값이 1이면 300 과 50 의 덧셈 연산을 처리한다.
    추출된 값이 2이면 300 과 50 의 뺄셈 연산을 처리한다.
    추출된 값이 3이면 300 과 50 의 곱센 연산을 처리한다.
    추출된 값이 4이면 300 과 50 의 나눗셈 연산을 처리한다.
    추출된 값이 5이면 300 과 50 의 나머지 연산을 처리한다.
4. 출력 형식(단, 출력문장은 한 번만 구현한다.)
    결과값 : XX*/
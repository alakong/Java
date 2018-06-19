package day11;

public class ExceptionTest1 {

	public static void main(String[] args) throws Exception {// 예외처리구문
		// TODO Auto-generated method stub
		System.out.println("수행시작");
		try {//예외가 발생할 수있는 여러 수행문장들을 넣어놓는것. 예외 발생 안하는 문장 넣어도 상관은 없음
			//하지만 예외가 발생할 수 있는 문장이 최소한 하나 이상 있어야함.
			int num1 = Integer.parseInt(args[0]);// Integer.parseInt()
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println("연산 결과 :" + result);
		} /* catch (ArrayIndexOutOfBoundsException e) {//하나의 try블럭에 catch블럭은 0개이상 있을 수 있음.
			System.out.println("두개의 프로그램 아규먼트를 입력하세요.");//예외 발생 시 처리할 코드(0개 이상의 수행문장)
		}*/ catch (ArithmeticException e) {//여기서 e는 클래스 이름을 줄인 것
			System.out.println("두번째 숫자는 0일수 없어요.");
			/*System.out.println(e.getMessage());
			System.out.println(e);*/
			e.printStackTrace();//에러발생 과정을 발생시작부터 거꾸로 찾아올라가는걸 출력해줌
			return;//호출한 곳으로 되돌아가->메인에서는 프로그램수행 종료/이때도 finally는 마지막으로 수행하고 끝냄
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요.");
			e.printStackTrace();
		}catch (Exception e) {//위에 애들을 다 포함하는 클래스이므로 맨 아래에 두어야 위에애들이 수행됨
			System.out.println("두개의 프로그램 아규먼트를 입력하세요.");
		}finally {//try블럭에 finally는 한개만 오거나 생략할 수 있음.예외 발생 유무 상관없이 무조건 수행
			System.out.println("이 블럭은 반드시 수행합니다요..");

		}//하지만 try 뒤에 catch, finally 둘중에 하나는 있어야함!!!!!!!!!
		System.out.println("수행종료");

	}
}

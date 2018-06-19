package day5;

public class MethodTest3 {
	public static void main(String[] args) {
	System.out.println("main() 메서드 수행 시작");
    char result = (char)addNumber();//타입이 서로 다르면 형변환 필요
	System.out.println("호출 결과값1 : " + result);//여러번 사용할 때는 변수 안에 넣어놓고 사용하는 것이 편리함
	System.out.println("호출 결과값2 : " + result);
	System.out.println("호출 결과값3 : " + result);
	/*System.out.println("호출 결과값1 : " + addNumber());
	System.out.println("호출 결과값2 : " + addNumber());
	System.out.println("호출 결과값3 : " + addNumber());*/
	System.out.println("main() 메서드 수행 종료");
	}
	public static int addNumber(){//매개변수 없음, 리턴값의 타입은 리턴되는 결과값과 같은 타입으로 
		return 28+20;
				}
	}



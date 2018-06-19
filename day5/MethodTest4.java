package day5;

public class MethodTest4 {
	public static void main(String[] args) {
	System.out.println("main() 메서드 수행 시작");
    int result = addNumber();
	System.out.println("호출 결과값1 : " + result);
	
	result=addNumber(100,200,300);
	System.out.println("호출 결과값2 : " + result);
	
	result=addNumber(1000,2000);
	System.out.println("호출 결과값3 : " + result);
	
	//매개변수 있고 없고 개수에 따라 알아서 호출
	
	System.out.println("main() 메서드 수행 종료");
	}
	
	public static int addNumber(){
		return 28+20;
				}
	
	public static int addNumber(int n1, int n2){//위에랑 차이는 매개변수 정의 유무
		return n1+n2;
				}
	
	public static int addNumber(int n1, int n2, int n3){
		return n1+n2+n3;
				}
	}



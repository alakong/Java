package day8;

//A-B-C 순으로 계층구조를 가진 클래스구조
class A{
	A(){
		//super(); 컴파일시 자동으로 넣어져있음
		System.out.println("A클래스의 객체 생성");
	}
}

class B extends A{
	B(int num){

		System.out.println("B클래스의 객체 생성");
	}
}

class C extends B{
	C(){
		super(10);//직접 super메소드를 호출하고 조상이 가진 특징을 넣어 전달해줘야함/조상인 B클래스가 int num 아규먼트를 받으므로 super를 호출했음
		System.out.println("C클래스의 객체 생성");
	}
}


public class ABCTest {

	public static void main(String[] args) {
		new C();//C클래스의 생성자 메서드를 호출한 것	
		//this를 제외한 생성자 메서드는 조상의 생성자를 먼저 호출하는 기능을 자동으로 갖는다
		
	}

}

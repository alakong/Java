package day8;

class Parent extends java.lang.Object {// extends java.lang.Object은 생략가능

	int x=1;
	int y=2;
	
	public String toString() {//오버라이딩한것
		return super.toString() + ": Parent 클래스의 객체임!!";// super.붙이면 이 클래스멤버말고
														// 조상꺼를 호출하게함
	}

}

class Child extends Parent {
	int x=10;
	void pr(){
		int x=100;
		System.out.println(x);//먼저 지역변수 x체크->멤버변수 체크->조상 체크
		System.out.println(this.x);//this는 지역변수 말고 이 클래스의 x를 묻는것
		System.out.println(super.x);//조상에 있는 x
		System.out.println(y);//없으니까 조상까지 가서 2
		System.out.println(this.y);
		System.out.println(super.y);
		//System.out.println(z); 없는 변수니까 에러남
	}
}

public class ParentChildTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);// 마찬가지로 tostring 결과 출력
		System.out.println("===================");
		Child c = new Child();
		System.out.println(c.toString());// parent의 toString출력
		System.out.println(c);
		c.pr();

	}

}

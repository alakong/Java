package day8;

//A-B-C ������ ���������� ���� Ŭ��������
class A{
	A(){
		//super(); �����Ͻ� �ڵ����� �־�������
		System.out.println("AŬ������ ��ü ����");
	}
}

class B extends A{
	B(int num){

		System.out.println("BŬ������ ��ü ����");
	}
}

class C extends B{
	C(){
		super(10);//���� super�޼ҵ带 ȣ���ϰ� ������ ���� Ư¡�� �־� �����������/������ BŬ������ int num �ƱԸ�Ʈ�� �����Ƿ� super�� ȣ������
		System.out.println("CŬ������ ��ü ����");
	}
}


public class ABCTest {

	public static void main(String[] args) {
		new C();//CŬ������ ������ �޼��带 ȣ���� ��	
		//this�� ������ ������ �޼���� ������ �����ڸ� ���� ȣ���ϴ� ����� �ڵ����� ���´�
		
	}

}

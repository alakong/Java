package day8;

class Parent extends java.lang.Object {// extends java.lang.Object�� ��������

	int x=1;
	int y=2;
	
	public String toString() {//�������̵��Ѱ�
		return super.toString() + ": Parent Ŭ������ ��ü��!!";// super.���̸� �� Ŭ�����������
														// ���󲨸� ȣ���ϰ���
	}

}

class Child extends Parent {
	int x=10;
	void pr(){
		int x=100;
		System.out.println(x);//���� �������� xüũ->������� üũ->���� üũ
		System.out.println(this.x);//this�� �������� ���� �� Ŭ������ x�� ���°�
		System.out.println(super.x);//���� �ִ� x
		System.out.println(y);//�����ϱ� ������� ���� 2
		System.out.println(this.y);
		System.out.println(super.y);
		//System.out.println(z); ���� �����ϱ� ������
	}
}

public class ParentChildTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);// ���������� tostring ��� ���
		System.out.println("===================");
		Child c = new Child();
		System.out.println(c.toString());// parent�� toString���
		System.out.println(c);
		c.pr();

	}

}

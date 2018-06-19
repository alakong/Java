package day11;

import java.util.Random;

class TestException extends Exception {
	TestException(String message) {
		super(message);
	}
}

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main()�������");
		a();
		System.out.println("main()��������");

	}

	static void a() {
		System.out.println("a()�������");
		try {
			b();
		} catch (TestException e) {
			System.out.println("���� �߻�: " + e.getMessage());
			return;
			//e.printStackTrace();
			//System.exit(0);//�ٷ� ���α׷� ������,�ظ��ϸ� ��������
		
		}
		System.out.println("a()��������");

	}

	static void b() throws TestException {
		System.out.println("b()�������");
		c();
		System.out.println("b()��������");

	}

	static void c() throws TestException {
		System.out.println("c()�������");
		boolean flag = new Random().nextBoolean();
		if (flag) {
			throw new TestException("<<::::�׽�Ʈ�� ���ܹ߻���Ŵ::::>>");
		} else {
			System.out.println("��������");
		}
		System.out.println("c()��������");
	}

}
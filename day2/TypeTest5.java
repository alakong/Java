package day2;
public class TypeTest5 {
	public static void main(String[] args) {
		int num1=10;
		double num2=num1;//�Ǽ��̹Ƿ� �Ҽ����� ���� ǥ��
		System.out.println(num1+":"+num2);
		num2=3.14;
		System.out.println(num2);
		//num1=num2; int���� double�����δ� �����ϳ� �ݴ�� �Ұ�,������ ��ũ�ϱ�
		num1=(int)num2;//num2 double���� ������ int������ �ٲ� �Ŀ� ����, �Ҽ��� �߷��� ����
		System.out.println(num1);

	}

}

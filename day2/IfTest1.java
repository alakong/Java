package day2;
public class IfTest1 {
	public static void main(String[] args) {
		int num= (int)(Math.random()*10)+1;
		if(num%2==0)//if��
			System.out.println(num+" : ¦��");
		else//else��, else���� ���ټ��� ���� �׷� ��� ���⼭�� ¦���� ����
			System.out.println(num+" : Ȧ��");
		System.out.println("��������");
		
	/*	int num= (int)(Math.random()*10)+1;
		if(num%2!= 0)//���̳� �ƴϳ�->0�� �ƴϸ� ���̰� Ȧ����
			System.out.println(num+" : Ȧ��");
		else
			System.out.println(num+" : ¦��");
		System.out.println("��������");*/
	}
}

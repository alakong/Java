package day2;
public class OperTest2 {
	public static void main(String[] args) {
		int su=10;
		su += 10;//su=su+10
		System.out.println(su);
		char ch1='A';
		ch1++;//�빮�� B�� ��
		System.out.println(ch1);
		ch1 += 5;// ch1 = ch1 + 5 -> 5��ŭ ���ĺ� �ڷ�
		System.out.println(ch1);
		//ch1=ch1+10; �Ұ�>������� ����(+,*,-,/,%)�� ������ Ÿ���� �ٸ��� ������� ����
		//ch1=(char)ch1+10; �Ұ�>+�����ڰ�char���� �켱������ ���� ������ �Ʒ�ó�� ��ȣ�ʿ�
		ch1=(char)(ch1+10);
		System.out.println(ch1);
		
	}

}

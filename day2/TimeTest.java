package day2;
public class TimeTest {
	public static void main(String[] args) {
		int time=32150;
		int a=time/3600;
		int b=time/60-a*60;
		int c=time-3600*a-60*b;
		System.out.println(a+"�ð�"+b+"��"+c+"��");
		
		/*int time=32150;
		int a=time/3600;
		int b=(time%3600)/60;
		int c=(time%3600)%60;
		
		int c=time%60;
		int b=(time/60)%60;
		int a=time/3600;*/

	}

}



/*�ǽ� 3 : ������ �ǽ�

1. TimeTest ��� Ŭ������ �����Ѵ�.
2. time �̶�� ������ �����Ͽ� 32150 �̶�� ���� �ʱ�ȭ �Ѵ�.   
3. time ������ ������ "XX�ð� XX�� XX��" �������� ��ȯ�Ͽ� ����Ѵ�.*/

package day3;

public class ForLab2 {
	public static void main(String[] args) {
		int even = 1;  //int even=1, odd=1 ���� Ÿ���̸� �� �ٿ� �����ص� ��
		int odd = 1;
		for (int n = 5; n <= 20; n++) {
			if (n % 2 == 0) {
				even = even * n; // even *= n  �� ����
			} else {
				odd = odd * n;// odd*=n
			}

		}
		System.out.println("¦���� �� : " + even + "\n" + "Ȧ���� �� : " + odd);
	}
}

/*�ǽ�2  
1. ForLab2 �̶�� Ŭ������ �����Ѵ�.
2. 5���� 20������ �ڿ����߿���
   ¦������ ���� ��� Ȧ������ ���� ����� ������ ���� ����Ѵ�.
   [ ��� ���� ]
   ¦���� �� : xxx
   Ȧ���� �� : xxx
3. for ���� �ݵ�� �ϳ��� ����Ѵ�.
*/
package day5;

public class MethodLab2 {
	public static void main(String[] args) {
		int result;
		for (int i = 1; i <= 5; i++) {
			int num1 = (int) (Math.random() * 30) + 1;
			int num2 = (int) (Math.random() * 30) + 1;
			result = gap(num1, num2);
			System.out.println("" + '"' + num1 + " �� " + num2 + " �� ���� " + result + " �Դϴ�." + '"');
//�޼ҵ� ȣ�Ⱚ �ѹ�����ҰŸ� ������ ���� �ȴ�Ƶ� ��, �ٷ� ȣ������� �־ ��!
		}

	}

	public static int gap(int n1, int n2) {
		if (n1 > n2)
			return n1 - n2;
		else
			return n2 - n1;
		
		//Mat.abs(a,b) �� ������ ���ϴ� api

	}

}

/*[ �ǽ� 2 ]
1. Ŭ������ : MethodLab2

2. �����ؾ� �ϴ� �߰� �޼��� (public static �ٿ���)
   �Ű����� : int Ÿ������ 2 ��
   ���ϰ� : int Ÿ������ 1��
   �޼���� : ���Ƿ�
   ��� : ���޹��� 2���� ������ �߿��� ū ������ ���� ���� 
            ���� ���� �� ���� �����ϸ� 0 �� �����Ѵ�.
           10, 20 �� ���޵Ǹ� ---> 10 ����
           20, 5 �� ���޵Ǹ� ---> 15 ����
           5, 30 �� ���޵Ǹ� ---> 25 ����
           6, 3 �� ���޵Ǹ�  ---> 3 ����

3. main() �޼��忡���� 
   1���� 30 ������ ���� 2 ���� �����Ͽ� 2������ ������ �޼��带 
   ����� ������ ���� �������� ����Ѵ�.
   "X �� Y �� ���� W �Դϴ�."
   ----> 5 ȸ �ݺ�

*/
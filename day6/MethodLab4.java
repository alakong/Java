package day6;

public class MethodLab4 {

	public static void main(String[] args) {
		print(maxNumArray(new int[] { 10, 20, 30 }));
		print(maxNumArray(new int[] { 100, 500, 300, 200, 400 }));
		print(maxNumArray(new int[] { 1, 10, 3, 4, 5, 8, 7, 6, 9, 2 }));

	}

	public static int maxNumArray(int su[]) {
		int max = su[0];
		for (int i = 0; i < su.length; i++) {
			if (max < su[i]) {
				max = su[i];
			}
		}
		return max;
	}

	public static void print(int n) {
		System.out.println("���� ū ���� " + n + " �Դϴ�.");
		// = System.out.print("���� ū ���� %d�Դϴ�.\n",n);

	}

}

/*[ �ǽ� 4 ]

1. Ŭ������ : MethodLab4
2. �����ؾ� �ϴ� �޼���  
   �޼���� : maxNumArray
   �Ű����� Ÿ�� : int[]
   ���ϰ��� Ÿ�� : int

   �Ű������� ���޵� �迭�� ���Ұ��� �߿��� ���� ū�� ����
   
3. main() �޼��忡�� maxNumArray �� 3�� ȣ���Ѵ�.
   ���� �迭���� �����Ͽ�
   �迭 1 : 10, 20, 30
   �迭 2 : 100, 500, 300, 200, 400
   �迭 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
  
   ���� ū ���� 30 �Դϴ�.
   ���� ū ���� 500 �Դϴ�.
   ���� ū ���� 10 �Դϴ�.
*/
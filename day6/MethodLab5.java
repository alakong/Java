package day6;

public class MethodLab5 {
	public static void main(String[] args) {
		printNumbers(powerArray(2));
		printNumbers(powerArray(3));
		printNumbers(powerArray(4));
		
		
		int r5[]=powerArray(5);
		MethodTest5.printNumbers(r5);//MethodTest5�� �ִ� �޼ҵ带 ȣ���� ��������

	}

	public static int[] powerArray(int num) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (i + 1) * num;
		}
		return arr;
	}

	public static void printNumbers(int arr[]) {
		for (int num : arr)//���� for���� �Ϲ����� for���� �޸� �迭�̳� �÷��ǿ� ����� ��ҵ��� �о���� �뵵�θ� ���
			System.out.print(num + " ");
		System.out.println();//MethodTest5�� �ִ� �޼ҵ带 ȣ���� ��������

	}
}
	
	/*[ �ǽ� 5 ]

			1. Ŭ������ : MethodLab5
			2. �����ؾ� �ϴ� �޼���  
			   �޼���� : powerArray
			   �Ű����� Ÿ�� : int
			   ���ϰ��� Ÿ�� : int[]

			   1���� 10������ �ڿ��� �迭�� ����
			   ������ ���Ҹ� �Ű������� ���޵� ����ŭ ����� �����
			   �����Ѵ�.

			3. main() �޼��忡�� powerArray �� 3�� ȣ���Ѵ�.
			   
				int r1[] = powerArray(2);
				int r2[] = powerArray(3);
				int r3[] = powerArray(4);

			                [ ��� ��� ]
				2,4,6,8,10,12,14,16,18,20
			 	3,6,9,12,15,18,21,24,27,30
				4,8,12,16,20,24,28,32,36,40
*/
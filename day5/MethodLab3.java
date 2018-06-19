package day5;
public class MethodLab3 {
	public static void main(String[] args) {
		int result;
		for (int i = 1; i <= 5; i++) {
			result = getRandom(10);//�ѹ������� �������� ���ϰ� ȣ����� ���� �����ص���
			System.out.print(result);
			if (i != 5)
				System.out.print(", ");
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			result = getRandom(10, 20);
			System.out.print(result);
			if (i != 5)
				System.out.print(", ");

		}

	}

	public static int getRandom(int n) {
		return (int) (Math.random() * n) + 1;

	}

	public static int getRandom(int n1, int n2) {
		if (n1 < n2)
			return (int) (Math.random() * (n2 - n1 + 1) + n1);
		else
			return (int) (Math.random() * (n1 - n2 + 1) + n2);
	}

}


/*[ �ǽ� 3 ]
1. Ŭ������ : MethodLab3

2. �����ؾ� �ϴ� �޼���
    public static int getRandom(int n) 
	1 ���� n ���� ������ ���� ����
    public static int getRandom(int n1, int n2) 
	n1 ���� n2 ������ ���� ����

3. main() �޼���
       getRandom(10) �� 5�� ȣ���ϰ� ���ϰ��� �ϳ��� �࿡ ���
	x, x, x, x, x

       getRandom(10, 20) �� 5�� ȣ���ϰ� ���ϰ��� �ϳ��� �࿡ ���
	x, x, x, x, x

*/
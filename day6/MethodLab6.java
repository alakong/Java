package day6;

public class MethodLab6 {
	public static void main(String[] args) {
		char[] a1 = { 'A', 'b', 'C' };
		char[] a2 = { 'a', 'b', 'c', 'D', 'E', 'F' };
		char[] a3 = { 'z', 'S', 'Z', 'S' };
		System.out.println("---------------");

		printLay(a1);
		printLay(a2);
		printLay(a3);

	}

	public static void convertChar(char[] cha) {
		for (int i = 0; i < cha.length; i++) {
			if (cha[i] >= 'A' && cha[i] <= 'Z')
				cha[i] += 32;
			else if (cha[i] >= 'a' && cha[i] <= 'z')
				cha[i] -= 32;

		}

	}

	public static void printLay(char[] cha) {
		System.out.print("ȣ���� : ");
		System.out.print(cha);//���ڹ迭�� for�� �Ƚᵵ �迭 �޷�� ����Ʈ��
		
		System.out.println();

		convertChar(cha);
		System.out.print("ȣ���� : ");
		System.out.print(cha);
		
		System.out.println();
		System.out.println("---------------");

	}
}

/*[ �ǽ� 6 ] �Ű������� �迭Ÿ���� ��쿣 INOUT ���� �����Ѵ�.
1. Ŭ������ : MethodLab6
2. �����ؾ� �ϴ� �޼���  
   �޼���� : convertChar
   �Ű����� Ÿ�� : char[]
   ���ϰ��� Ÿ�� : void
   �Ű��������� ���޵� �迭�� ���Ұ��� �빮���̸� 
   �ҹ��ڷ� �ҹ����̸� �빮�ڷ� ��ȯ�Ѵ�.
3. main() �޼��忡�� convertChar �� 3�� ȣ���Ѵ�.
   ���� �迭���� �����Ͽ� ���� �迭 ����(a1, a2, a3)�� ���
   �迭 1 : A, b, C
   �迭 2 : a, b, c, D, E, F
   �迭 3 : z, S, Z, S
  
   �迭 ������ �����ϸ鼭 �޼��带 ȣ���� ����  
   �迭���� a1, a2, a3�� ���Ұ����� ������ ���� ����Ѵ�.
   ��� ����� main() �޼��忡�� �Ѵ�.

  [ ��� ��� ]
   -------------
   ȣ���� : AbC
   ȣ���� : aBc
   -------------
   ȣ���� : abcDEF
   ȣ���� : ABCdef
   -------------
   ȣ���� : zSZS
   ȣ���� : Zszs
   -------------*/


package day6;

public class MethodTest6 {
	public static void main(String[] args) {
		int[] ary = { 1, 2, 3, 4, 5 };// updateArray�޼ҵ� ������ ���� �̸��̾ �������
		System.out.println(ary);

		MethodTest5.printNumbers(ary);
		updateArray(ary);
		MethodTest5.printNumbers(ary);

	}

	public static void updateArray(int[] ary) {
		for (int i = 0; i < ary.length; i++)
			ary[i] *= 10;
	}

}

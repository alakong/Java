package day6;

public class MethodTest6 {
	public static void main(String[] args) {
		int[] ary = { 1, 2, 3, 4, 5 };// updateArray메소드 변수랑 같은 이름이어도 관계없음
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

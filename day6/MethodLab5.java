package day6;

public class MethodLab5 {
	public static void main(String[] args) {
		printNumbers(powerArray(2));
		printNumbers(powerArray(3));
		printNumbers(powerArray(4));
		
		
		int r5[]=powerArray(5);
		MethodTest5.printNumbers(r5);//MethodTest5에 있는 메소드를 호출할 수도있음

	}

	public static int[] powerArray(int num) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (i + 1) * num;
		}
		return arr;
	}

	public static void printNumbers(int arr[]) {
		for (int num : arr)//향상된 for문은 일반적인 for문과 달리 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용
			System.out.print(num + " ");
		System.out.println();//MethodTest5에 있는 메소드를 호출할 수도있음

	}
}
	
	/*[ 실습 5 ]

			1. 클래스명 : MethodLab5
			2. 정의해야 하는 메서드  
			   메서드명 : powerArray
			   매개변수 타입 : int
			   리턴값의 타입 : int[]

			   1부터 10사이의 자연수 배열을 만들어서
			   각각의 원소를 매개변수에 전달된 값만큼 배수로 만들어
			   리턴한다.

			3. main() 메서드에서 powerArray 를 3번 호출한다.
			   
				int r1[] = powerArray(2);
				int r2[] = powerArray(3);
				int r3[] = powerArray(4);

			                [ 결과 출력 ]
				2,4,6,8,10,12,14,16,18,20
			 	3,6,9,12,15,18,21,24,27,30
				4,8,12,16,20,24,28,32,36,40
*/
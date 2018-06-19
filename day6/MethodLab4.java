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
		System.out.println("가장 큰 값은 " + n + " 입니다.");
		// = System.out.print("가장 큰 값은 %d입니다.\n",n);

	}

}

/*[ 실습 4 ]

1. 클래스명 : MethodLab4
2. 정의해야 하는 메서드  
   메서드명 : maxNumArray
   매개변수 타입 : int[]
   리턴값의 타입 : int

   매개변수에 전달된 배열의 원소값들 중에서 가장 큰값 리턴
   
3. main() 메서드에서 maxNumArray 를 3번 호출한다.
   다음 배열들을 전달하여
   배열 1 : 10, 20, 30
   배열 2 : 100, 500, 300, 200, 400
   배열 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
  
   가장 큰 값은 30 입니다.
   가장 큰 값은 500 입니다.
   가장 큰 값은 10 입니다.
*/
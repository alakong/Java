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
		System.out.print("호출전 : ");
		System.out.print(cha);//문자배열은 for문 안써도 배열 쭈루룩 프린트됨
		
		System.out.println();

		convertChar(cha);
		System.out.print("호출후 : ");
		System.out.print(cha);
		
		System.out.println();
		System.out.println("---------------");

	}
}

/*[ 실습 6 ] 매개변수가 배열타입인 경우엔 INOUT 으로 동작한다.
1. 클래스명 : MethodLab6
2. 정의해야 하는 메서드  
   메서드명 : convertChar
   매개변수 타입 : char[]
   리턴값의 타입 : void
   매개변수한테 전달된 배열의 원소값을 대문자이면 
   소문자로 소문자이면 대문자로 변환한다.
3. main() 메서드에서 convertChar 를 3번 호출한다.
   다음 배열들을 생성하여 각각 배열 변수(a1, a2, a3)에 담고
   배열 1 : A, b, C
   배열 2 : a, b, c, D, E, F
   배열 3 : z, S, Z, S
  
   배열 변수를 전달하면서 메서드를 호출한 다음  
   배열변수 a1, a2, a3의 원소값들을 다음과 같이 출력한다.
   모든 출력은 main() 메서드에서 한다.

  [ 출력 결과 ]
   -------------
   호출전 : AbC
   호출후 : aBc
   -------------
   호출전 : abcDEF
   호출후 : ABCdef
   -------------
   호출전 : zSZS
   호출후 : Zszs
   -------------*/


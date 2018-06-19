package day3;

public class ForLab3 {
	public static void main(String[] args) {
		for(int a=9;a>=5;a--){
			System.out.print(a+"단 : ");
			for(int num=1;num<=9;num++){
				System.out.print(a+"x"+num+"="+a*num+"\t");
			}
			System.out.println();
		}
	}

}
/*실습3 - 구구단 출력(for 문 사용)
1. ForLab3 라는 클래스를 생성한다.
2. 9단부터 5단까지의 구구단을 출력한다. 출력 형식은 다음과 같다.

   9단 : 9x1=9 	9x2=18	9x3=27	9x4=36	9x5=45	9x6=54 ....
   8단 : 8x1=8	8x2=16	8x3=24      ...
   7단 :
   6단 :
   5단 :
*/
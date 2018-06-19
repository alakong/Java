package day2;
public class IfTest1 {
	public static void main(String[] args) {
		int num= (int)(Math.random()*10)+1;
		if(num%2==0)//if문
			System.out.println(num+" : 짝수");
		else//else절, else절은 없앨수도 있음 그럴 경우 여기서는 짝수만 나옴
			System.out.println(num+" : 홀수");
		System.out.println("수행종료");
		
	/*	int num= (int)(Math.random()*10)+1;
		if(num%2!= 0)//참이냐 아니냐->0이 아니면 참이고 홀수임
			System.out.println(num+" : 홀수");
		else
			System.out.println(num+" : 짝수");
		System.out.println("수행종료");*/
	}
}

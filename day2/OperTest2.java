package day2;
public class OperTest2 {
	public static void main(String[] args) {
		int su=10;
		su += 10;//su=su+10
		System.out.println(su);
		char ch1='A';
		ch1++;//대문자 B가 됨
		System.out.println(ch1);
		ch1 += 5;// ch1 = ch1 + 5 -> 5만큼 알파벳 뒤로
		System.out.println(ch1);
		//ch1=ch1+10; 불가>산술이항 연산(+,*,-,/,%)은 두항이 타입이 다르면 맞춰놓고 연산
		//ch1=(char)ch1+10; 불가>+연산자가char보다 우선순위가 낮기 때문에 아래처럼 괄호필요
		ch1=(char)(ch1+10);
		System.out.println(ch1);
		
	}

}

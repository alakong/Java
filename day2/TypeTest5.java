package day2;
public class TypeTest5 {
	public static void main(String[] args) {
		int num1=10;
		double num2=num1;//실수이므로 소수점을 같이 표현
		System.out.println(num1+":"+num2);
		num2=3.14;
		System.out.println(num2);
		//num1=num2; int에서 double형으로는 가능하나 반대는 불가,더블이 더크니까
		num1=(int)num2;//num2 double형을 강제로 int형으로 바꾼 후에 가능, 소수점 잘려서 나옴
		System.out.println(num1);

	}

}

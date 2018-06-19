package day8;
import java.util.Scanner;
class CalculatorExpr {
	int num1;
	int num2;

	CalculatorExpr(int a, int b) {
		num1 = a;
		num2 = b;
	}

	int getAddition() {
		return num1 + num2;
	}

	int getSubtraction() {
		int sub;
		if (num1 > num2) {
			sub = num1 - num2;
		} else
			sub = num2 - num1;
		return sub;
	}

	int getMultiplication() {
		return num1 * num2;
	}

	double getDivision() {
		return (double) num1/num2;
	}
}

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		while(true){
		System.out.println("숫자 두개를 입력하세요");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		CalculatorExpr scanNum = new CalculatorExpr(n1,n2);
		System.out.printf("추출된 숫자 : %d, %d%n덧셈 : %d%n뺄셈 : %d%n나눗셈  : %f",
				n1,n2,scanNum.getAddition(),scanNum.getSubtraction(),scanNum.getMultiplication(),scanNum.getDivision());
		System.out.println("계속하려면 1입력 종료하려면 2입력");
		
		if(scan.nextInt()==2)
			break;}
		scan.close();
		
	

	}

}

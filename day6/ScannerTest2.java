package day6;
import java.util.Scanner;
public class ScannerTest2 {
	public static void main(String[] args) {
		System.out.print("입력 : ");

		Scanner sc = new Scanner(System.in);
		String a,b,c,d;
		a = sc.nextLine();//한 행을 읽어라
		b = sc.nextLine();
		c = sc.nextLine();
		d = sc.nextLine();
		System.out.println("a = [" + a + "]");
		System.out.println("b = [" + b+ "]");
		System.out.println("c = [" + c+ "]");
		System.out.println("d = [" + d+ "]");	
		sc.close();
	}
}

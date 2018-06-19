package day6;
import java.util.Scanner;
public class ScannerTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("데이터를 입력하세요 : ");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.nextLine();  // 입력버퍼에 남아있는 개행문자를 청소하는 기능
		String line1 = sc.nextLine();//nextline은 개행문자가 인식될때까지 읽음. 첫 nextline은 앞에 블랭크까지 다읽음
		String line2 = sc.nextLine();
		System.out.printf("[%s] [%s] [%s] [%s]", str1, str2, line1, line2);
		sc.close();
	}
}







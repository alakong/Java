package day8;
import java.io.File;
public class FileTest {

	public static void main(String[] args) {//args라는 변수명은 바꿀수 있지만 나머지는 바꿀수없음 무조건 매개변수로 배열써야함!
		if(args.length==0){
			System.out.println("점검하려는 파일명을 프로그램 아규먼트로 전달하세요.");
			return;//유일하게 main에서 하는 리턴은 프로그램 종료를 뜻한다.
		}

		File f = new File(args[0]);//프로그램아규먼트는 배열객체, 메인함수의 매개변수 
		if (f.exists()) {
			if (f.isDirectory()) {
				System.out.println(args[0]+": 디렉토리입니다.");
			} else {
				System.out.println(args[0]+": "+f.length() + " 바이트의 파일입니다.");
			}
		} else {
			System.out.println(args[0]+": 존재하지 않습니다.");
		}
		
	}

}

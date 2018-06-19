package day8;

import java.io.File;
import java.util.Scanner;

public class FileTest2 {

	public static void main(String[] args) {
//점검하려는 파일명이나 디렉토리 명을 표준입력(키보드)으로 받아 처리하도록 소스수정
		System.out.println("점검하려는 파일명 입력 : ");
		Scanner scan =new Scanner(System.in);//System.in->키보드라는 표준입력장치를 사용
		String filename = scan.next();
		
		File f = new File(filename);
		if (f.exists()) {
			if (f.isDirectory()) {
				System.out.println("디렉토리입니다.");
			} else {
				System.out.println(f.length() + " 바이트의 파일입니다.");
			}
		} else {
			System.out.println("존재하지 않습니다.");
		}
		scan.close();
	}

}

package day8;

import java.io.File;
import java.util.Scanner;

public class FileTest2 {

	public static void main(String[] args) {
//�����Ϸ��� ���ϸ��̳� ���丮 ���� ǥ���Է�(Ű����)���� �޾� ó���ϵ��� �ҽ�����
		System.out.println("�����Ϸ��� ���ϸ� �Է� : ");
		Scanner scan =new Scanner(System.in);//System.in->Ű������ ǥ���Է���ġ�� ���
		String filename = scan.next();
		
		File f = new File(filename);
		if (f.exists()) {
			if (f.isDirectory()) {
				System.out.println("���丮�Դϴ�.");
			} else {
				System.out.println(f.length() + " ����Ʈ�� �����Դϴ�.");
			}
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		scan.close();
	}

}

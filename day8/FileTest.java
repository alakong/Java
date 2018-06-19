package day8;
import java.io.File;
public class FileTest {

	public static void main(String[] args) {//args��� �������� �ٲܼ� ������ �������� �ٲܼ����� ������ �Ű������� �迭�����!
		if(args.length==0){
			System.out.println("�����Ϸ��� ���ϸ��� ���α׷� �ƱԸ�Ʈ�� �����ϼ���.");
			return;//�����ϰ� main���� �ϴ� ������ ���α׷� ���Ḧ ���Ѵ�.
		}

		File f = new File(args[0]);//���α׷��ƱԸ�Ʈ�� �迭��ü, �����Լ��� �Ű����� 
		if (f.exists()) {
			if (f.isDirectory()) {
				System.out.println(args[0]+": ���丮�Դϴ�.");
			} else {
				System.out.println(args[0]+": "+f.length() + " ����Ʈ�� �����Դϴ�.");
			}
		} else {
			System.out.println(args[0]+": �������� �ʽ��ϴ�.");
		}
		
	}

}

package day13;

import java.io.*;

public class FileWriterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileWriter writer=new FileWriter("c:/iotest/output2.txt");){//try�ڿ��� �̷��� ��ȣ �ȿ��� �־�θ� �ڵ����� ����
			char arr[] = { '��', 'ü', '��', '��', '��', '��', 'J', 'a', 'v', 'a' };
			for (int cnt = 0; cnt < arr.length; cnt++) {
				writer.write(arr[cnt]);
			}
			writer.write("\n");
			writer.write(arr);
			writer.write("\n");
			writer.write("OCJP ������");
			writer.write("\n");
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}

	}

}

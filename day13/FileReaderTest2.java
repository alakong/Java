package day13;
import java.io.*;
public class FileReaderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� �྿ �а��ϴ� ���
		try(FileReader reader = new FileReader("c:/iotest/output.txt");//try�ڿ� ��ȣ �ȿ� ������ Ȯ��
			BufferedReader br=new BufferedReader(reader);){//bufferedReader�� ������ ���� ����� ������ �֤��Ӿ����Ƿ� ���ϸ����� ���͸��� �ΰ� �ʿ��Ѱ�
			String data;
				while(true){
				data = br.readLine();
				if(data==null)
					break;
				System.out.print(data);
			}
		}catch(FileNotFoundException fnfe){
			System.out.println("������ �������� �ʽ��ϴ�.");
		}catch(IOException ioe){
			System.out.println("������ ���� �� �����ϴ�.");
		}
				

	}

}
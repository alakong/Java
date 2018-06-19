package day13;
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader reader = new FileReader("c:/iotest/output.txt")){
			int data;
				while(true){
				data = reader.read();
				if(data==-1)
					break;
				System.out.print((char)data);
			}
		}catch(FileNotFoundException fnfe){
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException ioe){
			System.out.println("파일을 읽을 수 없습니다.");
		}
				

	}

}
package day13;
import java.io.*;
public class FileReaderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//한 행씩 읽게하는 방법
		try(FileReader reader = new FileReader("c:/iotest/output.txt");//try뒤에 괄호 안에 넣은것 확인
			BufferedReader br=new BufferedReader(reader);){//bufferedReader는 파일을 여는 기능을 가지고 있ㅈㅣ않으므로 파일리더랑 버터리더 두개 필요한것
			String data;
				while(true){
				data = br.readLine();
				if(data==null)
					break;
				System.out.print(data);
			}
		}catch(FileNotFoundException fnfe){
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException ioe){
			System.out.println("파일을 읽을 수 없습니다.");
		}
				

	}

}
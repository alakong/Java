package day13;

import java.net.*;
import java.io.*;

public class URLTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL req = new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=1165059000");
			InputStream is = req.openStream();//서버한테 요청보내고 받아오는 애
			InputStreamReader isr= new InputStreamReader(is, "UTF-8");//한글 깨진거 해결
			BufferedReader br= new BufferedReader(isr);//정보가 많을 때 행 단위로 읽으면 빠르므로 얘사용
			while (true) {
				String data = br.readLine();
				if (data == null)
					break;
				System.out.println(data);
			}
		} catch (MalformedURLException e) {
			System.out.println("URL문자열 오류" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 오류 :" + e.getMessage());
		}

	}
}

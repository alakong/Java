package day13;

import java.net.*;
import java.io.*;

public class URLTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL req = new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=1165059000");
			InputStream is = req.openStream();//�������� ��û������ �޾ƿ��� ��
			InputStreamReader isr= new InputStreamReader(is, "UTF-8");//�ѱ� ������ �ذ�
			BufferedReader br= new BufferedReader(isr);//������ ���� �� �� ������ ������ �����Ƿ� ����
			while (true) {
				String data = br.readLine();
				if (data == null)
					break;
				System.out.println(data);
			}
		} catch (MalformedURLException e) {
			System.out.println("URL���ڿ� ����" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO ���� :" + e.getMessage());
		}

	}
}

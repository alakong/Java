package day6;

import java.util.Calendar;
import java.util.Date;//java.lang ����� import�����
import java.util.GregorianCalendar;
public class DateTest {

	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d.toString());//��¥�� �ð�
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));//�Ѵ��� ��ĥ
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));//�ϳ��� ��ĥ
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));//�������� ���°
		


	}

}

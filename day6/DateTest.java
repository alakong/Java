package day6;

import java.util.Calendar;
import java.util.Date;//java.lang 빼고는 import써야함
import java.util.GregorianCalendar;
public class DateTest {

	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d.toString());//날짜랑 시간
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));//한달중 며칠
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));//일년중 며칠
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));//일주일중 몇번째
		


	}

}

package day13;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileWriterLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String korDayName[] = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		GregorianCalendar cal = new GregorianCalendar();

		try (FileWriter writer = new FileWriter("c:/iotest/lab_0109.txt")) {
			writer.write("오늘은 " + korDayName[cal.get(Calendar.DAY_OF_WEEK)] + "입니다.\r\n");
			cal.set(1993, 00, 06);
			writer.write("유정이는 " + korDayName[cal.get(Calendar.DAY_OF_WEEK)] + "에 태어났습니다.");

		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			System.out.println("수행 종료");
		}

	}

}

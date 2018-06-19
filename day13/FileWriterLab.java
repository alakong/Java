package day13;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileWriterLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String korDayName[] = { "", "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };

		GregorianCalendar cal = new GregorianCalendar();

		try (FileWriter writer = new FileWriter("c:/iotest/lab_0109.txt")) {
			writer.write("������ " + korDayName[cal.get(Calendar.DAY_OF_WEEK)] + "�Դϴ�.\r\n");
			cal.set(1993, 00, 06);
			writer.write("�����̴� " + korDayName[cal.get(Calendar.DAY_OF_WEEK)] + "�� �¾���ϴ�.");

		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			System.out.println("���� ����");
		}

	}

}

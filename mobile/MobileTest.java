package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m[] = new Mobile[2];//mobile Ŭ������ abstractŬ���� �̹Ƿ� ��ü�����Ұ�. ��ӹ��� �ڼյ� Ŭ������ ��ü�����ؾ���
		m[0] = new Ltab("Ltab", 500, "ABC-01");
		m[1] = new Otab("Otab", 1000, "XYZ-20");
		printTitle();
		printMobile(m);

		System.out.println();
		System.out.println("[10�� ����]");

		for (Mobile mobileArr : m) {
			mobileArr.charge(10);
		}
		printTitle();
		printMobile(m);

		System.out.println();
		System.out.println("[5�� ��ȭ]");
		for (Mobile mobileArr : m) {
			mobileArr.operate(5);
		}
		printTitle();
		printMobile(m);

	}

	public static void printMobile(Mobile[] mobile) {
		for (Mobile mobileArr : mobile) {
			System.out.println(
					mobileArr.getMobileName() + "\t\t" + mobileArr.getBatterySize() + "\t\t" + mobileArr.getOsType());
		}

	}

	public static void printTitle() {

		System.out.println("Mobile" + "\t\t" + "Battery" + "\t\t" + "OS");
		System.out.println("-------------------------------------");

	}

}

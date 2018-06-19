package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m[] = new Mobile[2];//mobile 클래스가 abstract클래스 이므로 객체생성불가. 상속받은 자손들 클래스를 객체생성해야함
		m[0] = new Ltab("Ltab", 500, "ABC-01");
		m[1] = new Otab("Otab", 1000, "XYZ-20");
		printTitle();
		printMobile(m);

		System.out.println();
		System.out.println("[10분 충전]");

		for (Mobile mobileArr : m) {
			mobileArr.charge(10);
		}
		printTitle();
		printMobile(m);

		System.out.println();
		System.out.println("[5분 통화]");
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

package work;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTV st = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rt = new RentalTV(100000, "RENTALTV-10", 42, 1);

		st.channelUp();
		st.channelUp();
		rt.channelDown();
		rt.channelDown();
		rt.channelDown();

		printAllTV(st);
		printAllTV(rt);
		printRentalTV(rt);

	}

	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		//tostring�� saleTV,RentalTV���� ���� �θ��� �޼ҵ带 
		//�������̵��Ͽ����Ƿ� tv.����Ʈ������ ȣ��� �ڼտ����� �޼ҵ���� ã�ƿö󰡴ٰ� �������̵��� �޼ҵ尡 ȣ���. 
		if (tv instanceof SaleTV) {
			((SaleTV) tv).play();
			//������ play�� �ڽĿ��� �߰��� �޼ҵ��̹Ƿ� tv�� �ڽ������� ����ȯ���Ѽ� �޼ҵ带 ã�� ���� �ؾ���
			((SaleTV) tv).sale();
		} else {
			((RentalTV) tv).play();
		}

	}

	static void printRentalTV(Rentable tv) {
		tv.rent();
	}

}

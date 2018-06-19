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
		//tostring은 saleTV,RentalTV에서 각각 부모의 메소드를 
		//오버라이딩하였으므로 tv.투스트링으로 호출시 자손영역의 메소드부터 찾아올라가다가 오버라이딩한 메소드가 호출됨. 
		if (tv instanceof SaleTV) {
			((SaleTV) tv).play();
			//하지만 play는 자식에서 추가된 메소드이므로 tv를 자식형으로 형변환시켜서 메소드를 찾아 가게 해야함
			((SaleTV) tv).sale();
		} else {
			((RentalTV) tv).play();
		}

	}

	static void printRentalTV(Rentable tv) {
		tv.rent();
	}

}

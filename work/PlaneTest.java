package work;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane L1= new Airplane("L747",1000);//�������� �빮�ڷ� ���°� �ƴ�~~~
		Cargoplane C1= new Cargoplane("C40",1000);
		
		printTitle();
		printInfo(L1);
		printInfo(C1);
		System.out.println();
		
		System.out.println("[100 ����]");
		printTitle();
		L1.flight(100);
		C1.flight(100);
		printInfo(L1);
		printInfo(C1);
		
		System.out.println();
		System.out.println("[200 ����]");
		printTitle();
		L1.refuel(200);
		C1.refuel(200);
		printInfo(L1);
		printInfo(C1);
		

	}
	
	public static void printInfo(Plane list){
	
		System.out.println(list.getPlaneName()+"\t\t"+list.getFuelSize());
		
		
	}
	public static void printTitle(){
		System.out.println("Plane\t\tfuelSize");
		System.out.println("-------------------------");
	}

}

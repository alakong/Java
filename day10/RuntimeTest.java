package day10;

public class RuntimeTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();//객체생성
		//r.exec("c:\\windows\\notepad.exe");//메모장이 켜짐,\로 구분하면 두번씩 줘야함 아니면 그냥/로 한개 줘도됨
		
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);//실행시켜보면 객체는 하나만 만들어져있음-> Runtime은 singleton패턴이 적용된 클래스이므로
		
		
	}

}

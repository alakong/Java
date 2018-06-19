package day9;

public class PolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printObjectInfo(new Object());
		printObjectInfo(new String("가나다"));
		printObjectInfo("ABC");
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new int[10]);
		printObjectInfo(new char[5]);
		printObjectInfo(new Integer(100));
		printObjectInfo(new java.util.Date());
		printObjectInfo(new day6.Student());
	}

	public static void printObjectInfo(Object o){
		if(o instanceof String ){
			System.out.println("문자열 객체 : "+ 
	                  o.toString()+"("+((String)o).length()+")");//자손에서 부모로는 자동으로 형변환됨
		}else
		
		{ 
			System.out.println("전달된 객체의 클래스명 : "+ 
	                  o.getClass().getName());//참조하게된 클래스 이름 호출. 
		}
		
	} 
		
		
}

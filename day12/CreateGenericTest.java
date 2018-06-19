package day12;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();
		o1.put("abc");
		String s1 = o1.get(); 
		System.out.println(s1);		
		
		Value2 o2 = new Value2();
		o2.put("abc");
		String s2 = (String)o2.get(); 
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<String>();		
		o3.put("abc");
		String s3 = o3.get(); 
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();		
		o4.put(new Date());
		Date s4 = o4.get(); 
		System.out.println(s4);	
	}
}
class Value1 {
	String obj;
	void put(String obj){//String객체만 받을 수 있음
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}



class Value2 {
	Object obj;//object받았으므로 어떤 객체든 받아서 전달할 수 있음
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;//자식형 객체를 불러올 때는 형변환을 해줘야함 자식에게 부모는 하나지만 부모는 자식이 여럿일 수 있으므로 형변환필요
	}
}



class Value3<MY> { //타입 파라미터 여러개 쓰고싶으면 여러개 지정해도됨
	MY obj;
	void put(MY obj){
		this.obj = obj;
	}
	MY get() {
		return obj;
	}
}
//클래스가 처리할 타입을 그때그때 동적으로 처리한다는 뜻으로 일반화한다는 generic구문
//Value3<Card> v = new Value3<Card>();//객체 생성할 때 설정한 타입파라미터로 MY가 자동으로 바뀜, Card로 바뀜
//Value3<String> v = new Value3<String>();













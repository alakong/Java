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
	void put(String obj){//String��ü�� ���� �� ����
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}



class Value2 {
	Object obj;//object�޾����Ƿ� � ��ü�� �޾Ƽ� ������ �� ����
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;//�ڽ��� ��ü�� �ҷ��� ���� ����ȯ�� ������� �ڽĿ��� �θ�� �ϳ����� �θ�� �ڽ��� ������ �� �����Ƿ� ����ȯ�ʿ�
	}
}



class Value3<MY> { //Ÿ�� �Ķ���� ������ ��������� ������ �����ص���
	MY obj;
	void put(MY obj){
		this.obj = obj;
	}
	MY get() {
		return obj;
	}
}
//Ŭ������ ó���� Ÿ���� �׶��׶� �������� ó���Ѵٴ� ������ �Ϲ�ȭ�Ѵٴ� generic����
//Value3<Card> v = new Value3<Card>();//��ü ������ �� ������ Ÿ���Ķ���ͷ� MY�� �ڵ����� �ٲ�, Card�� �ٲ�
//Value3<String> v = new Value3<String>();













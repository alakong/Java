package day9;

public class PolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printObjectInfo(new Object());
		printObjectInfo(new String("������"));
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
			System.out.println("���ڿ� ��ü : "+ 
	                  o.toString()+"("+((String)o).length()+")");//�ڼտ��� �θ�δ� �ڵ����� ����ȯ��
		}else
		
		{ 
			System.out.println("���޵� ��ü�� Ŭ������ : "+ 
	                  o.getClass().getName());//�����ϰԵ� Ŭ���� �̸� ȣ��. 
		}
		
	} 
		
		
}

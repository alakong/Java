package day12;
import java.util.*;
public class GenericTestNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list= new ArrayList<String>();
		// = ArrayList<String> list= new ArrayList<>();

		list.add("java");
		list.add("100");
		list.add("selvlet");
		list.add("jdbc");
		
		//�����͸� ������ ������ ���
		for(int i=0;i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		for(String s :list){
			//String s =(String)value;
			System.out.println(s);//Ÿ���Ķ�����ָ� ����ȯ ���� �ٷ� ������ ��
		}
		System.out.println();
		
		Iterator<String> iter=list.iterator();  
		while(iter.hasNext()){
			String s=iter.next();
			System.out.println(s);
		}
	}

}
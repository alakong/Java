package day12;
import java.util.*;
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list= new ArrayList();//���� Ÿ�� ���ָ� �ڵ����� object��
		list.add("java");
		list.add(100);
		list.add("selvlet");
		list.add("jdbc");
		
		//�����͸� ������ ������ ���
		for(int i=0;i<list.size(); i++)//linkedlist�� �̹�� ��������
			System.out.println(list.get(i));//get->������
		System.out.println();
		
		for(Object value :list){//����ӵ��� ����
			String s =(String)value;//String�� �ƴ� 100�� ��������Ƿ� ����Ҷ� ���� 
			System.out.println(s);
		}
		System.out.println();
		
		Iterator iter=list.iterator();//helper class-Iterator
		while(iter.hasNext()){
			String s=(String)iter.next();
			System.out.println(s);
		}
	}

}

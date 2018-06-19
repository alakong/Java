package day12;
import java.util.*;
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list= new ArrayList();//따로 타입 안주면 자동으로 object로
		list.add("java");
		list.add(100);
		list.add("selvlet");
		list.add("jdbc");
		
		//데이터를 꺼내는 세가지 방법
		for(int i=0;i<list.size(); i++)//linkedlist는 이방법 좋지않음
			System.out.println(list.get(i));//get->꺼내라
		System.out.println();
		
		for(Object value :list){//수행속도가 빠름
			String s =(String)value;//String이 아닌 100이 들어잇으므로 출력할때 오류 
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

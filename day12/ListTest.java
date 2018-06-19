package day12;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 3, 4, 2, 5, 2, 3, 6, 7, 5, 7, 9 };
		ConvertList cl = new ConvertList();
		// 클래스 안에 메소드를 사용하려면 클래스 객체생성을 하고 메인메소드에서 사용가능(static형이면 객체생성안하고 쓸 수 있음)
		ArrayList<Integer> list = cl.convertList(array);
		//ArrayList<Integer> list =new ConvertList().convertList(array);//한번 생성할꺼면 바로 써도됨
		System.out.println(list);//자동으로 대괄호 안에 쉼표돼서 나옴
		for (int value : list) {
			System.out.println(value);

		}

	}

}

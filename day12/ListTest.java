package day12;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 3, 4, 2, 5, 2, 3, 6, 7, 5, 7, 9 };
		ConvertList cl = new ConvertList();
		// Ŭ���� �ȿ� �޼ҵ带 ����Ϸ��� Ŭ���� ��ü������ �ϰ� ���θ޼ҵ忡�� ��밡��(static���̸� ��ü�������ϰ� �� �� ����)
		ArrayList<Integer> list = cl.convertList(array);
		//ArrayList<Integer> list =new ConvertList().convertList(array);//�ѹ� �����Ҳ��� �ٷ� �ᵵ��
		System.out.println(list);//�ڵ����� ���ȣ �ȿ� ��ǥ�ż� ����
		for (int value : list) {
			System.out.println(value);

		}

	}

}

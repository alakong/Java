package day12;

import java.util.*;

public class LottoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> lott = new HashSet<Integer>();//������ �ҹ���!!!!!!!!
		Random r = new Random();

		while (lott.size() < 10) {// while (Lott.size() <=10)->11�� �����
			int num = r.nextInt(21) + 10;
			lott.add(num);
		}

		System.out.print("������ �ζ� ��ȣ: ");
		System.out.println(lott);
		
		Iterator<Integer> iterator = lott.iterator();
		for (int i = 1; i <= lott.size(); i++) {
			System.out.print(iterator.next());
			
			if (i != lott.size()) {
				System.out.print(", ");
			}//next()�ؼ� ������ �����͸� hasNext�� ������ �� �̰� �̿��ؼ� , ���� ���� ����
		}

	}

}

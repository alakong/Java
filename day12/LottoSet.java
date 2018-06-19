package day12;

import java.util.*;

public class LottoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> lott = new HashSet<Integer>();//변수명 소문자!!!!!!!!
		Random r = new Random();

		while (lott.size() < 10) {// while (Lott.size() <=10)->11번 수행됨
			int num = r.nextInt(21) + 10;
			lott.add(num);
		}

		System.out.print("오늘의 로또 번호: ");
		System.out.println(lott);
		
		Iterator<Integer> iterator = lott.iterator();
		for (int i = 1; i <= lott.size(); i++) {
			System.out.print(iterator.next());
			
			if (i != lott.size()) {
				System.out.print(", ");
			}//next()해서 마지막 데이터면 hasNext가 거짓이 됨 이걸 이용해서 , 넣을 수도 있음
		}

	}

}

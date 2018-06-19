
package collection;

import java.util.*;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*HashSet<Product> set = new HashSet<Product>();*/
		TreeSet<Product> set= new TreeSet<Product>();
		Product p[] = new Product[4];
		p[0] = new Product("p100", "TV", 20000);
		p[1] = new Product("p200", "Computer", 10000);
		p[2] = new Product("p100", "MP3", 700);
		p[3] = new Product("p300", "Audio", 1000);

		for (int i = 0; i < p.length; i++) {
			if (set.add(p[i]))// add가 성공했다는 것은 true이고 성공적으로 저장되었다는 뜻
				//조건식에서 바로 set.add으로 HashSet에 입력가능
				//위에서 한번 더 set.add식을 쓰면
				//이미 앞에서 내용이 들어가 버리므로 if결과에서는 무조건 동일한 제품이 이미 저장되어 있다고 나오는 것!!!
				System.out.println("성공적으로 저장되었습니다.");
			else
				System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");

		}

		System.out.println("제품 ID\t제품명\t가격");
		System.out.println("----------------------------");
		Iterator<Product> iterator = set.iterator();
		while (iterator.hasNext()) {
			Product str = iterator.next();
			System.out.println(str);//자동으로 toString호출->오버라이딩해서 원하는 모양대로 호출가능
		}
		

	}

}

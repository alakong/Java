
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
			if (set.add(p[i]))// add�� �����ߴٴ� ���� true�̰� ���������� ����Ǿ��ٴ� ��
				//���ǽĿ��� �ٷ� set.add���� HashSet�� �Է°���
				//������ �ѹ� �� set.add���� ����
				//�̹� �տ��� ������ �� �����Ƿ� if��������� ������ ������ ��ǰ�� �̹� ����Ǿ� �ִٰ� ������ ��!!!
				System.out.println("���������� ����Ǿ����ϴ�.");
			else
				System.out.println("������ ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.");

		}

		System.out.println("��ǰ ID\t��ǰ��\t����");
		System.out.println("----------------------------");
		Iterator<Product> iterator = set.iterator();
		while (iterator.hasNext()) {
			Product str = iterator.next();
			System.out.println(str);//�ڵ����� toStringȣ��->�������̵��ؼ� ���ϴ� ����� ȣ�Ⱑ��
		}
		

	}

}

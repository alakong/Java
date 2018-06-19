package day7;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		this("��ũ����", 5, 10000);
	}

	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}

	String getName() {
		return name;
	}

	int getBalance() {
		return balance;
	}

	int getPrice() {
		return price;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Product p[] = new Product[5];// 5���� ���Ҹ� ���� Product Ÿ���� �迭�� ����
		p[0] = new Product();
		p[1] = new Product("�ڵ���", 3, 1000000);
		p[2] = new Product("����", 50, 240000);
		p[3] = new Product("���۷���", 15, 2000);
		p[4] = new Product("����", 34, 5000);

		/*for (int i = 0; i < p.length; i++) {
			System.out.println("��ǰ��:" + p[i].getName() + " ���:" + p[i].getBalance() + " ����:" + p[i].getPrice());
		=
		}
		= */
		for(Product po : p){
			System.out.println("��ǰ��:" + po.getName() + " ���:" + po.getBalance() + " ����:" + po.getPrice());
	}
}
}

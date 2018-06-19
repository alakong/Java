package day7;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		this("듀크인형", 5, 10000);
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
		Product p[] = new Product[5];// 5개의 원소를 갖는 Product 타입의 배열을 생성
		p[0] = new Product();
		p[1] = new Product("핸드폰", 3, 1000000);
		p[2] = new Product("백팩", 50, 240000);
		p[3] = new Product("립글로즈", 15, 2000);
		p[4] = new Product("필통", 34, 5000);

		/*for (int i = 0; i < p.length; i++) {
			System.out.println("상품명:" + p[i].getName() + " 재고량:" + p[i].getBalance() + " 가격:" + p[i].getPrice());
		=
		}
		= */
		for(Product po : p){
			System.out.println("상품명:" + po.getName() + " 재고량:" + po.getBalance() + " 가격:" + po.getPrice());
	}
}
}

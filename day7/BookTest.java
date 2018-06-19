package day7;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		this("자바의 정석","남궁성",30000);
		/*title="자바의 정석";
		author="남궁성";
		price=30000;	*/
	}
	Book(String title, String author, int price){
	this.title=title;
	this.author=author;
	this.price=price;}
	
	String getBookInfo(){
		return "책이름:"+title + " 저자:"+ author+ " 가격:"+price;
	}	
}



public class BookTest {

	public static void main(String[] args) {
		
		Book b1= new Book();
		Book b2= new Book("영혼없음","정다혜",20000);
		Book b3= new Book("컴공의 신","이종훈",30000);
		Book b4= new Book("통계의 신","곽지훈",40000);
		Book b5= new Book("신과 함께","안유정",50000);
		
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
		System.out.println(b4.getBookInfo());
		System.out.println(b5.getBookInfo());
		
	}

}

package day7;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		this("�ڹ��� ����","���ü�",30000);
		/*title="�ڹ��� ����";
		author="���ü�";
		price=30000;	*/
	}
	Book(String title, String author, int price){
	this.title=title;
	this.author=author;
	this.price=price;}
	
	String getBookInfo(){
		return "å�̸�:"+title + " ����:"+ author+ " ����:"+price;
	}	
}



public class BookTest {

	public static void main(String[] args) {
		
		Book b1= new Book();
		Book b2= new Book("��ȥ����","������",20000);
		Book b3= new Book("�İ��� ��","������",30000);
		Book b4= new Book("����� ��","������",40000);
		Book b5= new Book("�Ű� �Բ�","������",50000);
		
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
		System.out.println(b4.getBookInfo());
		System.out.println(b5.getBookInfo());
		
	}

}

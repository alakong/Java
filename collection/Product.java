package collection;

import org.omg.Messaging.SyncScopeHelper;

public class Product implements Comparable<Product> {
	private String productID, productName;
	private int productPrice;
	public Product(String productID, String productName, int productPrice){
		this.productID=productID;
		this.productName=productName;
		this.productPrice=productPrice;
	}//생성자로 초기화 안해놓으면 세터게터로 하나하나 셋팅해야함
	
	public String toString() {
		return productID+"\t"+productName+"\t"+productPrice;
		}
	
	public boolean equals(Object obj){//메소드 오버라이딩이므로 Object를 처음부터 Product형으로 받을 수는 없음
		if(obj instanceof Product){
			Product tmp=(Product)obj;
			return productID.equals(tmp.productID);
		}
		return false;
	}
	
	public int hashCode(){
		return productID.hashCode();
	}
	
	public int compareTo(Product p){//TreeSet은 compareTo로만 함!!equals안써
		int result=-1;
		if(productPrice>p.productPrice)
			result=1;
		return result;
	}

}

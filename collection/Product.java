package collection;

import org.omg.Messaging.SyncScopeHelper;

public class Product implements Comparable<Product> {
	private String productID, productName;
	private int productPrice;
	public Product(String productID, String productName, int productPrice){
		this.productID=productID;
		this.productName=productName;
		this.productPrice=productPrice;
	}//�����ڷ� �ʱ�ȭ ���س����� ���Ͱ��ͷ� �ϳ��ϳ� �����ؾ���
	
	public String toString() {
		return productID+"\t"+productName+"\t"+productPrice;
		}
	
	public boolean equals(Object obj){//�޼ҵ� �������̵��̹Ƿ� Object�� ó������ Product������ ���� ���� ����
		if(obj instanceof Product){
			Product tmp=(Product)obj;
			return productID.equals(tmp.productID);
		}
		return false;
	}
	
	public int hashCode(){
		return productID.hashCode();
	}
	
	public int compareTo(Product p){//TreeSet�� compareTo�θ� ��!!equals�Ƚ�
		int result=-1;
		if(productPrice>p.productPrice)
			result=1;
		return result;
	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InputProduct {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		Statement stmt = conn.createStatement() ;
		Scanner sc = new Scanner(System.in);
		String id, classid, name;
		float price;
		int balance;
		ResultSet rs= null;

	
		while(true){
		try{
		System.out.print("id�� �Է��ϼ���: ");
		id= sc.nextLine();
		System.out.print("classid�� �Է��ϼ���: ");
		classid= sc.nextLine();
		System.out.print("��ǰ���� �Է��ϼ���: ");
		name= sc.nextLine();
		System.out.print("������ �Է��ϼ���: ");
		price=sc.nextFloat();
		System.out.print("����� �Է��ϼ���: ");
		balance= sc.nextInt();
		sc.nextLine();//


		stmt.executeUpdate("INSERT into product values('"+id+"','"+classid+"','"+name+"',"+balance+","+price+")");
		System.out.println("�����͸� �߰��Ͽ����ϴ�.");
		
		rs = stmt.executeQuery("SELECT id,classid,name,price,balance from product");
		while(rs.next()){
			System.out.print(rs.getString("id")+"  ");
			System.out.print(rs.getString("classid")+"  ");
			System.out.print(rs.getString("name")+"  "); 
			System.out.print(rs.getFloat("price"));
			System.out.println(rs.getInt("balance")+"  ");
		}
	
		break;
		}catch(Exception e){
			System.out.println("�����߻�: "+e+" �ٽ� �Է��ϼ���.");
			
		}
		stmt.close();
		conn.close();
		rs.close();
		sc.close();
	
		}
		

	}
}

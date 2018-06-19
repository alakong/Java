import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InputProduct2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		PreparedStatement pstmt = conn.prepareStatement("INSERT into product values(?,?,?,?,?)");
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


		pstmt.setString(1,id);
		pstmt.setString(2,classid);
		pstmt.setString(3,name);
		pstmt.setInt(4,balance);
		pstmt.setFloat(5,price);
		//stmt.executeUpdate("INSERT into product values('"+id+"','"+classid+"','"+name+"',"+balance+","+price+")");
		pstmt.executeUpdate();
		pstmt.close();
		pstmt= conn.prepareStatement("SELECT id,classid,name,price,balance from product");
		System.out.println("�����͸� �߰��Ͽ����ϴ�.");
		rs = pstmt.executeQuery();
		while(rs.next()){
			System.out.print(rs.getString("id")+"  ");
			System.out.print(rs.getString("classid")+"  ");
			System.out.print(rs.getString("name")+"  "); 
			System.out.print(rs.getFloat("price")+"  ");
			System.out.println(rs.getInt("balance")+"  ");
		}
	
		break;
		}catch(Exception e){
			System.out.println("�����߻�: "+e+" �ٽ� �Է��ϼ���.");
			
		}
		pstmt.close();
		conn.close();
		rs.close();
		sc.close();
	
		}
		

	}
}

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
		System.out.print("id를 입력하세요: ");
		id= sc.nextLine();
		System.out.print("classid를 입력하세요: ");
		classid= sc.nextLine();
		System.out.print("상품명을 입력하세요: ");
		name= sc.nextLine();
		System.out.print("가격을 입력하세요: ");
		price=sc.nextFloat();
		System.out.print("재고량을 입력하세요: ");
		balance= sc.nextInt();
		sc.nextLine();//


		stmt.executeUpdate("INSERT into product values('"+id+"','"+classid+"','"+name+"',"+balance+","+price+")");
		System.out.println("데이터를 추가하였습니다.");
		
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
			System.out.println("오류발생: "+e+" 다시 입력하세요.");
			
		}
		stmt.close();
		conn.close();
		rs.close();
		sc.close();
	
		}
		

	}
}

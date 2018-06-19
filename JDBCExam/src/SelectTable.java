import java.sql.*;
public class SelectTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jdbctest","jdbctest");
			//성공적으로 접속되면 connection객체가 리턴됨. connection의 자식클래스의 객체가 대신 객체생성돼서 리턴됨. 이를 확인하려면 아래 구문수행
			System.out.println("리턴된 Connection 객체: "+ conn.getClass().getName());//실제 전달된 객체의 클래스 이름 확인하는 방법
			
			Statement stmt= conn.createStatement();//얘도 마찬가지로 JDBCdriver가  Statement의 자식클래스에서 객체생성을 해서 리턴해줌
			System.out.println("리턴된 Statement 객체: "+ stmt.getClass().getName());

			ResultSet rs = stmt.executeQuery("SELECT * from product");
			while(rs.next()){
				System.out.print(rs.getString("id")+"  ");
				System.out.print(rs.getString("classid")+"  ");
				System.out.print(rs.getString("name")+"  ");
				System.out.print(rs.getInt("balance")+"  ");
				System.out.println(rs.getFloat("price"));//컬럼명대신 인덱스 줘도 가능
			}
			
			rs.close();
			stmt.close();
			conn.close(); 
			

	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "work", "work");
		Statement stmt = conn.createStatement() ;
		ResultSet rs = stmt.executeQuery("SELECT ename, sal from emp");
		//ResultSet rs = stmt.executeQuery("SELECT ename, to_char(sal,'999,999') as sal from emp"); 꺼내올 때부터 쉼표 붙여주는 방법

		while (rs.next()) {
			System.out.println(rs.getString("ename") + " 직원은 월급이 " + String.format("%,d", rs.getInt("sal")) + "원입니다.");
			//=System.out.printf("%s 직원은 월급이 %,d원입니다.\n",rs.getString("ename"),rs.getInt("sal"));


		}

		rs.close();
		stmt.close();
		conn.close();

	}
}

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
		//ResultSet rs = stmt.executeQuery("SELECT ename, to_char(sal,'999,999') as sal from emp"); ������ ������ ��ǥ �ٿ��ִ� ���

		while (rs.next()) {
			System.out.println(rs.getString("ename") + " ������ ������ " + String.format("%,d", rs.getInt("sal")) + "���Դϴ�.");
			//=System.out.printf("%s ������ ������ %,d���Դϴ�.\n",rs.getString("ename"),rs.getInt("sal"));


		}

		rs.close();
		stmt.close();
		conn.close();

	}
}

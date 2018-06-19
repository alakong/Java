import java.sql.*;
public class ConnectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JTBCExam 오른쪽클릭->build path->configure->libraries->add jar해서 ojdbc6 연결->오라클서버 접속 준비
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn =DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE","jdbctest","jdbctest");
			//Connection conn =DriverManager.getConnection("JDBCURL문자열","계정","암호");
			//문자열에서 jdbc:oracle:thin:@ 까지는 필수고 그 뒤에는 상황에 따라 바뀌는 부분
			DatabaseMetaData meta = conn.getMetaData();

			System.out.print("Database: " + meta.getDatabaseProductName());
			System.out.println("version " + meta.getDatabaseProductVersion());
			System.out.println("User name: " + meta.getUserName());
			conn.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}

import java.sql.*;
public class ConnectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JTBCExam ������Ŭ��->build path->configure->libraries->add jar�ؼ� ojdbc6 ����->����Ŭ���� ���� �غ�
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn =DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE","jdbctest","jdbctest");
			//Connection conn =DriverManager.getConnection("JDBCURL���ڿ�","����","��ȣ");
			//���ڿ����� jdbc:oracle:thin:@ ������ �ʼ��� �� �ڿ��� ��Ȳ�� ���� �ٲ�� �κ�
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

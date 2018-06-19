import java.sql.*;
public class SelectTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jdbctest","jdbctest");
			//���������� ���ӵǸ� connection��ü�� ���ϵ�. connection�� �ڽ�Ŭ������ ��ü�� ��� ��ü�����ż� ���ϵ�. �̸� Ȯ���Ϸ��� �Ʒ� ��������
			System.out.println("���ϵ� Connection ��ü: "+ conn.getClass().getName());//���� ���޵� ��ü�� Ŭ���� �̸� Ȯ���ϴ� ���
			
			Statement stmt= conn.createStatement();//�굵 ���������� JDBCdriver��  Statement�� �ڽ�Ŭ�������� ��ü������ �ؼ� ��������
			System.out.println("���ϵ� Statement ��ü: "+ stmt.getClass().getName());

			ResultSet rs = stmt.executeQuery("SELECT * from product");
			while(rs.next()){
				System.out.print(rs.getString("id")+"  ");
				System.out.print(rs.getString("classid")+"  ");
				System.out.print(rs.getString("name")+"  ");
				System.out.print(rs.getInt("balance")+"  ");
				System.out.println(rs.getFloat("price"));//�÷����� �ε��� �൵ ����
			}
			
			rs.close();
			stmt.close();
			conn.close(); 
			

	}

}

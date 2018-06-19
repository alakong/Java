package model;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VisitorDAO {
	
	public boolean insert(VisitorVO vo){
		boolean result=true;
		Connection conn = null;
		PreparedStatement pstmt=null;
		try{
			Context context= new InitialContext();      //Connection Pool 을 연결하기 위한 context
	        DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oraDB");//Servers의 context.xml에 넣은거
	        conn=ds.getConnection();
	        pstmt = conn.prepareStatement("insert into visitor values(?,sysdate,?)");			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMemo());
			pstmt.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
			result=false;
		}finally{
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("close 오류발생");
			}
	
		}
		return result;
		}
	

	public ArrayList<VisitorVO> list() {
		ArrayList<VisitorVO> list=new ArrayList<>();
		ConnectDB obj = new ConnectDB();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Context context=new InitialContext();
			 DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oraDB");
			 conn=ds.getConnection();
			 stmt=conn.createStatement();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select name,writedate,memo from visitor");
			VisitorVO vo = null;
			while (rs.next()) {
				vo = new VisitorVO();
				vo.setName(rs.getString(1));
				vo.setWriteDate(rs.getString(2));
				vo.setMemo(rs.getString(3));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println("close 오류발생");
			}
			obj.close();
		}
		return list;
	}
	
	public ArrayList<VisitorVO> listByName(String name){
		ArrayList<VisitorVO> list=new ArrayList<>();
		ConnectDB obj = new ConnectDB();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Context context=new InitialContext();
			 DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oraDB");
			 conn=ds.getConnection();
			 stmt=conn.createStatement();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select name,writedate,memo from visitor where name like '%"+name+"%'");
			VisitorVO vo = null;
			while (rs.next()) {
				vo = new VisitorVO();
				vo.setName(rs.getString(1));
				vo.setWriteDate(rs.getString(2));
				vo.setMemo(rs.getString(3));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println("close 오류발생");
			}
			obj.close();
		}
		return list;
	}
}

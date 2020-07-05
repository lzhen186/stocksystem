package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dao.OrderDao;
import entity.Lister;

public class OrderDaoImpl implements OrderDao {
	private static String url = "jdbc:mysql://localhot:3306/stock";
	private static String name = "root";
	private static String pwd = "111111";
	
	public boolean orderUpdate(List<Lister> lister) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql ="insert into orderlist(dishname,dishnum,dishprice) values(?,?,?) ";
			ps = conn.prepareStatement(sql);
			int rs = ps.executeUpdate();
			if(rs>0) {
				flag = true; 
			}
			return flag;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			
				try {
					if(ps!=null) ps.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
		
	}
}

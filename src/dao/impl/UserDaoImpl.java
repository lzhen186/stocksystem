package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.UserDao;
import entity.User;

public class UserDaoImpl implements UserDao  {
	private static String url = "jdbc:mysql://localhost:3306/stock";
	private static String name = "root";
	private static String pwd = "111111";
	
	public boolean login(User user) {
		int flag = -1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "select * from user where name=? and pwd=?";			
			ps = conn.prepareStatement(sql);
			ps.setString(1,user.getName());
			ps.setString(2,user.getPwd());
			res = ps.executeQuery();
			if(res.next()) {
				flag = res.getInt(1);
			}
			if(flag > 0) {
				return true;
			}else {
				return false;
			}
			
		} catch (SQLException e) {
			System.out.println("数据库连接有误！");
			e.printStackTrace();
			return false;
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败！");
			e.printStackTrace();
			return false;
		} catch (Exception e){
			e.printStackTrace();
			return false;
		} finally {
			try {
				if(res!=null) res.close();
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		
	}
}

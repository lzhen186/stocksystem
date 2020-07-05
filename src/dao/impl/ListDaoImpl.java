package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ListDao;
import entity.Goods;
import entity.Lister;

public class ListDaoImpl implements ListDao {
	private static String url="jdbc:mysql://localhost:3306/stock";
	private static String name = "root";
	private static String pwd = "111111";
	
	public boolean ListUpdate(Lister lists) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "insert into list(dishname,dishnum,dishprice) values(?,?,?) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, lists.getDishname());
			ps.setInt(2, lists.getDishnum());
			ps.setFloat(3, lists.getDishprice());
			int rs = ps.executeUpdate();
			if(rs>0) {
				flag = true;
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败");
			e.printStackTrace();
			return false;
		} catch(SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
			return false;
		} catch(Exception e){
			e.printStackTrace();
		} finally {
				try {
					if(ps!=null) ps.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	return flag;	
	
	}
	
	
	public List<Lister> queryAllList(){
		List<Lister> lister = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "select * from list order by id desc";
			ps = conn.prepareStatement(sql);
			res = ps.executeQuery();
			while(res.next()) {
				int id = res.getInt(1);
				String dishnames = res.getString(2);
				int dishnum = res.getInt(3);
				float dishprice = res.getFloat(4);
				Lister list  = new Lister(id,dishnames,dishnum,dishprice); 
				lister.add(list);
			}
			return lister;
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
			return null;
		} catch(Exception e){
			e.printStackTrace();
			return null;
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
	
	public boolean delBylistId(int id) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "delete from list where id='"+id+"'";
			ps = conn.prepareStatement(sql);
			int res = ps.executeUpdate();
			if(res>0) {
				flag = true;
			}
			return flag;
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败");
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			System.out.println("数据库失败");
			e.printStackTrace();
			return false;
		} catch(Exception e){
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
	
	public boolean upBylistId(int dishid,int dishnum) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "update list set dishnum = ? where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dishnum);
			ps.setInt(2, dishid);
			int rs = ps.executeUpdate();
			if(rs>0) {
				flag=true;
			}
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
		return flag; 
		
	}


	public boolean queryDishName(String dishname) {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "select * from list where dishname = '"+dishname+"'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				String disn = rs.getString(2);
				if(disn != null) {
					flag = true;
				}
			}
			return flag;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e){
			e.printStackTrace();
			return false;
		} catch(Exception e){
			e.printStackTrace();
			return false;
		} finally {
				try {
					if(rs!=null) rs.close();
					if(ps!=null) ps.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
			     	e.printStackTrace();
				}
		}
	}
	
	public boolean clearLister() {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "delete from list";
			ps = conn.prepareStatement(sql);
			int rs = ps.executeUpdate();
			if(rs>0) 
				flag = true;
			return flag;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return flag;
		} catch (SQLException e) {
			e.printStackTrace();
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			return flag;
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

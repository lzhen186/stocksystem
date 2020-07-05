package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import dao.GoodsDao;
import entity.Goods;

public class GoodsDaoImpl implements GoodsDao {
	private static String url="jdbc:mysql://localhost:3306/stock";
	private static String name = "root";
	private static String pwd = "111111";
	
	public int getTotalCount() {
		int count = -1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "select count(1) from goods";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("«˝∂Øº”‘ÿ ß∞‹");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println(" ˝æ›ø‚¡¨Ω” ß∞‹");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {	
					e.printStackTrace();
			}
		}
		return count;
	}
	

	public List<Goods> queryAllgoods() {
		List<Goods> goods = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "select * from goods";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String dishname = rs.getString(2);
				Float dishprice = rs.getFloat(3);
				int dishnum = rs.getInt(4);
				String dishimg = rs.getString(5);
				String dishinfo = rs.getString(6);
				Goods good = new Goods(id,dishname,dishprice,dishnum,dishimg,dishinfo);
				goods.add(good);
			}
			return goods;
		} catch (ClassNotFoundException e) {
			System.out.println("«˝∂Øº”‘ÿ ß∞‹");
			e.printStackTrace();
			return null;
		} catch(SQLException e) {
			System.out.println("≤È—Ø ß∞‹");
			e.printStackTrace();
			return null;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
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
	
	public List<Goods> queryGoodsByPage(int currentPage, int pageSize) {
		List<Goods> goods = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "select * from goods limit ?,?";
			ps = conn.prepareStatement(sql);
			currentPage = currentPage*pageSize;
			
			ps.setInt(1, currentPage);
			pageSize = currentPage+pageSize; 
			ps.setInt(2, pageSize);
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String dishname = rs.getString("dishname");
				Float dishprice = rs.getFloat("dishprice");
				int dishnum = rs.getInt("dishnum");
				String dishimg = rs.getString("dishimg");
				String dishinfo = rs.getString("dishinfo");
				Goods good = new Goods(id,dishname,dishprice,dishnum,dishimg,dishinfo);
				goods.add(good);
			}
			return goods;
		} catch (ClassNotFoundException e) {
			System.out.println("«˝∂Ø¥ÌŒÛ");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("sql¡¨Ω”¥ÌŒÛ");
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
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
	
	public boolean goodsUpdate(int dishnum,int dishid) {
		boolean flat = false;
		Connection conn = null;
		PreparedStatement ps = null;
		int rs = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "update goods set dishnum=? where id = ? ";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dishnum);
			ps.setInt(2, dishid);
			rs = ps.executeUpdate();
			if(rs>0) { 
				flat = true;
				return flat;
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
		return flat;
	
	}
	
	public int queryGoodsByNum(String dishname) {
		int dishnum = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "select * from goods where dishname = '"+dishname+"'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				dishnum = rs.getInt(4);
			}
			
			return dishnum;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
				try {
					if(rs != null) rs.close();
					if(ps != null) ps.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
	
	
	}
	
	public List<Goods> queryLikeGoods(String str){
		List<Goods> goods = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
 		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pwd);
			String sql = "select * from goods where  dishname like'%"+str+"%'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String dishname = rs.getString("dishname");
				Float dishprice = rs.getFloat("dishprice");
				int dishnum = rs.getInt("dishnum");
				String dishimg = rs.getString("dishimg");
				String dishinfo = rs.getString("dishinfo");
				Goods good = new Goods(id,dishname,dishprice,dishnum,dishimg,dishinfo);
				goods.add(good);
			}
		return goods;
		} catch (ClassNotFoundException e) {
			System.out.println("«˝∂Øº”‘ÿ ß∞‹");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println(" ˝æ›ø‚ ß∞‹");
			e.printStackTrace();
			return null;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
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
	
	
	
}

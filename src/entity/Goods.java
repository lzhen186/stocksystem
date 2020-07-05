package entity;

public class Goods {
	private int id;
	private String dishname;
	private Float dishprice;
	private int dishnum;
	private String dishimg;
	private String dishinfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public Float getDishprice() {
		return dishprice;
	}
	public void setDishprice(Float dishprice) {
		this.dishprice = dishprice;
	}
	public int getDishnum() {
		return dishnum;
	}
	public void setDishnum(int dishnum) {
		this.dishnum = dishnum;
	}
	public String getDishimg() {
		return dishimg;
	}
	public void setDishimg(String dishimg) {
		this.dishimg = dishimg;
	}
	public String getDishinfo() {
		return dishinfo;
	}
	public void setDishinfo(String dishinfo) {
		this.dishinfo = dishinfo;
	}
	public Goods()
	{
		
	}
	public Goods( String dishname, Float dishprice, int dishnum, String dishimg, String dishinfo) {
		super();
		this.dishname = dishname;
		this.dishprice = dishprice;
		this.dishnum = dishnum;
		this.dishimg = dishimg;
		this.dishinfo = dishinfo;
	}
	public Goods(int id, String dishname, Float dishprice, int dishnum, String dishimg, String dishinfo) {
		super();
		this.id = id;
		this.dishname = dishname;
		this.dishprice = dishprice;
		this.dishnum = dishnum;
		this.dishimg = dishimg;
		this.dishinfo = dishinfo;
	}
	public Goods(int id, String dishname,int dishnum) {
		super();
		this.id = id;
		this.dishname = dishname;
		this.dishnum = dishnum;
	}
}

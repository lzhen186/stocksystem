package entity;

public class Lister {
	
	private int id;
	private String dishname;
	private int dishnum;
	private float dishprice;
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
	public int getDishnum() {
		return dishnum;
	}
	public void setDishnum(int dishnum) {
		this.dishnum = dishnum;
	}
	
	public float getDishprice() {
		return dishprice;
	}
	public void setDishprice(float dishprice) {
		this.dishprice = dishprice;
	}
	public Lister() {
		
	}
	public Lister(String dishname, int dishnum) {
		super();
		this.dishname = dishname;
		this.dishnum = dishnum;
	}
	public Lister(int id, String dishname, int dishnum) {
		super();
		this.id = id;
		this.dishname = dishname;
		this.dishnum = dishnum;
	}
	public Lister(String dishname, int dishnum, float dishprice) {
		super();
		this.dishname = dishname;
		this.dishnum = dishnum;
		this.dishprice = dishprice;
	}
	public Lister(int id, String dishname, int dishnum, float dishprice) {
		super();
		this.id = id;
		this.dishname = dishname;
		this.dishnum = dishnum;
		this.dishprice = dishprice;
	}
	
	
	
}

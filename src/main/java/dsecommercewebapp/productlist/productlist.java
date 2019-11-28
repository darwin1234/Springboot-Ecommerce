package dsecommercewebapp.productlist;

public class productlist {
	private int __productId;
	private String __ProductName;
	private double __price;
	private String __productDescription;
	
	public productlist() {
		
	}
	public productlist(int __productId, String __ProductName, double __price, String __productDescription) {
		super();
		this.__productId = __productId;
		this.__ProductName = __ProductName;
		this.__price = __price;
		this.__productDescription = __productDescription;
	}
	public int get__productId() {
		return __productId;
	}
	public void set__productId(int __productId) {
		this.__productId = __productId;
	}
	public String get__ProductName() {
		return __ProductName;
	}
	public void set__ProductName(String __ProductName) {
		this.__ProductName = __ProductName;
	}
	public double get__price() {
		return __price;
	}
	public void set__price(double __price) {
		this.__price = __price;
	}
	public String get__productDescription() {
		return __productDescription;
	}
	public void set__productDescription(String __productDescription) {
		this.__productDescription = __productDescription;
	}
	
	
	
}

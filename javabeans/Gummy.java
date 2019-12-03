package javabeans;

public class Gummy {
	
	/**
	 * @author MitchellTodd
	 * @description creating the gummy class for getters and setters
	 * @date Week 7-9
	 */
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Gummy(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Gummy() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

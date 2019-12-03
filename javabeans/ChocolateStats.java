package javabeans;

public class ChocolateStats {
	/**
	 * @author mitchlang
	 * Created Chocolate Stats Javabeans Class.
	 */

	private int id;
	private double price;
	private int quantity;
	
	public ChocolateStats(int id, double price, int quantity) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

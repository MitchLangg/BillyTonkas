package javabeans;

public class GummyStats {
	/**
	 * @author mitch todd
	 * Created Gummy Stats Javabeans Class.
	 */

	private int id;
	private double price;
	private int quantity;
	
	public GummyStats(int id, double price, int quantity) {
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

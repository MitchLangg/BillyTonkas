package javabeans;
/**
 * 
 * @author mitchlang
 * Creation of Inventory Javabeans Class
 */
public class Inventory {

	public int id;
	public String name;
	
	public Inventory(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
}

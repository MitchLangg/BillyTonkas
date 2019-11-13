package javabeans;
/**
 * 
 * @author mitchlang
 * Created the Javabeans Class for Chocolate.
 */
public class Chocolate {
	private int id;
	private String name;
	public Chocolate(int id, String name) {
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

package javabeans;

public class Gummy {
/**
 * @author mitch todd
 * Creation of Javabeans gummy Class. 
 */
	private int id;
	private String name;
	public Gummy(int id, String name) {
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

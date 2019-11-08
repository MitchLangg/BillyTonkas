package javabeans;
/**
 * 
 * @author mitchlang
 * Created the Javabeans Class for Chocolate.
 */
public class Chocolate {
	private int id;
	private int name;
	
	public Chocolate(int id, int name) {
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

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
	
	
}

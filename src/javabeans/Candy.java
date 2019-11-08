package javabeans;

public class Candy {
/**
 * @author mitchlang
 * Creation of Javabeans Candy Class. 
 */
	private int id;
	private int name;
	
	public Candy(int id, int name) {
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

package javabeans;
/**
 * 
 * @author mitchlang
 * Creation of Login Javabeans class.
 */
public class Login {

	private int id;
	private int db_Name;
	private int user_Name;
	private int user_Password;
	
	public Login(int id, int db_Name, int user_Name, int user_Password) {
		super();
		this.id = id;
		this.db_Name = db_Name;
		this.user_Name = user_Name;
		this.user_Password = user_Password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDb_Name() {
		return db_Name;
	}

	public void setDb_Name(int db_Name) {
		this.db_Name = db_Name;
	}

	public int getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(int user_Name) {
		this.user_Name = user_Name;
	}

	public int getUser_Password() {
		return user_Password;
	}

	public void setUser_Password(int user_Password) {
		this.user_Password = user_Password;
	}
	
	
	
}

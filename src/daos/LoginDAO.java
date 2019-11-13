package daos;

import java.util.ArrayList;

import javabeans.Login;



public interface LoginDAO {

	public ArrayList<Login> getAllLogin();
	public Login getLogin(int loginID);
	
}

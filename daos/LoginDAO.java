package daos;

import java.util.ArrayList;

import javabeans.Login;


/*
 * @author Mitchell Lang
 */
public interface LoginDAO {

	public ArrayList<Login> getAllLogin();
	public Login getLogin(int loginID);
	
}

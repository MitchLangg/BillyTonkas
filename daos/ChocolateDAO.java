package daos;

import java.util.ArrayList;

import javabeans.Chocolate;

/*
 * @author Mitchell Lang
 */
public interface ChocolateDAO {

	public ArrayList<Chocolate> getAllChocolate();
	public Chocolate getChocolate(int chocolateID);
	
}

package daos;

import java.util.ArrayList;

import javabeans.Chocolate;


public interface ChocolateDAO {

	public ArrayList<Chocolate> getAllCondition();
	public Chocolate getChocolate(int chocolateID);
	
}

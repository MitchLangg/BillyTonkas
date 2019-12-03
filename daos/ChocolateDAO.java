package daos;

import java.util.ArrayList;
import javabeans.Chocolate;


public interface ChocolateDAO {

	public ArrayList<Chocolate> getAllChocolate();
	public Chocolate getChocolate(int chocolateID);
	public void updateChocolate(Chocolate chocolate);
	public void deleteChocolate(Chocolate chocolate);
	public void createChocolate(Chocolate chocolate);
	
	
}

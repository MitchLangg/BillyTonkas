package daos;

import java.util.ArrayList;

import javabeans.Candy;
import javabeans.ChocolateStats;


public interface CandyDAO {

	public ArrayList<Candy> getAllCandy();
	public Candy getCandy(int candyID);
	public void updateCandy(Candy candy);
	public void deleteCandy(Candy candy);
	public void createCandy(Candy candy);
}

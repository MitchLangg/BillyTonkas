package daos;

import java.util.ArrayList;

import javabeans.Candy;
import javabeans.ChocolateStats;

public interface CandyDAO {

	public ArrayList<Candy> getAllCandy();
	public Candy getCandy(int candyID);
}

package daos;

import java.util.ArrayList;

import javabeans.Candy;
import javabeans.ChocolateStats;
import javabeans.Gummy;

public interface GummyDAO {

	public ArrayList<Gummy> getAllGummy();
	public Candy getGummy(int gummyID);
}

package daos;

import java.util.ArrayList;

import javabeans.Candy;
import javabeans.Gummy;

/*
 * @author Mitchell Todd
 */
public interface GummyDAO {

	public ArrayList<Gummy> getAllGummy();
	public Gummy getGummy(int gummyID);
	public void updateGummy(Gummy candy);
	public void deleteGummy(Gummy candy);
	public void createGummy(Gummy candy);
}

package daos;

import java.util.ArrayList;

import javabeans.Candy;
import javabeans.Gummy;

/**
 * @author MitchellTodd
 * @description creating the gummy DAO class
 * @date Week 5-7
 */
public interface GummyDAO {

	public ArrayList<Gummy> getAllGummy();
	public Gummy getGummy(int gummyID);
	public void updateGummy(Gummy candy);
	public void deleteGummy(Gummy candy);
	public void createGummy(Gummy candy);
}

package daos;

import java.util.ArrayList;
import javabeans.Gummy;

public interface GummyDAO {

	public ArrayList<Gummy> getAllGummy();
	public Gummy getGummy(int gummyID);
}

package daos;

import java.util.ArrayList;
import javabeans.CandyStats;

/*
 * @author Mitchell Lang
 */
public interface CandyStatsDAO {

	public ArrayList<CandyStats> getAllCandyStats();
	public CandyStats getCandyStats(int candyStatsID);
	
}

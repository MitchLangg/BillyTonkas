package daos;

import java.util.ArrayList;
import javabeans.CandyStats;

public interface CandyStatsDAO {

	public ArrayList<CandyStats> getAllCandyStats();
	public CandyStats getCandyStats(int candyStatsID);
	
}

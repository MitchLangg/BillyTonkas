package daos;

import java.util.ArrayList;

import javabeans.ChocolateStats;
import javabeans.GummyStats;


public interface GummyStatsDAO {

	public ArrayList<GummyStats> getAllGummyStats();
	public GummyStats getGummyStats(int GummyStatsID);
}

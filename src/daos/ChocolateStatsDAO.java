package daos;

import java.util.ArrayList;

import javabeans.ChocolateStats;


public interface ChocolateStatsDAO {

	public ArrayList<ChocolateStats> getAllChocolateStats();
	public ChocolateStats getChocolateStats(int chocolateStatsID);
}

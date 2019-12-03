package daos;

import java.util.ArrayList;

import javabeans.ChocolateStats;

/*
 * @author Mitchell Lang
 */
public interface ChocolateStatsDAO {

	public ArrayList<ChocolateStats> getAllChocolateStats();
	public ChocolateStats getChocolateStats(int chocolateStatsID);
}

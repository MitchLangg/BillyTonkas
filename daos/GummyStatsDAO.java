package daos;

import java.util.ArrayList;
import javabeans.GummyStats;

/*
 * @author Mitchell Todd
 */
public interface GummyStatsDAO {

	public ArrayList<GummyStats> getAllGummyStats();
	public GummyStats getGummyStats(int GummyStatsID);
}

package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import daos.GummyStatsDAO;
import database.Const;
import database.Database;
import javabeans.GummyStats;

/*
 * @author Mitchell Lang
 */
public class GummyStatsTable implements GummyStatsDAO{
	Database db = Database.getInstance();
	ArrayList<GummyStats> gummyStats;
	@Override
	public ArrayList<GummyStats> getAllGummyStats() {
		String query = "SELECT * FROM " + Const.TABLE_GUMMY_STATS;
		gummyStats = new ArrayList<>();
		try {
			Statement getGummyStats = db.getConnection().createStatement();
			ResultSet data = getGummyStats.executeQuery(query);
			while (data.next()) {
				gummyStats.add(new GummyStats(data.getInt(Const.GUMMY_STATS_COLUMN_ID),
						data.getDouble(Const.GUMMY_STATS_COLUMN_PRICE),
						data.getInt(Const.GUMMY_STATS_COLUMN_QUANTITY)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gummyStats;
	}

	@Override
	public GummyStats getGummyStats(int GummyStatsID) {
		String query = "SELECT * FROM " + Const.TABLE_GUMMY_STATS + " WHERE " + Const.GUMMY_STATS_COLUMN_ID
				+ " = " + GummyStatsID;
		try {
			Statement getGummyStats = db.getConnection().createStatement();
			ResultSet data = getGummyStats.executeQuery(query);
			if (data.next()) {
				GummyStats gummyStats = new GummyStats(data.getInt(Const.GUMMY_STATS_COLUMN_ID),
						data.getDouble(Const.GUMMY_STATS_COLUMN_PRICE),
						data.getInt(Const.GUMMY_STATS_COLUMN_QUANTITY));
				return gummyStats;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
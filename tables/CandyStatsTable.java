package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import daos.CandyStatsDAO;
import database.Const;
import database.Database;
import javabeans.CandyStats;

/*
 * @author Mitchell Lang
 */

public class CandyStatsTable implements CandyStatsDAO{
	Database db = Database.getInstance();
	ArrayList<CandyStats> candyStats;
	@Override
	public ArrayList<CandyStats> getAllCandyStats() {
		String query = "SELECT * FROM " + Const.TABLE_CANDY_STATS;
		candyStats = new ArrayList<>();
		try {
			Statement getCandyStats = db.getConnection().createStatement();
			ResultSet data = getCandyStats.executeQuery(query);
			while (data.next()) {
				candyStats.add(new CandyStats(data.getInt(Const.CANDY_STATS_COLUMN_ID),
						data.getDouble(Const.CANDY_STATS_COLUMN_PRICE),
						data.getInt(Const.CANDY_STATS_COLUMN_QUANTITY)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return candyStats;
	}

	@Override
	public CandyStats getCandyStats(int candyStatsID) {
		String query = "SELECT * FROM " + Const.TABLE_CANDY_STATS + " WHERE " + Const.CANDY_STATS_COLUMN_ID
				+ " = " + candyStatsID;
		try {
			Statement getCandyStats = db.getConnection().createStatement();
			ResultSet data = getCandyStats.executeQuery(query);
			if (data.next()) {
				CandyStats candyStats = new CandyStats(data.getInt(Const.CANDY_STATS_COLUMN_ID),
						data.getDouble(Const.CANDY_STATS_COLUMN_PRICE),
						data.getInt(Const.CANDY_STATS_COLUMN_QUANTITY));
				return candyStats;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
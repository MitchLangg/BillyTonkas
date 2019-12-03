package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import daos.ChocolateStatsDAO;
import database.Const;
import database.Database;
import javabeans.Chocolate;
import javabeans.ChocolateStats;

public class ChocolateStatsTable implements ChocolateStatsDAO{
	Database db = Database.getInstance();
	ArrayList<ChocolateStats> chocolateStats;
	
	@Override
	public ArrayList<ChocolateStats> getAllChocolateStats() {
		String query = "SELECT * FROM " + Const.TABLE_CHOCOLATE_STATS;
		chocolateStats = new ArrayList<>();
		try {
			Statement getChocolateStats = db.getConnection().createStatement();
			ResultSet data = getChocolateStats.executeQuery(query);
			while (data.next()) {
				chocolateStats.add(new ChocolateStats(data.getInt(Const.CHOCOLATE_STATS_COLUMN_ID), data.getDouble(Const.CHOCOLATE_STATS_COLUMN_PRICE), data.getInt(Const.CHOCOLATE_STATS_COLUMN_QUANTITY)));
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
			}
			return chocolateStats;
			}

	@Override
	public ChocolateStats getChocolateStats(int chocolateStatsID) {
		String query = "SELECT * FROM " + Const.TABLE_CHOCOLATE_STATS + " WHERE " + Const.CHOCOLATE_STATS_COLUMN_ID + " = " + chocolateStatsID;
		try {
			Statement getChocolateStats = db.getConnection().createStatement();
			ResultSet data = getChocolateStats.executeQuery(query);
			if (data.next()) {
				ChocolateStats chocolateStats = new ChocolateStats(data.getInt(Const.CHOCOLATE_STATS_COLUMN_ID), data.getDouble(Const.CHOCOLATE_STATS_COLUMN_PRICE), data.getInt(Const.CHOCOLATE_STATS_COLUMN_QUANTITY));
		return chocolateStats;
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return null;
		}
		}

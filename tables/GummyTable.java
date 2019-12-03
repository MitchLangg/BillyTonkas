package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import daos.GummyDAO;
import database.Const;
import database.Database;
import javabeans.Gummy;

/**
 * @author MitchellTodd
 * @description creating functionality for add/delete/update/pulling from gummy table
 * @date Week 13-15
 */
public class GummyTable implements GummyDAO {
	Database db = Database.getInstance();
	ArrayList<Gummy> gummys;

	@Override
	public ArrayList<Gummy> getAllGummy() {
		String query = "SELECT * FROM " + Const.TABLE_GUMMY;
		gummys = new ArrayList<>();
		try {
			Statement getGummy = db.getConnection().createStatement();
			ResultSet data = getGummy.executeQuery(query);
			while (data.next()) {
				gummys.add(new Gummy(data.getInt(Const.GUMMY_COLUMN_ID), data.getString(Const.GUMMY_COLUMN_NAME),
						data.getDouble(Const.GUMMY_COLUMN_PRICE), data.getInt(Const.GUMMY_COLUMN_QUANTITY)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gummys;
	}

	@Override
	public Gummy getGummy(int gummyID) {
		String query = "SELECT * FROM " + Const.TABLE_GUMMY + " WHERE " + Const.GUMMY_COLUMN_ID + " = " + gummyID;
		Gummy gummy = new Gummy();
		try {
			Statement getGummy = db.getConnection().createStatement();
			ResultSet data = getGummy.executeQuery(query);
			if (data.next()) {
				gummys.add(new Gummy(data.getInt(Const.GUMMY_COLUMN_ID), data.getString(Const.GUMMY_COLUMN_NAME),
						data.getDouble(Const.GUMMY_COLUMN_PRICE), data.getInt(Const.GUMMY_COLUMN_QUANTITY)));
				return gummy;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gummy;
	}

	@Override
	public void updateGummy(Gummy gummy) {
		String query = "UPDATE " + Const.TABLE_GUMMY + " SET " + Const.GUMMY_COLUMN_NAME + " = '" + gummy.getName()
				+ "'," + Const.GUMMY_COLUMN_PRICE + " = '" + gummy.getPrice() + "'," + Const.GUMMY_COLUMN_QUANTITY
				+ " = '" + gummy.getQuantity() + "'" + " WHERE " + Const.CHOCOLATE_COLUMN_ID + " = '" + gummy.getId()
				+ "';";
		try {
			Statement updateGummy = db.getConnection().createStatement();
			updateGummy.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteGummy(Gummy gummy) {
		String query = "DELETE FROM " + Const.TABLE_GUMMY + " WHERE " + Const.GUMMY_COLUMN_ID + " = " + gummy.getId();
		try {
			db.getConnection().createStatement().execute(query);
			System.out.println("Deleted Record");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void createGummy(Gummy gummy) {
		String query = "INSERT INTO " + Const.TABLE_GUMMY + "(" + Const.GUMMY_COLUMN_ID + ", " + Const.GUMMY_COLUMN_NAME
				+ ", " + Const.GUMMY_COLUMN_PRICE + ", " + Const.GUMMY_COLUMN_QUANTITY + ") VALUES ('" + gummy.getId()
				+ "','" + gummy.getName() + "','" + gummy.getPrice() + "','" + gummy.getQuantity() + "')";
		try {
			db.getConnection().createStatement().execute(query);
			System.out.println("Inserted Record");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int getGummyCount(int gummy) {
		int count = -1;
		String query = "SELECT * FROM " + Const.TABLE_GUMMY + " WHERE " + Const.GUMMY_COLUMN_NAME + " = '" + gummy
				+ "'";
		try {
			Statement getCount = db.getConnection().createStatement();
			ResultSet data = getCount.executeQuery(query);
			data.last();
			count = data.getRow();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

}

package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import daos.ChocolateDAO;
import database.Const;
import database.Database;
import javabeans.Chocolate;

/**
 * @author MitchellTodd
 * @description creating functionality for add/delete/update/pulling from chocolate table
 * @date Week 13-15
 */
public class ChocolateTable implements ChocolateDAO {

	Database db = Database.getInstance();
	ArrayList<Chocolate> chocolates;

	@Override
	public ArrayList<Chocolate> getAllChocolate() {
		String query = "SELECT * FROM " + Const.TABLE_CHOCOLATE;
		chocolates = new ArrayList<>();
		try {
			Statement getChocolate = db.getConnection().createStatement();
			ResultSet data = getChocolate.executeQuery(query);
			while (data.next()) {
				chocolates.add(new Chocolate(data.getInt(Const.CHOCOLATE_COLUMN_ID),
						data.getString(Const.CHOCOLATE_COLUMN_NAME), data.getDouble(Const.CHOCOLATE_COLUMN_PRICE),
						data.getInt(Const.CHOCOLATE_COLUMN_QUANTITY)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chocolates;
	}

	@Override
	public Chocolate getChocolate(int ChocolateID) {
		String query = "SELECT * FROM " + Const.TABLE_CHOCOLATE + " WHERE " + Const.CHOCOLATE_COLUMN_ID + " = "
				+ ChocolateID;
		Chocolate chocolate = new Chocolate();
		try {
			Statement getChocolate = db.getConnection().createStatement();
			ResultSet data = getChocolate.executeQuery(query);
			if (data.next()) {
				chocolates.add(new Chocolate(data.getInt(Const.CHOCOLATE_COLUMN_ID),
						data.getString(Const.CHOCOLATE_COLUMN_NAME), data.getDouble(Const.CHOCOLATE_COLUMN_PRICE), data.getInt(Const.CHOCOLATE_COLUMN_QUANTITY)));
				return chocolate;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chocolate;
	}

	@Override
	public void updateChocolate(Chocolate chocolate) {
		String query = "UPDATE " + Const.TABLE_CHOCOLATE + " SET " +
		         Const.CHOCOLATE_COLUMN_NAME + " = '" + chocolate.getName() +  "'," +
		         Const.CHOCOLATE_COLUMN_PRICE + " = '" + chocolate.getPrice() +  "'," +
		         Const.CHOCOLATE_COLUMN_QUANTITY + " = '" + chocolate.getQuantity() + "'" +
		         " WHERE " + Const.CHOCOLATE_COLUMN_ID + " = '" + chocolate.getId() + "';";
		try {
			Statement updateChocolate = db.getConnection().createStatement();
			updateChocolate.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteChocolate(Chocolate chocolate) {
		String query = "DELETE FROM " + Const.TABLE_CHOCOLATE + " WHERE " + Const.CHOCOLATE_COLUMN_ID + " = " + chocolate.getId();
		try {
			db.getConnection().createStatement().execute(query);
			System.out.println("Deleted Record");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void createChocolate(Chocolate chocolate) {
		String query = "INSERT INTO " + Const.TABLE_CHOCOLATE +
				"(" + Const.CHOCOLATE_COLUMN_ID + ", " +
				Const.CHOCOLATE_COLUMN_NAME + ", " +
				Const.CHOCOLATE_COLUMN_PRICE + ", " + 
				Const.CHOCOLATE_COLUMN_QUANTITY + ") VALUES ('" +
				chocolate.getId() + "','" +
				chocolate.getName() + "','" + chocolate.getPrice() + "','" +
				chocolate.getQuantity() + "')";
		try {
			db.getConnection().createStatement().execute(query);
			System.out.println("Inserted Record");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public int getChocolateCount(int chocolate) {
		int count = -1;
		String query = "SELECT * FROM " + Const.TABLE_CHOCOLATE + " WHERE " + Const.CHOCOLATE_COLUMN_NAME + " = '" + chocolate + "'";
		try {
			Statement getCount = db.getConnection().createStatement();
			ResultSet data = getCount.executeQuery(query);
			data.last();
			count = data.getRow();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

}


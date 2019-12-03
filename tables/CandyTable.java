package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import daos.CandyDAO;
import database.Const;
import database.Database;
import javabeans.Candy;

/*
 * @author MitchellTodd
 */

public class CandyTable implements CandyDAO {
	Database db = Database.getInstance();
	ArrayList<Candy> candys;


	@Override
	public ArrayList<Candy> getAllCandy() {
		String query = "SELECT * FROM " + Const.TABLE_CANDY;
		candys = new ArrayList<Candy>();
		try {
			Statement getCandy = db.getConnection().createStatement();
			ResultSet data = getCandy.executeQuery(query);
			while (data.next()) {
				candys.add(new Candy(data.getInt(Const.CANDY_COLUMN_ID), data.getString(Const.CANDY_COLUMN_NAME), data.getDouble(Const.CANDY_COLUMN_PRICE), data.getInt(Const.CANDY_COLUMN_QUANTITY)));
			}
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return candys;
	}

	@Override
	public Candy getCandy(int candyID) {
		String query = "SELECT * FROM " + Const.TABLE_CANDY + " WHERE " + Const.CANDY_COLUMN_ID + " = " + candyID;
		Candy candy = new Candy();
		try {
			Statement getCandy = db.getConnection().createStatement();
			ResultSet data = getCandy.executeQuery(query);
			if (data.next()) {
				candys.add(new Candy(data.getInt(Const.CANDY_COLUMN_ID), data.getString(Const.CANDY_COLUMN_NAME), data.getDouble(Const.CANDY_COLUMN_PRICE), data.getInt(Const.CANDY_COLUMN_QUANTITY)));
				return candy;
			}
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return candy;
	}
	
	@Override
	public void updateCandy(Candy candy) {
		String query = "UPDATE " + Const.TABLE_CANDY + " SET " + Const.CANDY_COLUMN_NAME + " " + candy.getName() + ","
				+ Const.CANDY_COLUMN_PRICE + " " + candy.getPrice() + "," + Const.CANDY_COLUMN_QUANTITY + " "
				+ candy.getQuantity() + " WHERE " + Const.CANDY_COLUMN_ID + " = " + candy.getId();
		try {
			Statement updateCandy = db.getConnection().createStatement();
			updateCandy.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCandy(Candy candy) {
		String query = "DELETE FROM " + Const.CREATE_TABLE_CANDY + " WHERE " + Const.CANDY_COLUMN_ID + " = " + candy.getId();
		try {
			db.getConnection().createStatement().execute(query);
			System.out.println("Deleted Record");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void createCandy(Candy candy) {
		String query = "INSERT INTO " + Const.TABLE_CANDY +
				"(" + Const.CANDY_COLUMN_ID + ", " +
				Const.CANDY_COLUMN_NAME + ", " +
				Const.CANDY_COLUMN_PRICE + ", " + 
				Const.CANDY_COLUMN_QUANTITY + ") VALUES ('" +
				candy.getId() + "','" +
				candy.getName() + "','" + candy.getPrice() + "','" +
				candy.getQuantity() + "')";
		try {
			db.getConnection().createStatement().execute(query);
			System.out.println("Inserted Record");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public int getCandyCount(int candy) {
		int count = -1;
		String query = "SELECT * FROM " + Const.TABLE_CANDY + " WHERE " + Const.CANDY_COLUMN_NAME + " = '" + candy + "'";
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
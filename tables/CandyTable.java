package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import daos.CandyDAO;
import database.Const;
import database.Database;
import javabeans.Candy;

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
				candys.add(new Candy(data.getInt(Const.CANDY_COLUMN_ID), data.getString(Const.CANDY_COLUMN_NAME)));
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
				candys.add(new Candy(data.getInt(Const.CANDY_COLUMN_ID), data.getString(Const.CANDY_COLUMN_NAME)));
				return candy;
			}
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return candy;
	}
	
	
}

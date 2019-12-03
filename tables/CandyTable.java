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
ArrayList<Candy> candy;

@Override
public ArrayList<Candy> getAllCandy() {
	String query = "SELECT * FROM " + Const.TABLE_CANDY;
	candy = new ArrayList<>();
try {
	Statement getCandy = db.getConnection().createStatement();
	ResultSet data = getCandy.executeQuery(query);
	while (data.next()) {
	candy.add(new Candy(data.getInt(Const.CANDY_COLUMN_ID), data.getString(Const.CANDY_COLUMN_NAME)));
	}
} catch (SQLException e) {
e.printStackTrace();
}
return candy;
}

@Override
public Candy getCandy(int candyID) {
	String query = "SELECT * FROM " + Const.TABLE_CANDY + " WHERE " + Const.CANDY_COLUMN_ID + " = " + candyID;
try {
	Statement getCandy = db.getConnection().createStatement();
	ResultSet data = getCandy.executeQuery(query);
	if (data.next()) {
		Candy candy = new Candy(data.getInt(Const.CANDY_COLUMN_ID), data.getString(Const.CANDY_COLUMN_NAME));
return candy;
}
} catch (SQLException e) {
e.printStackTrace();
}
return null;
}
}

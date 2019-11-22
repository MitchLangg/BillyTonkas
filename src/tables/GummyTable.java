package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import daos.GummyDAO;
import database.Const;
import database.Database;
import javabeans.Gummy;

public class GummyTable implements GummyDAO {
Database db = Database.getInstance();
ArrayList<Gummy> gummy;

@Override
public ArrayList<Gummy> getAllGummy() {
	String query = "SELECT * FROM " + Const.TABLE_GUMMY;
	gummy = new ArrayList<>();
try {
	Statement getGummy = db.getConnection().createStatement();
	ResultSet data = getGummy.executeQuery(query);
	while (data.next()) {
	gummy.add(new Gummy(data.getInt(Const.GUMMY_COLUMN_ID), data.getString(Const.GUMMY_COLUMN_NAME)));
	}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return gummy;
}

@Override
public Candy getGummy(int gummyID) {
	String query = "SELECT * FROM " + Const.TABLE_GUMMY + " WHERE " + Const.GUMMY_COLUMN_ID + " = " + gummyID;
try {
	Statement getGummy = db.getConnection().createStatement();
	ResultSet data = getGummy.executeQuery(query);
	if (data.next()) {
		Gummy candy = new Gummy(data.getInt(Const.CANDY_COLUMN_ID), data.getString(Const.CANDY_COLUMN_NAME));
return candy;
}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return null;
}
}

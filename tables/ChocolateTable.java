package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import daos.CandyDAO;
import daos.ChocolateDAO;
import database.Const;
import database.Database;
import javabeans.Candy;
import javabeans.Chocolate;

public class ChocolateTable implements ChocolateDAO {
Database db = Database.getInstance();
ArrayList<Chocolate> chocolate;

@Override
public ArrayList<Chocolate> getAllChocolate() {
	String query = "SELECT * FROM " + Const.TABLE_CHOCOLATE;
	chocolate = new ArrayList<>();
try {
	Statement getChocolate = db.getConnection().createStatement();
	ResultSet data = getChocolate.executeQuery(query);
	while (data.next()) {
		chocolate.add(new Chocolate(data.getInt(Const.CHOCOLATE_COLUMN_ID), data.getString(Const.CHOCOLATE_COLUMN_NAME)));
	}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return chocolate;
}

@Override
public Chocolate getChocolate(int ChocolateID) {
	String query = "SELECT * FROM " + Const.TABLE_CHOCOLATE + " WHERE " + Const.CHOCOLATE_COLUMN_ID + " = " + ChocolateID;
try {
	Statement getChocolate = db.getConnection().createStatement();
	ResultSet data = getChocolate.executeQuery(query);
	if (data.next()) {
		Chocolate chocolate = new Chocolate(data.getInt(Const.CHOCOLATE_COLUMN_ID), data.getString(Const.CHOCOLATE_COLUMN_NAME));
return chocolate;
}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return null;
}
}
package tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import daos.InventoryDAO;
import database.Const;
import database.Database;
import javabeans.Inventory;

/*
 * @author Mitchell Lang
 */
public class InventoryTable implements InventoryDAO{
	Database db = Database.getInstance();
	ArrayList<Inventory> inventory;
	@Override
	public ArrayList<Inventory> getAllInventory() {
		String query = "SELECT * FROM " + Const.TABLE_INVENTORY;
		inventory = new ArrayList<>();
		try {
			Statement getInventory = db.getConnection().createStatement();
			ResultSet data = getInventory.executeQuery(query);
			while (data.next()) {
				inventory.add(new Inventory(data.getInt(Const.INVENTORY_COLUMN_ID),
						data.getString(Const.INVENTORY_COLUMN_NAME)));
						
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inventory;
	}
	@Override
	public Inventory getInventory(int inventoryID) {
		return null;
	}

}

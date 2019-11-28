package daos;

import java.util.ArrayList;


import javabeans.Inventory;

public interface InventoryDAO {

	public ArrayList<Inventory> getAllInventory();
	public Inventory getInventory(int inventoryID);
}

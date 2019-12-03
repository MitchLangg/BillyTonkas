package daos;

import java.util.ArrayList;


import javabeans.Inventory;

/*
 * @author Mitchell Lang
 */
public interface InventoryDAO {

	public ArrayList<Inventory> getAllInventory();
	public Inventory getInventory(int inventoryID);
}

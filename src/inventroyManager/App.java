package inventroyManager;

/**
 * This Java Store Inventory Management System project uses CRUD to perform
 * several inventory management operations. The CRUD operations include Create
 * New, Read, Update and Delete operations. It creates New Items like
 * books,groceries and electronics items and stores them in the inventory or text file.
 * The menu includes: 
 * Enter 1 to add new item to inventory
 * Enter 2 to view all items
 * Enter 3 to update item
 * Enter 4 to delete item
 * Enter 5 to save items text file
 * Enter 6 to delete all items
 * Enter 7 see total cost
 * Enter 8 for all names & quantities of items
 * Enter 9 to search item by name
 * Enter 10 to Exit
 *  
 * The application also reads Book,
 * Grocery and Electronic Items from log file
 * 
 * @author Johnfisher Uchem
 * @version 1.0.1 / 4/8/2025
 * @since Java Inventory Management System 1.0.0
 */

public class App {
	/**
	 * Main method for this application
	 * 
	 * @param args the string array's name for the non-return main method
	 */
	public static void main(String[] args) {

		// LAUNCH APP
		new InventoryData().userChoiseMenu();
		
		//You can also launch this app with this.
		/**
		 *InventoryData data = new InventoryData();
	     *data.userChoiseMenu();
		 */


	
	}

}

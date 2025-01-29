package inventroyManager;

/**
 * This simple Java Inventory Management System project uses CRUD to perform
 * several inventory management operations. The CRUD operations include Create
 * New, Read, Update and Delete operations. It creates New Items like
 * books,groceries and electronics items and store them in the inventory. The
 * menu includes views items, updates items, deletes items, creates inventory
 * log file, saves items in log file etc. The application also reads Book,
 * Grocery and Electronic Items from log file
 * 
 * @author Johnfisher Uchem
 * @version 1.0.2 / 1/29/2025
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
		new ItemsService().userChoiseMenu();

	}

}

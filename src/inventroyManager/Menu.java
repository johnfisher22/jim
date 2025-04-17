/**
 * 
 */
package inventroyManager;

/**
 * @author Johnfisher Uchem
 *
 */
public class Menu {

	public static void showStandardMenu() {
		String appMenu = "Enter 1 to add new item to inventory\n" 
							+ "Enter 2 to view all items\n" 
							+ "Enter 3 to update item\n" 
							+ "Enter 4 to delete item\n"
							+ "Enter 5 to save items text file\n" 
							+ "Enter 6 to delete all items\n" 
							+ "Enter 7 see total cost\n" 
							+ "Enter 8 for all names & quantities of items\n"
							+ "Enter 9 to search item by name\n"
							+ "Enter 10 to Exit";

		System.out.println("\nWELCOME TO THE JAVA INVENTORY MANAGEMENT SYSTEM!\n"
				+ "..................................................."); // + "\nPLEASE CHOOSE AN OPTION: ");
		System.out.println(appMenu);

	}

	public static void showInventoryItems() {
		String inventory = "Enter 1 to view inventory item(s): \n" + "Enter 2 to view inventory text file\n";

		System.out.println(inventory);

	}

	public static void showItemsMenu() {

		System.out.println("Select a number for item's type or 4 to exit");

		System.out.println("1. Book item \n" + "2. Electronic item\n" + "3. Grocery item\n" + "4. to exit");

	}

	public static void showItemTypes() {
		String items = "1 Book \n" + "2 Grocery \n" + "3. Electronic";
		System.out.println(items);
	}

}

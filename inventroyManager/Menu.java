/**
 * 
 */
package inventroyManager;

/**
 * @author uchej
 *
 */
public class Menu {

	public static void showMenu() {
		String appMenu = "1. Add new item\n" + "2. View items\n" + "3. Update item\n" + "4. Delete item\n"
				+ "5. Save inventory log\n" + "6. Delete all items\n" + "7. To Exit";

		System.out.println("\nWELCOME TO THE JAVA INVENTORY MANAGEMENT SYSTEM!\n"
				+ "..................................................." + "\nPLEASE CHOOSE AN OPTION: ");
		System.out.println(appMenu);

	}

	public static void showInventory() {
		String inventory = "Enter 1 to view inventory item(s): \n" + "Enter 2 to view inventory log\n";

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

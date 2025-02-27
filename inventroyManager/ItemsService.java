package inventroyManager;

import java.util.Scanner;

/**
 * This class organized operations on more visual and readable interface for the
 * entire application
 */
public class ItemsService extends InventoryData {

	InventoryData anyItem = new InventoryData();
	BookItem book = new BookItem();
	GroceryItem grocery = new GroceryItem();
	ElectronicItem electronic = new ElectronicItem();
	Items parentItem = new Items();

	Scanner keyboardInput = new Scanner(System.in);

	/**
	 * @see void method userChoiseMenu()
	 */
	public void userChoiseMenu() {

		int userChoice = 0;

		String confirm = "";

		do {
			Menu.showMenu();

			try {

				userChoice = keyboardInput.nextInt();

				switch (userChoice) {

				case 1: // Create new item
					anyItem.addNewItem();
					break;

				case 2: // View inventory items list or inventory log
					Menu.showInventory();
					userChoice = keyboardInput.nextInt();

					if (userChoice == 1) {
						System.out.println(anyItem.getItems());
					}

					else {
						readAndViewInventoryLog();
					}
					break;

				case 3: // Update item
					setItems();
					break;

				case 4: // delete an items
					System.out.println("Are you sure you want to delete this items? ");

					System.out.println("Enter y to delete this item or n to quit");

					confirm = keyboardInput.next();

					if (confirm.equalsIgnoreCase("y")) {
						anyItem.removeItem();

					} else {
						break;
					}
					break;

				case 5: // Save item(s) to inventory log file
					anyItem.saveInventoryLog(anyItem.getFileName());
					break;

				case 6: // Clears all items in the inventory
					System.out.println("Are you sure you want to delete all items? ");

					System.out.println("Enter y to delete all items or n to quit");

					confirm = keyboardInput.next();

					if (confirm.equalsIgnoreCase("y")) {
						anyItem.clear();
					} else {
						break;
					}

					break;

				default:// Default
					System.out.println("Wrong input!");
					break;

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Wrong input!\n");
				System.exit(0);

			}

		} while (userChoice > 0 && userChoice < 7);
		System.out.println("Thank you for using JIMS. Goodbye!");

	}
}

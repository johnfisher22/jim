package inventroyManager;

import java.io.File;
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
	ItemsImplem parentItem = new ItemsImplem();

	Scanner keyboardInput = new Scanner(System.in);
	
	/**
	 * @see void method showMenu()
	 */
	public void showMenu() {
		String appMenu = "1. Add new item\n" + "2. View items\n" + "3. Update item\n" + "4. Delete item\n"
				+ "5. Save inventory log\n" + "6. Delete all items\n" + "7. To Exit";

		System.out.println("\nWELCOME TO THE JAVA INVENTORY MANAGEMENT SYSTEM!\n"
				+ "..................................................." + "\nPLEASE CHOOSE AN OPTION: ");
		System.out.println(appMenu);

	}
	
	
	public void showInventory() {
		String inventory = "Enter 1 to view inventory item(s): \n" + "Enter 2 to view inventory log\n";
				
		System.out.println(inventory);

	}

	public void showItemTypes() {
		String items = "1 Book \n" + "2 Grocery \n" + "3. Electronic" ;
		System.out.println(items);
	}
	

	/**
	 * @see void method userChoiseMenu()
	 */
	public void userChoiseMenu() {
	
		int userChoice = 0;

		String confirm = "";

		do {
			showMenu();

			try {
				
				userChoice = keyboardInput.nextInt();

				switch (userChoice) {
				
				case 1: //Create new item
					anyItem.addNewItem();
					break;
					

				case 2: // View inventory items list or inventory log
					showInventory();
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

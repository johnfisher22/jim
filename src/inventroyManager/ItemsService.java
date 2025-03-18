package inventroyManager;

import java.util.Scanner;

/**
 * This class organized operations on more visual and readable interface for the
 * entire application
 */
public class ItemsService extends InventoryData {


	BookItem book = new BookItem();
	GroceryItem grocery = new GroceryItem();
	ElectronicItem electronic = new ElectronicItem();
	Items parentItem = new Items();

	public static Scanner keyboardInput = new Scanner(System.in);

	/**
	 * @see void method userChoiseMenu()
	 */
	public void userChoiseMenu() {

		int userChoice = 0;

		char confirm =' ';

		do {
			Menu.showMenu();

			try {
                 System.out.println("Choose an option?");
                 
				userChoice = keyboardInput.nextInt();

				switch (userChoice) {

				case 1: // Create new item
					super.addNewItem();
					break;

				case 2: // View inventory items list or inventory log
					Menu.showInventory();
					userChoice = keyboardInput.nextInt();

					if (userChoice == 1) {
						System.out.println(super.getItems());
					}

					else {
						readAndViewInventoryLog();
					}
					break;

				case 3: // Update item
					super.setItems();
					break;

				case 4: // delete an items
					System.out.println("Are you sure you want to delete this items? ");

					System.out.println("Enter y to delete this item or n to quit");

					confirm = keyboardInput.next().charAt(0);

					if (confirm == 'y'  || confirm == 'Y') { 
						super.removeItem();
						break;

					} 
			
					break;

				case 5: // Save item(s) to inventory log file
					super.saveInventoryLog(super.getFileName());
					break;

				case 6: // Clears all items in the inventory
					System.out.println("Are you sure you want to delete all items? ");

					System.out.println("Enter y to delete all items or n to quit");

					confirm = keyboardInput.next().charAt(0);

					if (confirm == 'y'  || confirm == 'Y') { 
						super.clear();
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

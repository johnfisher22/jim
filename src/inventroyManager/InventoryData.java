package inventroyManager;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 * This class controls inventory operations, manages inventory of
 * BookItem,GroceryItem and ElectronicItem items and provides CRUD - Create New,
 * Read, Update and Delete - operations.
 * 
 */
public class InventoryData {

	BookItem book = new BookItem();
	ElectronicItem electronic = new ElectronicItem();
	GroceryItem grocery = new GroceryItem();
	Items anyItem = new Items();

	private File inventoryFile;
	private String fileName = "inventory.log";

	// ArrayList that stores the inventory items
	private static ArrayList<Items> items = new ArrayList<Items>();

	public static Scanner keyboardInput = new Scanner(System.in);

	/**
	 * Non-parameterized constructor for this class
	 */
	InventoryData() {

	}

	/**
	 * Parameterized Constructor for Inventory Manager class
	 * 
	 * @param inventoryFile object that stores user's inventory log
	 * @param fileName      the name of the file the user stores inventory log
	 */
	InventoryData(String fileName, File inventoryFile) {
		this.inventoryFile = inventoryFile;
		this.fileName = fileName;

	}

	
	/**
	 * @return the fileName for the inventory log file
	 */
	public String getFileName() {
		return fileName;
	}

	
	/**
	 * @param fileName the fileName user will save the list of items
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
	/**
	 * @return the inventoryFile where the user stores the list of items
	 */
	public File getInventoryFile() {

		return inventoryFile;
	}

	
	/**
	 * @param inventoryFile the inventoryFile the user will enter the list of items
	 */
	public void setInventoryFile(File inventoryFile) {
		this.inventoryFile = inventoryFile;
	}

	
	/**
	 * 
	 * @returns the updated item
	 */
	public ArrayList<Items> setItems() {

		System.out.println("Enter the id of item to update");

		String itemId = keyboardInput.next();

		System.out.println("Please enter new id");

		String newId = keyboardInput.next();

		for (Items itemsObj : items) {
			if (itemsObj instanceof BookItem books) {
				if (books.id.equals(itemId))
					books.setId(newId);

			}

			else if (itemsObj instanceof ElectronicItem electronic) {
				if (electronic.id.equals(itemId))
					electronic.setId(newId);

			}

			else if (itemsObj instanceof GroceryItem grocery) {
				if (grocery.id.equals(itemId))
					grocery.setId(newId);
			} else {
				System.out.println("Item not found!");

			}
			keyboardInput.close();
		}
		return items;
	}

	
	/**
	 * 
	 * @param anyItem the item object that is removed
	 * @return boolean status of removed object
	 */
	public boolean remove(Items anyItem) {
		return items.remove(anyItem);
	}

	
	public void removeItem() {

		System.out.println("Enter id of the item to be removed");

		String itemId = keyboardInput.next();

		for (Items item : items) {

			if (item.getId().equalsIgnoreCase(itemId))
				if (item instanceof BookItem || item instanceof ElectronicItem || item instanceof GroceryItem) {
					remove(item);

					System.out.println(item.getClass().getSimpleName() + " was removed successfully!\n");
					break;

				}

				else {

					System.out.println("Item not found!");

				}
			keyboardInput.close();
		}

	}

	
	/**
	 * 
	 * @param anyItem the item(s) to be added to list inventory
	 * @returns added items to list inventory
	 */
	public static ArrayList<Items> addItem(Items anyItem) {

		if (anyItem.equals(null)) {

			System.out.println("Item not found!");
		}

		items.add(anyItem);
		System.out.println(anyItem.getClass().getSimpleName() + " was added successfully!\n");

		return items;
	}

	
	/**
	 * @see void method clear()
	 */
	public void clear() {

		items.clear();

		System.out.println("All Item are removed successfully");

		System.out.println(items);
	}

	
	public void createFile() {

		try {

			inventoryFile = new File(fileName);

			if (inventoryFile.createNewFile()) {
				System.out.println("File created: " + inventoryFile.getName());
			}

			else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			System.out.println("An error occurred.");

			System.out.println(e.getMessage());
		}
	}

	
	/**
	 * @see void method readAndViewInentoryLog()
	 */
	public void readAndViewInventoryLog() {
		Scanner file = null;

		try {
			file = new Scanner(new FileInputStream(fileName));

			if (!file.hasNextLine() || file.equals(null)) {

				System.out.println("Inventory log is empty\n");
			}

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException has occurred!");

			System.exit(0);
		}

		while (file.hasNextLine() == true) {
			fileName = file.nextLine();

			System.out.println(fileName);
		}

		file.close();
	}

	
	/**
	 * @param fileName the name of the file where the user saves inventory Logs
	 */
	public void saveInventoryLog(String fileName) {
		this.fileName = fileName;

		if (items.isEmpty()) {
			System.out.println("Inventory log file " + getFileName() + " is empty\n");

		} else {
			try (PrintWriter printwriter = new PrintWriter(new FileWriter(fileName, true))) {
				printwriter.println(items);

				System.out.println("This category was appended to the file.\n");

				printwriter.close();
			}

			catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
	}

	
	/**
	 * @return all the items in the inventory
	 */
	public ArrayList<Items> getItems() {

		if (items.isEmpty()) {

			System.out.println("Inventory is empty\n");

			return items;
		}

		return items;
	}

	
	/**
	 * @param anyItem the items in the inventory the user wants to view
	 */
	public void viewItem(Items anyItem) {

		if (items.isEmpty()) {

			System.out.println("Inventory is empty\n");
		}

		else {
			for (Items allItems : items) {

				System.out.println(allItems);

			}

		}
	}

	
	/**
	 * @see void method showItemsMenu()
	 */

	public void addNewItem() {
		int numberOfItems = 0;
		int selectNumber;

		System.out.println("Enter 1 to add an item\n");
		numberOfItems = keyboardInput.nextInt();

		do {

			System.out.println("Select a number for item's type or 4 to exit");

			System.out.println("1. Book item " + "\n2. Electronic item" + "\n3. Grocery item\n" + "4. to exit");

			selectNumber = keyboardInput.nextInt();

			for (int i = 0; i < numberOfItems;) {

				if (selectNumber == 1) {

					book.createBookItem();
					break;
				}

				else if (selectNumber == 2) {

					electronic.createElectronicItem();
					break;
				} else if (selectNumber == 3) {

					grocery.createGroceryItem();
					break;
				} else {
					System.out.println("Exit or wrong selection!");

				}
				break;
			}

		} while (selectNumber > 0 && selectNumber < 4);
		System.out.println("You exited addNewItem function!");
	}

	
	/**
	 * @return string values of inventory items
	 */
	@Override
	public String toString() {
		return ("Items: " + items.toString());

	}

}

package inventroyManager;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.io.*;
import java.util.Scanner;

/**
 * This class controls inventory operations, 
 * manages inventory of BookItem,GroceryItem and ElectronicItem items
 * and provides CRUD - Create New, Read, Update and Delete - operations.
 * 
 */
/**
 * 
 * @author Johnfisher Uchem
 *
 */
public class InventoryData {

	private File inventoryFile;
	private String fileName = "inventory.log";

	protected static ArrayList<Items> items = new ArrayList<>();

	public static Scanner keyboardInput = new Scanner(System.in);

	/**
	 * Non-parameterized constructor for this class
	 */
	InventoryData() {

	}

	/**
	 * Parameterized Constructor for Inventory Manager class
	 * 
	 * @param inventoryFile object that stores user's inventory text file
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
	 * @param inventoryFile the inventoryFile the user will store the list of items
	 */
	public void setInventoryFile(File inventoryFile) {
		this.inventoryFile = inventoryFile;
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
	 * @param fileName the name of the text file where the user saves inventory list
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
	 * @return the items
	 */
	public ArrayList<Items> getItems() {

		if (items.isEmpty()) {

			System.out.println("Inventory is empty\n");

			return items;
		}

		return items;
	}

	
//Shows inventory items
	public void showItems() {

		Menu.showInventoryItems();

		int userChoice = keyboardInput.nextInt();

		if (userChoice == 1) {
			System.out.println(getItems());
		}

		else if (userChoice == 2) {
			readAndViewInventoryLog();
		}

		else {
			System.out.println("Check your entry?");
		}

	}

	/**
	 * 
	 * @param anyItem the item object that is removed
	 * @return boolean status of removed object
	 */
	public static boolean remove(Items anyItem) {
		return items.remove(anyItem);
	}

	/**
	 * 
	 * @see java.util.ArrayList#clear()
	 */
	public void clear() {
		items.clear();
	}

	/**
	 * 
	 * @param idToUpdate
	 */
	public static void updateItem(String idToUpdate) {

		System.out.println("Please enter new id");

		String newId = keyboardInput.next();

		for (Items item : items) {

			if (item.getId().equals(idToUpdate)) {

				item.setId(newId);

				System.out.println("New id successfully updated!");
			}
		}
	}

	// Deletes an item from the inventory
	public static void deleteItem() {

		System.out.println("Enter id of the item to be removed");

		String itemId = keyboardInput.next();

		for (Items item : items) {

			if (item.getId().equalsIgnoreCase(itemId))
				if (item instanceof BookItem || item instanceof ElectronicItem || item instanceof GroceryItem) {
					remove(item);

					System.out.println(item.getClass().getSimpleName() + " was removed successfully!\n");
					break;

				}

		}

	}

	// Deletes all items in the inventory list
	public static void clearItems() {

		items.clear();

		System.out.println("All Items were removed successfully");

		System.out.println(items);
	}

	// Gets total cost of all items in the inventory
	public void getTotalCost() {

		int sum = 0;

		for (Items item : items) {

			sum += item.getPrice();

		}
		System.out.println("Total cost for the " + items.size() + " item(s) is: $" + sum);
	}

	// Gets all items names and quantities from inventory list
	public static void getAllItemsNames() {

		int count = 1;

		System.out.println("\nNames of items in your inventory are: ");
		for (Items item : items) {

			System.out.println(count + " is " + item.getClass().getSimpleName() + ", Name: " + item.getName()
					+ ", Qty: " + item.getQuantity());
			count++;
		}

	}
	
	//Finds an item by name
	public static void findItemByName(String itemName) {
		
		for(Items item: items) {
			
			if(item.getName().equalsIgnoreCase(itemName)) {
				
				System.out.println("\nFound it!");
				System.out.println(item.toString());
				break;
			}

			System.out.println("\nCan't find it!");
		}
		
		
	}

	// Standard menu and operation methods for this application
	public void userChoiseMenu() {

		String userChoice = null;

		char confirm = ' ';

		do {
			Menu.showStandardMenu();

			try {

				userChoice = keyboardInput.next();

				switch (userChoice) {

				case "1": // Creates new item
					createItem();
					break;

				case "2": // Views inventory items list or inventory log text file
					showItems();
					break;

				case "3": // Updates an item
					String idToUpdate = null;

					System.out.println("Enter id of the item");

					idToUpdate = keyboardInput.next();

					updateItem(idToUpdate);

					break;

				case "4": // Deletes an item from the inventory list
					System.out.println("Are you sure you want to delete this items? ");

					System.out.println("Enter y to delete this item or n to quit");

					confirm = keyboardInput.next().charAt(0);

					if (confirm == 'y' || confirm == 'Y') {
						deleteItem();
						break;

					}

					break;

				case "5": // Saves inventory item(s) to text file
					saveInventoryLog(getFileName());
					break;

				case "6": // Clears all items in the inventory
					System.out.println("Are you sure you want to delete all items? ");

					System.out.println("Enter y to delete all items or n to quit");

					confirm = keyboardInput.next().charAt(0);

					if (confirm == 'y' || confirm == 'Y') {
						clearItems();
					}
					break;

				case "7": // Gets total cost of all items in the inventory list
					getTotalCost();
					break;

				case "8": // Gets all items names and quantities
					getAllItemsNames();
					break;
					
				case "9": // Finds an item by name
					
					System.out.println("Enter name of item to search");
					String itemName = keyboardInput.next();
					
					findItemByName( itemName);
					break;
					
				case "10": // Exit the program
					System.out.println("You exited the program!");
					 System.exit(0);

				default: // Default
					System.out.println("Wrong input!");
					break;

				}
			} catch (NoSuchElementException e) {

				System.out.println("Wrong element!\n");
				break;
			} catch (Exception e) {
				System.out.println("Wrong input!\n");

				break;
			}

			//Seeks user's validation to continue the program
			System.out.println("\nWould you like to continue?\nEnter 1 to continue \nEnter 9 to exit");

			userChoice = keyboardInput.next();

			if (userChoice.equals("1")) {
				continue;
			}

			else if(userChoice.equals("10")) {
				
				break;
				
			}

		} while (userChoice != "10");

		System.out.println("Thank you for using JIMS. Goodbye!");

	}

	// Method call to create new item
	public void createItem() {
		System.out.println("Enter 1 to add an item\n");

		System.out.println("Enter 1 for Book item " + "\nEnter 2 for Electronic item" + "\nEnter 3 for Grocery item\n"
				+ "Enter 4 to exit");

		String selectNumber = null;
		selectNumber = keyboardInput.next();

		if (selectNumber.equals("1")) {
			createBookItem();

		} else if (selectNumber.equals("2")) {
			createElectronicItem();

		} else if (selectNumber.equals("3")) {

			createGroceryItem();
		} else {
			System.out.println("Wrong entry!");
		}

	}

	// Creates new book item and adds it to inventory
	public void createBookItem() {

		BookItem book = new BookItem();

		try {

			System.out.println("Enter book's Id: ");
			book.id = keyboardInput.next();

			keyboardInput.nextLine();
			System.out.println("Enter book's name: ");
			book.name = keyboardInput.nextLine();

			System.out.println("Enter book's quantity: ");
			book.quantity = keyboardInput.nextInt();

			System.out.println("Enter book's price: ");
			book.price = keyboardInput.nextDouble();

			keyboardInput.nextLine();
			System.out.print("Enter book's category: \n");
			book.category = keyboardInput.nextLine();

			System.out.print("Enter book's author: ");
			book.setAuthor(keyboardInput.nextLine());

			items.add(book);

			System.out.println("\n" + book.toString() + "\nBook item was added successfully!\n");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Input mismatch!");

		}

	}

	// Creates new electronic item and adds it to inventory
	public static void createElectronicItem() {

		ElectronicItem electronic = new ElectronicItem();

		System.out.println("We need information for the electronic items\n");
		try {

			System.out.println("Enter the electronic items Id: ");
			electronic.id = keyboardInput.next();

			keyboardInput.nextLine();
			System.out.println("Enter the electronic items name: ");
			electronic.name = keyboardInput.nextLine();

			System.out.println("Enter the electronic items quantity: ");
			electronic.quantity = keyboardInput.nextInt();

			System.out.println("Enter  the electronic items price: ");
			electronic.price = keyboardInput.nextDouble();

			keyboardInput.nextLine();
			System.out.print("Enter  the electronic items category: ");
			electronic.category = keyboardInput.nextLine();

			System.out.print("Enter  the electronic items brand: ");
			electronic.setBrandName(keyboardInput.nextLine());

			items.add(electronic);

			System.out.println(electronic.toString() + "Electronic item was added successfully!\n");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Input mismatch!");

		}

	}

	// Creates new grocery item and adds it to inventory
	public static void createGroceryItem() {

		GroceryItem grocery = new GroceryItem();

		System.out.println("We need the information for grocery items\n");

		try {

			System.out.println("Enter grocery item's Id: ");
			grocery.id = keyboardInput.next();

			keyboardInput.nextLine();
			System.out.println("Enter grocery item's name: ");
			grocery.name = keyboardInput.nextLine();

			System.out.println("Enter grocery item's quantity \nin bag counts or number of pieces: \n");
			grocery.quantity = keyboardInput.nextInt();

			System.out.println("Enter grocery item's price: ");
			grocery.price = keyboardInput.nextDouble();

			keyboardInput.nextLine();
			System.out.print("Enter grocery item's category: ");
			grocery.category = keyboardInput.nextLine();

			items.add(grocery);

			System.out.println("\n" + grocery.toString() + "Grocery item was added successfully!\n");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Input mismatch!");

		}

	}

	/**
	 * @return
	 * @see java.util.AbstractCollection#toString()
	 */
	public String toString() {
		return items.toString();
	}
}

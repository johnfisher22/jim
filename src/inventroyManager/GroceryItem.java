package inventroyManager;

import java.util.Scanner;

/**
 * 
 * @author Johnfisher Uchem
 *
 */

public class GroceryItem extends Items {

	public static Scanner keyboardInput = new Scanner(System.in);

	/**
	 * @param non-parameterized constructor for this grocery class
	 */
	public GroceryItem() {

	}

	
	/**
	 * Parameterized constructor for this grocery class
	 * 
	 * @param id       the id of the grocery item
	 * @param name     the name of the grocery item
	 * @param quantity the quantity of the grocery item
	 * @param price    the price of the grocery item
	 * @param category the category of the grocery item
	 */
	public GroceryItem(String id, String name, int quantity, double price, String category) {
		super(id, name, quantity, price, category);

	}

	
	/**
	 * @param id the id of the grocery item
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	
	/**
	 * @param name the name of the grocery item
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param quantity the quantity of the grocery item
	 */
	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	/**
	 * @param price the price of the grocery item
	 */
	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param category the category of the grocery item
	 */
	@Override
	public void setCategory(String category) {
		this.category = category;
	}

	
	/**
	 * @return id the id of the grocery item
	 */
	@Override
	public String getId() {

		return id;
	}

	/**
	 * @return the name of the grocery item
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
	/**
	 * @return the quantity of the grocery item
	 */
	@Override
	public int getQuantity() {
       if(quantity < 0 ) {
    	   
    	   return 0;
       }
       
		return quantity;
	}

	
	/**
	 * @return the price of the grocery item
	 */
	@Override
	public double getPrice() {
		
		if(price < 0) {
			return 0;
		}
		
		return price;
	}

	
	/**
	 * @return category of the grocery item
	 */
	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return category;
	}

	
	
	/**
	 * @return the id, name, quantity, price and category of the grocery item
	 */
	@Override
	public String toString() {

		return ("GROCERY ITEMS :\n" + "ID: " + id + "\nName: " + name + "\nQuantity: " + quantity + "\nPrice: "
				+ fdollar.format(price) + "\nCategory: " + category + "\n");
	}

}

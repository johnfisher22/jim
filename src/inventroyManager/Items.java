/**
 * 
 */
package inventroyManager;

import java.text.NumberFormat;
import java.util.Scanner;

public class Items {

	// Currency formatter used in this project
	NumberFormat fdollar = NumberFormat.getCurrencyInstance();

	protected String id;
	protected String name;
	protected int quantity;
	protected double price;
	protected String category;

	public static Scanner keyboardInput = new Scanner(System.in);

	

	
	/**
	 * 
	 */
	public Items() {
		super();
	}




	/**
	 * @param id
	 * @param name
	 * @param quantity
	 * @param price
	 * @param category
	 */
	public Items(String id, String name, int quantity, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
	}




	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}




	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		
		if(quantity < 0) {
			return 0;
		}
		return quantity;
	}




	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	/**
	 * @return the price
	 */
	public double getPrice() {
		
		if(price < 0) {
			
			return 0;
		}
		return price;
	}




	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}




	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}




	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}




	/**
	 * 
	 * @return the id, name, quantity, price and category of the items
	 */
	public String toString() {
		return ("ITEMS :\n" + "ID: " + id + "\nName: " + name + "\nQuantity: " + quantity + "\nPrice: " + price
				+ "\nCategory: " + category + "\n");
	}

}

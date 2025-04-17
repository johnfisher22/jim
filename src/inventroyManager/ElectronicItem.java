package inventroyManager;

import java.util.Scanner;

/**
 * @author Johnfisher Uchem
 */

/**
 * ElectrnonicItem class extends Items class and
 * represents electronic items
 * 
 *
 */
public class ElectronicItem extends Items {

	private String brandName;

	public static Scanner keyboardInput = new Scanner(System.in);

	/**
	 * Non-parameterized constructor for electronic items class
	 */
	public ElectronicItem() {

	}

	/**
	 * Parameterized constructor for electronic items class
	 * 
	 * @param id        the id of the electronic items
	 * @param name      the name of the electronic items
	 * @param quantity  the quantity of the electronic items
	 * @param price     the price of the electronic items
	 * @param category  the category of the electronic items
	 * @param brandName the brand name of the electronic items
	 */
	public ElectronicItem(String id, String name, int quantity, double price, String category, String brandName) {
		super(id, name, quantity, price, category);
		this.brandName = brandName;

	}

	
	/**
	 * @param id the id of the electronic items
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	
	/**
	 * @param name the name of the electronic items
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * @param quantity the quantity of the electronic items
	 */
	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	/**
	 * @param price the price of the electronic items
	 */
	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	
	/**
	 * @param category the category of the electronic items
	 */
	@Override
	public void setCategory(String category) {
		this.category = category;
	}

	
	/**
	 * @return the brandName of the electronic items
	 */
	public String getBrandName() {
		return brandName;
	}

	
	/**
	 * @param brandName the brandName of the electronic items
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	
	/**
	 * @return the id of the electronic items
	 */
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	
	/**
	 * @return the name of the electronic items
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
	/**
	 * @return the quantity of electronic items
	 */
	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		if (quantity < 0) {
			
			return 0;
		} 
		
		else {
			return quantity;
		}
	}

	
	/**
	 * @return the price of the electronic item
	 */
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		if (price < 0) {
			
			return 0;
		} 
		
		else {
			return price;
		}

	}

	
	/**
	 * @return the category of the electronic items
	 */
	@Override
	public String getCategory() {
		return category;
	}

	
	/**
	 * 
	 * @return the id, name, quantity, price, category and brand name of the
	 *         electronic item
	 */
	@Override
	public String toString() {

		return ("ELECTRONIC ITEMS :\n" + "ID: " + id + "\nName: " + name + "\nQuantity: " + quantity + "\nPrice: "
				+ fdollar.format(price) + "\nCategory: " + category + "\nBrand Name: " + brandName + "\n");
	}

}

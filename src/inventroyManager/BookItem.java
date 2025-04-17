package inventroyManager;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Johnfisher Uchem
 */

/**
 * BookItem class extends Items class and represents
 * book items
 */
public class BookItem extends Items {

	private String author;

	public static Scanner keyboardInput = new Scanner(System.in);

	NumberFormat fdollar = NumberFormat.getCurrencyInstance();

	/**
	 * Non-parameterized constructor for BookItem class
	 */
	public BookItem() {

	}

	/**
	 * Parametric constructor for BookItem class
	 * 
	 * @param id
	 * @param name     the id of book item
	 * @param quantity the quantity of book items
	 * @param price    the price of book item
	 * @param category the category of item
	 * @param author   the author of book items
	 */
	public BookItem(String id, String name, int quantity, double price, String category, String author) {
		super(id, name, quantity, price, category);
		this.author = author;

	}

	/**
	 * @param id the id of book item
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param name the name of the book item
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param quantity the quantity of book items
	 */
	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param price the price of the book item
	 */
	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param category the category of the book item
	 */
	@Override
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the author of the book item
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author of the book item
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the id of the book item
	 */
	@Override
	public String getId() {

		return id;
	}

	/**
	 * @return name the name of the book item
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @return the quantity of the book items
	 */
	@Override
	public int getQuantity() {
		if (quantity < 0) {

			return 0;
		}

		else {
			return quantity;
		}

	}

	/**
	 * @return the price of the book item
	 */
	@Override
	public double getPrice() {
		if (price < 0) {

			return 0;
		}

		else {
			return price;
		}

	}

	/**
	 * @return the category of the book item
	 */
	@Override
	public String getCategory() {

		return category;
	}

	/**
	 * @return id, name, quantity, price, category and author of the book items
	 */
	@Override
	public String toString() {

		return ("BOOK ITEMS :\n" + "ID: " + id + "\nName: " + name + "\nQuantity: " + quantity + "\nPrice: "
				+ fdollar.format(price) + "\nCategory: " + category + "\nAuthor: " + author + "\n");
	}

}

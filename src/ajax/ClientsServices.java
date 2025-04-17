/**
 * 
 */
package ajax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author Johnfisher Uchem
 * ClientsServices extends ClientsRecords. This class manages bills, rent
 * payment and transactions.
 */

public class ClientsServices extends ClientsRecords {

	private String fullName;
	private double houseRent = 850;
	private double energyBill;
	private double internetBill = 65.00;
	private double tvStreamingBill = 20.00;
	private double garbageBill = 55.00;

	private String fileName = "paymentFile.txt";
	

	private static ArrayList<ClientsServices> clientAccount = new ArrayList<>();

	private static ArrayList<String> residentGatePass = new ArrayList<String>();

	LocalDateTime payDate = LocalDateTime.now();

	DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	/**
	 * Non- parametric constructor for ClientsAccount class
	 */
	public ClientsServices() {

	}

	/**
	 * Parametric constructor for ClientsAccount class
	 * 
	 * @param houseRent
	 * @param energyBill
	 * @param internetBill
	 * @param tvStreamingBill
	 * @param garbageBill
	 * @param fullName
	 */
	public ClientsServices(double houseRent, double energyBill, double internetBill, double tvStreamingBill,
			double garbageBill, String fullName) {
		super();
		this.fullName = fullName;
		this.houseRent = houseRent;
		this.energyBill = energyBill;
		this.internetBill = internetBill;
		this.tvStreamingBill = tvStreamingBill;
		this.garbageBill = garbageBill;

	}

	/**
	 * @return the fullName from getFullName method
	 */
	public String getFullName() {
		return fullName;
	}

	
	/**
	 * Sets fullName for ClientsAccount.
	 * 
	 * @param fullName, fullName parameter in setFullName method
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	/**
	 * Gets houseRent for ClientsAccount.
	 * 
	 * @return the houseRent from getHouseRent method
	 */
	public double getHouseRent() {
		return houseRent;
	}

	
	/**
	 * Sets houseRent for ClientsAccount.
	 * 
	 * @param houseRent, houseRent parameter in setHouseRent method
	 */
	public void setHouseRent(double houseRent) {
		this.houseRent = houseRent;
	}

	
	/**
	 * Gets internetBill for ClientsAccount.
	 * 
	 * @return the internetBill from getInternetBill method
	 */
	public double getInternetBill() {

		return internetBill;
	}

	
	/**
	 * Sets internetBil for ClientsAccount.
	 * 
	 * @param internetBill the internetBill parameter in setInternetBill method
	 */
	public void setInternetBill(double internetBill) {
		this.internetBill = internetBill;
	}

	
	/**
	 * Gets tvStreamingBill for ClientsAccount.
	 * 
	 * @return the tvStreamingBill from getTvStreamingBill method
	 */
	public double getTvStreamingBill() {
		return tvStreamingBill;
	}

	
	/**
	 * Sets tvStreamingBill for ClientsAccount.
	 * 
	 * @param tvStreamingBill the tvStreamingBill parameter in the
	 *                        setTvStreamingBill method
	 */
	public void setTvStreamingBill(double tvStreamingBill) {
		this.tvStreamingBill = tvStreamingBill;
	}

	
	/**
	 * Gets the garbageBill for ClientsAccount.
	 * 
	 * @return the garbageBill from getGarbageBill method
	 */
	public double getGarbageBill() {
		return garbageBill;
	}

	
	/**
	 * Sets garbageBill for ClientsAccount.
	 * 
	 * @param garbageBill the garbageBill parameter in the setGarbagebill method
	 */
	public void setGarbageBill(double garbageBill) {
		this.garbageBill = garbageBill;
	}

	
	/**
	 * Sets the energyBill for ClientsAccount.
	 * 
	 * @param energyBill the energyBill parameter in the setEnergyBill method
	 */
	public void setEnergyBill(double energyBill) {
		this.energyBill = energyBill;
	}

	
	/**
	 * Gets the energyBill for ClientsAccount.
	 * 
	 * @return the energyBill from getEnergyBill method
	 */
	public double getEnergyBill() {

		double energyCharge;
		double fixedCharge = 10.50;
		double electricityDuty = 15.00;

		System.out.println("Enter amount on your apartment's meter charge:");

		try {
			energyCharge = keyboardInput.nextDouble();
			if (energyCharge > 0) {

				energyBill = fixedCharge + electricityDuty + energyCharge;

				System.out.printf("$%.2f", energyBill);
				return energyBill;
			}

			else {

				System.out.println("Amount must be greater than 0:");
				return energyBill;
			}
		} catch (Exception e) {
			System.out.println("Invalid entry!");
			System.exit(0);
		}
		return this.energyBill;
	}

	
	/**
	 * Adds new payment to ClientsAccount.
	 * 
	 * @param newPayment parameter in the addpPayingClient method
	 */
	public void addPayingClient(ClientsServices newPayment) {
		clientAccount.add(newPayment);

		System.out.println("New client payment added successfully!");
	}

	
	/**
	 * Gets clientAccount for ClientsAccount.
	 * 
	 * @return the clientAccount from getClientAccount method
	 */
	public ArrayList<ClientsServices> getClientAccount() {
		if (clientAccount.isEmpty()) {
			System.out.println("Payment record is empty!");
		}
		return clientAccount;
	}

	
	
	/**
	 * Gets the accounts payment file name.
	 * 
	 * @return the fileName from getFileName method
	 */
	public String getFileName() {
		return fileName;
	}

	
	/**
	 * Sets the fileName
	 * 
	 * @param fileName the fileName parameter in the setFileName method
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
	public void makePayment() {
		
		System.out.println("\nReady to pay your bills and rent?");

		energyBill = getEnergyBill();

		internetBill = getInternetBill();
		tvStreamingBill = getTvStreamingBill();
		garbageBill = getGarbageBill();
		houseRent = getHouseRent();

		System.out.print(" is your energy bill\n");
		keyboardInput.nextLine();
		System.out.println("\nEnter your fullName name: ");
		fullName = keyboardInput.nextLine();

		System.out.println("\nView your payment details\n");

		System.out.println(toString());

		// Creates and adds new client bills payment
		this.addPayingClient(new ClientsServices(houseRent, energyBill, internetBill, tvStreamingBill, garbageBill, fullName));     //addPayingClient(anyAccount);

		// Formats formattedDate for payment time stamp
		String formattedDate = formatDate.format(payDate);

		System.out.println("Account payment submitted! : " + formattedDate);
		System.out.println("Payment successfull!\n");
	}

	
	
	/**
	 * PayBill method creates and controls new monthly bills and rents payment
	 */
	public void payBill() {

		int nextClient = 0;

		houseRent = 850;
		internetBill = 65.00;
		tvStreamingBill = 20.00;
		garbageBill = 55.00;

		do {
			// Shows the menu for this function
			MenuServiceImpl.showMenu();

			try {
				nextClient = keyboardInput.nextInt();
			} catch (Exception e) {
				System.out.println("Input mismatch!");
				System.exit(0);
			}
			switch (nextClient)

			{
			case 0: // Pay bills and rent
				makePayment();
				continue;

			case 1:
				// Delete all payment records
				if (clientAccount.isEmpty()) {
					System.out.println("Payment records is empty!\n");
					break;
				} else {
					clientAccount.clear();
					System.out.println("All payment records deleted successfully!\n");
					break;
				}

			case 2:
				// View all payments
				System.out.println(getClientAccount());
				break;
				
			case 3:
				// Save payment to file
				savePayment(fileName);
				break;
				
			case 4:
				// View payment on payment file
				ReadPaymentFile();
				break;
				
			default:
				System.out.println("You exited the program");
				System.exit(0);

			}
		} while (nextClient >= 0 && nextClient < 5);
		System.out.println("You exited addNewItem function!");
	}

	
	
	/**
	 * Creates payment file if no file exists or deleted. createFile void function
	 */
	public void createFile() {

		try {

			File paymentFile = new File(fileName);

			if (paymentFile.createNewFile()) {
				System.out.println("File created: " + paymentFile.getName());
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
	 * Reads and prints payment file contents. Void readPaymentFile method
	 */
	public void ReadPaymentFile() {
		Scanner file = null;

		try {
			file = new Scanner(new FileInputStream(fileName));

			if (!file.hasNextLine() || file.equals(null)) {

				System.out.println("Payment file is empty\n");
			}

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException has occurred!");

			System.exit(0);
		}

		while (file.hasNextLine() == true) {
			String readPaymentFile = file.nextLine();

			System.out.println(readPaymentFile);
		}

		file.close();
	}

	
	
	/**
	 * Saves payment entries into payment file.
	 * 
	 * @param fileName void function, fileName parameter in the savePayment method
	 */
	public void savePayment(String fileName) {
		createFile();

		fileName = this.fileName;

		if (clientAccount.isEmpty()) {
			System.out.println("Payment file " + getFileName() + " has no new payment\n");

		} else {
			try (PrintWriter printwriter = new PrintWriter(new FileWriter(fileName, true))) {
				printwriter.println(clientAccount);

				System.out.println("This payment was appended to the file successfully!.\n");

				printwriter.close();
			}

			catch (IOException e) {
				System.out.println("Input mismatch!");
				System.exit(0);
			}

		}
	}

	
	
	/**
	 * Gets residentGatePass.
	 * 
	 * @return the residentGatePass from getResidentGatePass method
	 */
	public ArrayList<String> getResidentGatePass() {

		return residentGatePass;
	}
	
	
	/**
	 * Adds newGatePass.
	 * 
	 * @param newGatePass parameter in the addGatePass method
	 */
	public void addGatePass(String newGatePass) {
		residentGatePass.add(newGatePass);

	}

	
	
	/**
	 * This void function controls several operations with gate pass. Some of the
	 * operations includes verify gate pass to enter apartment block. Create new
	 * gate pass, delete a gate pass and enter staff gate pass to see all clients
	 * gate passes
	 */
	public void useAccessIdCard() {

		residentGatePass.add("ajax3401");
		residentGatePass.add("ajax3402");
		residentGatePass.add("ajax3403");
		residentGatePass.add("\n ajax3404");
		residentGatePass.add("ajax3405");
		residentGatePass.add("ajax3406");
		residentGatePass.add("\n ajax3407");
		residentGatePass.add("ajax3408");
		residentGatePass.add("ajax3409");
		residentGatePass.add("\n ajax3410");
		residentGatePass.add("ajax3400");

		// .........................................
		// General staff access Id is "staffaj719"
		// ........................................

		int userInput = 0;

		do {

			MenuServiceImpl.showGateAccessMenu();

			try {
				userInput = keyboardInput.nextInt();
			} catch (Exception e3) {

				System.out.println("Input mismatch!");
				System.exit(0);
			}

			switch (userInput) {
			case 1:// Enter your gate pass to enter your apartment block
				enterGatePass();
				break;

			case 2: // Create new gate pass
				createNewGatePass();
				break;

			case 3: // Delete a gate pass
				deleteGatePass();
				break;

			case 4: // Enter staff access code to see all access cards
				viewAllGatePassAsStaff();

				break;

			default:
				System.out.println("Invalid entry !\n");
				break;
			}
		} while (userInput > 0 && userInput < 5);
		System.out.println("\nYou exited useAccessIdCard function");
		userInput++;
	}
    
	
	
	public void enterGatePass() {
		String clientGatePass = "";

		System.out.println("Insert your 8 digits gate pass");

		try {
			clientGatePass = keyboardInput.next();
		} catch (Exception e2) {
			System.out.println("Input mismatch!");
			System.exit(0);
		}

		if (residentGatePass.contains(clientGatePass)) {
			System.out.println("ACCESS GRANTED!\n");

		}

		else {
			System.out.println("Access denied !\n");
		}

	}

	
	
	public void createNewGatePass() {

		System.out.println("Enter a new gate pass code");

		try {
			String newGatePass = keyboardInput.next();

			System.out.println("\nTotal gate passes before adding new one is: " + residentGatePass.size());

			addGatePass(newGatePass);
			System.out.println("NEW ACCESS CARD ADDED !\n");

			System.out.println(residentGatePass);

			System.out.println("\nTotal gate passes after adding new one is: " + residentGatePass.size());
		} catch (Exception e1) {
			System.out.println("Input mismatch!");
			System.exit(0);
		}

	}

	
	
	public void deleteGatePass() {

		System.out.println("Enter a gate pass code to delete");

		try {
			String gatePass = keyboardInput.next();

			System.out.println("Total number before deleting gate pass: " + residentGatePass.size());

			residentGatePass.remove(gatePass);
			System.out.println(gatePass + " was deleted successfully!\n");

			System.out.println(residentGatePass);

			System.out.println("\nTotal gate passes after removing one is: " + residentGatePass.size());

		} catch (Exception e1) {
			System.out.println("Input mismatch!");
			System.exit(0);
		}
	}

	
	
	public void viewAllGatePassAsStaff() {
		String staffInput = "";
		String seeAllAccessCard = "staffaj719";

		System.out.println("Enter staff access code to see all gate pass");

		try {
			staffInput = keyboardInput.next();
		} catch (Exception e) {
			System.out.println("Input mismatch!");
			System.exit(0);
		}

		if (staffInput.equalsIgnoreCase(seeAllAccessCard)) {
			System.out.println("\n" + getResidentGatePass() + " ");
		}

		else {
			System.out.println("Wrong access card number!");
		}

	}

	
	
	/**
	 * @return toString values from toString method
	 */
	@Override
	public String toString() {
		return ("Client's Full Name: " + fullName + "\nHouse Rent : " + houseRent + "\nEnergy Bill :" + energyBill
				+ "\nInternet Bill: " + internetBill + "\nTv Streaming Bill: " + tvStreamingBill + "\nGarbage Bill: "
				+ garbageBill + "\n\n");
	}

}

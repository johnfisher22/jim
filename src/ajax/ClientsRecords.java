package ajax;

import java.util.*;

/**
 * @author Johnfisher Uchem 
 * ClientRecords class controls clients records and information.
 */

public class ClientsRecords {

	private String fullName;
	private int aptNumber;
	private String moveInDate;
	private String leaseEndDate;
	private int familySize;
	private String petType;
	private int carParkNumber;

	protected static ArrayList<ClientsRecords> clients = new ArrayList<>();

	Scanner keyboardInput = new Scanner(System.in);

	/**
	 * Non-parametric constructor for ClientRecords class.
	 */
	public ClientsRecords() {

	}

	/**
	 * Parametric constructor for ClientRecords class.
	 * 
	 * @param fullName
	 * @param aptNumber
	 * @param moveInDate
	 * @param leaseEndDate
	 * @param familySize
	 * @param petType
	 * @param carParkNumber
	 */
	public ClientsRecords(String fullName, int aptNumber, String moveInDate, String leaseEndDate, int familySize,
			String petType, int carParkNumber) {

		this.fullName = fullName;
		this.aptNumber = aptNumber;
		this.moveInDate = moveInDate;
		this.leaseEndDate = leaseEndDate;
		this.familySize = familySize;
		this.petType = petType;
		this.carParkNumber = carParkNumber;

	}

	/**
	 * Gets the fullName of resident clients.
	 * 
	 * @return the fullName from the getFullName method
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Sets resident clients fullName.
	 * 
	 * @param fullName the fullName parameter in the setFullName method
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Gets resident clients aptNumber.
	 * 
	 * @return the aptNumber from getAptNumber method
	 */
	public int getAptNumber() {
		return aptNumber;
	}

	/**
	 * Sets client residents aptNumber.
	 * 
	 * @param aptNumber the aptNumber parameter in the aptNumber method
	 */
	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}

	/**
	 * Gets resident clients moveInDate.
	 * 
	 * @return the moveInDate from getMoveInDate method
	 */
	public String getMoveInDate() {
		return moveInDate;
	}

	/**
	 * Sets resident clients moveInDate.
	 * 
	 * @param moveInDate the moveInDate parameter in the setMoveInDate method
	 */
	public void setMoveInDate(String moveInDate) {
		this.moveInDate = moveInDate;
	}

	/**
	 * Gets resident clients leaseEndDate.
	 * 
	 * @return the leaseEndDate from getLeaseEndDate method
	 */
	public String getLeaseEndDate() {
		return leaseEndDate;
	}

	/**
	 * Sets resident clients leaseEndDate.
	 * 
	 * @param leaseEndDate the leaseEndDate in the setLeaseEndDate method
	 */
	public void setLeaseEndDate(String leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
	}

	/**
	 * Gets resident clients familySize.
	 * 
	 * @return the familySize from getFamilySize method
	 */
	public int getFamilySize() {
		return familySize;
	}

	/**
	 * Sets resident clients familySize.
	 * 
	 * @param familySize the familySize parameter in the setFamilySize method
	 */
	public void setFamilySize(int familySize) {
		this.familySize = familySize;
	}

	/**
	 * Gets resident clients petType.
	 * 
	 * @return the petType from getPetType method
	 */
	public String getPetType() {
		return petType;
	}

	/**
	 * Sets resident clients petType.
	 * 
	 * @param petType the petType parameter in the setPetType method
	 */
	public void setPetType(String petType) {
		this.petType = petType;
	}

	/**
	 * Gets resident clients carParkNumber.
	 * 
	 * @return the carParkNumber from getCarParkNumber method
	 */
	public int getCarParkNumber() {
		return carParkNumber;
	}

	/**
	 * Sets the carParkNumber.
	 * 
	 * @param carParkNumber the carParkNumber parameter in the setCarParkNumber
	 */
	public void setCarParkNumber(int carParkNumber) {
		this.carParkNumber = carParkNumber;
	}

	/**
	 * 
	 * @param clients
	 */
	public void getClients(ArrayList<ClientsRecords> clients) {

		clients.add(new ClientsRecords("Jane  Dune", 0, "01/01/2014", "01/01/2026", 1, "one dog", 100));
		clients.add(new ClientsRecords("Mark Kris", 1, "01/07/2014 ", "01/07/2026", 3, "one dog", 101));
		clients.add(new ClientsRecords("John   Dewey", 2, "01/11/2014 ", "01/11/2026 ", 5, "none", 102));
		clients.add(new ClientsRecords("Richard Bronx", 3, "12/01/2015 ", "12/01/2026", 2, "none", 103));
		clients.add(new ClientsRecords("Roseline Dune", 4, "01/01/2016 ", "01/01/2026", 2, "none", 104));
		clients.add(new ClientsRecords("Peter  Pan ", 5, "04/01/2016 ", "04/01/2026", 3, "none", 105));
		clients.add(new ClientsRecords("Brian   Fisher", 6, "06/01/2016 ", "06/01/2026", 3, "one cat", 106));
		clients.add(new ClientsRecords("Joe    Tad ", 7, "08/01/2017 ", "08/01/2026", 1, "one dog", 107));
		clients.add(new ClientsRecords("Monica Jackson", 8, "10/01/2017 ", "10/01/2026", 5, "none", 108));
		clients.add(new ClientsRecords("Donald Moore", 9, "01/01/2018 ", "01/01/2026", 4, "none", 109));
		clients.add(new ClientsRecords("Jullien Wimpeg", 10, "02/01/2018 ", "02/01/2026", 2, "none", 110));
		clients.add(new ClientsRecords("Rose   Miller", 11, "03/01/2019 ", "03/01/2026", 5, "one dog", 111));
		clients.add(new ClientsRecords("Ann    Parker", 12, "04/01/2019 ", "04/01/2026", 3, "one dog", 112));
		clients.add(new ClientsRecords("Morgan Craig", 13, "09/01/2019 ", "09/01/2026", 2, "none", 113));
		clients.add(new ClientsRecords("Chad   Wideel", 14, "01/01/2020", " 01/01/2026", 3, "none", 114));
		clients.add(new ClientsRecords("Dick   Pane", 15, "07/01/2020 ", "07/01/2026", 4, "none", 115));
		clients.add(new ClientsRecords("Mcdee  Fox", 16, "01/01/2021 ", "01/01/2026", 4, "none", 116));
		clients.add(new ClientsRecords("James  Dicey", 17, "05/01/2022 ", "05/01/2026", 2, "none", 117));
		clients.add(new ClientsRecords("Henry  Karter", 18, "01/01/2023 ", "01/01/2026", 4, "none", 118));
		clients.add(new ClientsRecords("Mike   Dude", 19, "08/01/2023 ", "08/01/2026", 1, "one cat", 119));

		int choice = 0;
		int apartmentNumber = 0;

		do {
			MenuServiceImpl recordsMenu = new MenuServiceImpl();

			recordsMenu.showRecordsMenu();

			System.out.println("Enter a number: ");

			try {
				choice = keyboardInput.nextInt();

				switch (choice) {
				case 1:
					// View all apartments residents records
					System.out.println("\nVIEW ALL RESIDENTS RECORDS:\n" + "**************************");

					System.out.println(clients);

					break;

				case 2:
					// View an apartment's resident records

					System.out.println(clients.get(enterApartmentNumber(apartmentNumber)));
					break;

				case 3:
					// Delete a resident'S records

					clients.remove(enterApartmentNumber(apartmentNumber));
					break;

				case 4:
					// Add a new resident
					addNewResident();
					break;

				default:
					System.out.println("Incorrect entry!");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Input mismatch!");
				System.exit(0);
			}

		} while (choice >= 0 && choice <= 4);
		System.out.println("You are exiting ClientsRecordsManager()!");

	}

	public int enterApartmentNumber(int apartmentNumber) {

		System.out.println("Enter an apartment number to view resident's records: ");

		try {
			apartmentNumber = keyboardInput.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid entry!");
			System.exit(0);
		}

		if (apartmentNumber > clients.size()) {
			System.out.println("No such apartment number!");

		}

		return apartmentNumber;
	}

	
	/**
	 * Registers and adds new resident client to ClientsRecords.
	 */
	public void addNewResident() {

		MenuServiceImpl.newResidentMenu();

		System.out.println("Enter the following information\n");

		System.out.println("Enter full name: ");

		try {
			keyboardInput.nextLine();
			this.fullName = keyboardInput.nextLine();
			// this.setFullName(fullName);

			System.out.println("\nEnter apt number: ");
			this.aptNumber = keyboardInput.nextInt();

			System.out.println("\nEnter moveInDate : ");
			this.moveInDate = keyboardInput.next();

			System.out.println("Enter leaseEndDate: ");
			this.leaseEndDate = keyboardInput.next();

			System.out.println("Enter familySize: ");
			this.familySize = keyboardInput.nextInt();

			System.out.println("Enter petType: ");
			this.petType = keyboardInput.next();

			System.out.println("Enter carParkNumber: ");
			this.carParkNumber = keyboardInput.nextInt();
		} catch (Exception e) {
			System.out.println("Input mismatch!");
			System.exit(0);
		}

		System.out.println("Total before you added new resident is: " + clients.size());

		clients.add(
				new ClientsRecords(fullName, aptNumber, moveInDate, leaseEndDate, familySize, petType, carParkNumber));

		System.out.println("\n New total resident is now: " + clients.size());

		for (ClientsRecords client : clients) {
			System.out.println(client);
		}
	}

	
	/**
	 * @return residents records information from toString method
	 */
	public String toString() {

		return ("\nFull Name: " + fullName + "\nApt Number: " + aptNumber + "\nMove-in Date: " + moveInDate
				+ "\nLease-end Date: " + leaseEndDate + "\nFamily Size: " + familySize + "\nPet Type: " + petType
				+ "\nCar Park Slot number: " + carParkNumber + "\n");

	}

}

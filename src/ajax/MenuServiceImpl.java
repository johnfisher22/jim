package ajax;

/**
 * @author Johnfisher Uchem
 * MenuServiceImpl class implements MenuInterface.    
 * Contains different show-menus for this application.  
 * 
 */
public class MenuServiceImpl implements MenuInterface
{

	/**
	 * Shows the main menu for this application 
	 */
	public void showSystemenu() 
	{
		
		System.out.println("*************************************************");
		System.out.println("*  MENU OPTIONS FOR AJAX APARTMENTS INC.  *\n" + "*         SYSTEM'S APP MANAGER             *\n");
		System.out.println("* 1.  CLIENTS RECORDS SERVICES\n" + "* 2.  BILLS AND RENT SERVICES\n"
				+ "* 3.  ENTER APARTMENT BLOCK\n" + "* 4.  EMPLOYEE SERVICES\n" + "* 5.  EMPLOYEES SCHEDULES\n"
				+ "* 6.  CALL AJAX OFFICE \n" + "* 7.  PLAY NUMBER GAME\n"
				+ "* 8.  USE CALCULATOR\n" + "* 9.  TEMPERATURE CONVERTER\n"
				+ "* 10. GET SOFT DRINK\n" + "* 11. EXIT THIS PROGRAM");
		System.out.println("*************************************************");
		
		
	}
	
	/**
	 * Shows the menu for office information.
	 */
	public void showOfficeInfo() 
	{
		System.out.println("AJAX APARTMENTS OFFICE LOCATION INFO: \n" + "3001 Dunge Street, House 34, Bismarck, ND, USA\n"
				+ "Office number : 701 555 4489 \n" + "Office number : 701 555 0009 - help line and maintenance\n"
				+ "Office email : staff@ajax.com\n" + "For Emergency : 911\n");

	}

	/**
	 * Shows the menu for viewing management team.
	 */
	public void viewManagementTeam() 
	{
		// Telephone help lines
		System.out.println("WELCOME TO AJAX APARTMENTS !\n" + "No spacing between phone numbers!\n"
				+ "For emergency call 911\n" + "For help call 701-555-0009 our helpline\n");

		// Management team information
		System.out.println("SOME OF OUR MANAGEMENT TEAM MEMBERS ARE : \n" + "Marketing Manager - Emy Hintz \n"
				+ "Human Resources Manager - Frank Kleen\n" + "Customer Service - Chris Bell\n"
				+ "Maintenance Manager - Eric Madilan\n");
	}
	
	/**
	 * Shows the menu for employees related work information
	 * 
	 */
	public void showStaffMenu() 
	{
		System.out.println("*********************************");
		System.out.println("*     EMPLOYEES APP MANAGER     *");
		System.out.println("* Enter : \n" + "* 1 to get all staff information:\n" + "* 2. to get a staff information:\n"
				+ "* 3 to see hourly per rate:\n" + "* 4 to see number of hours worked:\n" + "* 5 to exit the program:");
		System.out.println("**********************************\n");
	}


	/**
	 * Displays Apartments details
	 */
	public void apartmentDetails() 
	{
		System.out.println("OUR APARTMENTS FACILITIES ARE :\n" + "2 standard bedrooms\n"
				+ "1 sittingroom\n" + "2 kitchens & 2 toilets\n" + "1 balcony \n"
				+ "2 air conditioners & other comfort machines\n");

	}

	/**
	 * Shows residents menu
	 */
	public void showResidentsMenu() 
	{
		System.out.println("1. to see all residents\n" + "2. to find a resident\n" + "3. to delete a resident\n"
				+ "4. to add new resident\n" + "5. Exit\n");

	}

	
	/**
	 * Shows the menu for  viewing clients accounts information
	 */
	public void showAccountsMenu() 
	{

		System.out.println("1. Check balance\n" + "2. Deposit\n" + "3. Withdraw\n" + "4 Type exit to quit");

	}

	
	/*
	 * Shows calculator menu information
	 */
	public  void calculatorMenu() 
	{

		System.out.println("Select operation\n" + "1. Addition \n" + "2. Subtraction \n" + "3. Multiplication \n"
				+ "4. Division \n" + "5. Exponent \n" + "6. Squaroot \n" + "7. Type exit to quit to main menu ");
	}



	/**
	 * Shows residents' records menu
	 */
	public void showRecordsMenu() 
	{
		String residentsRecordMenu = "*************************************\n" +
		 "ENTER 1 TO VIEW ALL RESIDENTS RECORDS: \n" +  "ENTER 2 TO VIEW A RESIDENT'S RECORDS: \n" + "ENTER 3 TO MOVE OR DELETE A RESIDENT RECORDS: \n"
		+ "ENTER 4 TO ADD NEW RESIDENT: \n" + "ENTER 5 OR GREATER NUMBER TO EXIT\n" +  "**************************************\n" ;
		
		System.out.println(residentsRecordMenu);
	}
	
	/**
	 * Shows menu for client's payment operations
	 */
	public static void showMenu() {
	String	menu = "0 to make payment\n" + "1 to delete payment records" + "\n2 to view all payment" +  
			 	"\n3 Save payment to file" + "\n4 View payment in file" +  "\n5 to exit the payBill method\n";
	
	System.out.println(menu);
	}
	
	/**
	 * Shows access operations into apartment blocks
	 */
	public static void showGateAccessMenu() {
	
		String gateAccessMenu = ("\nEnter 1 to enter apartment block\n" + "2 Add a new gate pass\n" + "3 Remove a gate pass\n" +
			"4 To view all gate pass, insert your 10 digits staff's pass code \n" + "Enter 5 to exit\n" + "Staff access pass is: staffaj719");

		System.out.println(gateAccessMenu);
	}
	
	/**
	 * Shows employees menu options
	 */
	public static void showEmployeeMenu() {
		String employeeMenu = "Enter 1 for HR Manager:\n" + "2 for Maintenance Manager:\n" + "3 for HR staff:\n"
				+ "4 for Maintenance:\n" + "5 for other staff:\n" + "Enter 0 to exit:\n";
		
		System.out.println(employeeMenu);
	}

	/**
	 * Shows menu options for new resident's registration
	 */
	public static void newResidentMenu() {
		String newResidentInfo = "Please enter your first name, last name, sex, age,\n"
				+ "marital status(single or married), family size, phone number, move - in date\n";
           System.out.println(newResidentInfo);
	}
	
	/**
	 * Shows office menu
	 */
	public static void officeMenu() {
		String officeMenu = "AJAX HELP LINE ! \n" + "Please enter  a phone number\n" + "No spacing between phone numbers!\n"
				+ "Type exit to quit";
		System.out.println(officeMenu);
	}
	
	public static void tempConversionMenu() {
		
		String tempMenu = "1 to convert to Fahrenheit\n" + "2. to conver to Celsius\n" + "3. to exit\n";
		System.out.println(tempMenu);
	}

	public void showRecetptionistSchedule() {
		String scheduleMenu  = "This position works day shift. \n" + "Schedule is Monday to Friday, 7:00 AM - 3:30 PM\n";
		System.out.println(scheduleMenu);
	}
	
	public void showLeasingSchedule() {
	String leasingSchedule = "LEASING works day shift, Monday to Saturday, 7:00 AM - 3:30 PM";
	System.out.println(leasingSchedule);
	}
	
	public void showMaintenanceSchedule() {
		String maintenanceSchedule = "MAINTENANCE works day shift, Monday to Friday, 7:00 AM - 3:30 PM\n" + "On-call weekends";
		System.out.println(maintenanceSchedule);
		}
	
	public void showPositionsMenu()
	{
		String positions = "POSITIONS INCLUDE: \n" + "IT, HR, MARKETING, RECEPTIONIST, LEASING, MAINTENNCE ";
		
		System.out.println(positions);
	}
	
}

package ajax;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


/**
 * @author Johnfisher Uchem
 * EmployeeRecords class controls and manages employees operations and information. 
 */

public class EmployeeRecords
{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	private EmployeeRecords anyEmployee;
	
	protected HashMap<Integer, String> employee = new HashMap<Integer, String>();

	 Scanner keyboardInput = new Scanner(System.in);

	/**
	 * Non-parametric constructor for employees in AJAX APARTMENTS INC.
	 */
	 
	public EmployeeRecords() 
	{
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position = "";
	}

	/**
	 * Parametric constructor for employees in AJAX APARTMENTS INC.
	 * @param name
	 * @param idNumber
	 * @param department
	 * @param position
	 */
	public EmployeeRecords(String name, int idNumber, String department, String position) 
	{
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;

	}
	
	
	/**
	 * Gets employee's name
	 * @return the name from getName method
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * Sets employee's name
	 * @param name the name parameter in the setName method
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * Gets employee's Id
	 * @return the idNumber from getIdNumber method
	 */
	public int getIdNumber() 
	{
		return idNumber;
	}

	/**
	 * Sets the employee's Id 
	 * @param idNumber the idNumber parameter in the setIdNumber method
	 */
	public void setIdNumber(int idNumber) 
	{
		this.idNumber = idNumber;
	}

	/**
	 * Gets the employee's department
	 * @return the department from the getDepartment method
	 */
	public String getDepartment() 
	{
		return department;
	}

	/**
	 * Sets the employee's department
	 * @param department the department parameter in the setDepartment method
	 */
	public void setDepartment(String department) 
	{
		this.department = department;
	}

	/**
	 * Gets the employee's position
	 * @return the position from the getPosition method
	 */
	public String getPosition() 
	{
		return position;
	}

	/**
	 * Sets the employee's position
	 * @param position the position parameter in the setPosition method
	 */
	public void setPosition(String position) 
	{
		this.position = position;
	}


	/**
	 * Gets anyEmpolyee class object
	 * @return the anyEmployee class object from getAnyEmployee method
	 */
	public EmployeeRecords getAnyEmployee() 
	{
		return anyEmployee;
	}

	/**
	 * Sets anyEmployee class object
	 * @param anyEmployee the anyEmployee parameter from the setAnyEmployee method
	 */
	public void setAnyEmployee(EmployeeRecords anyEmployee) 
	{
		this.anyEmployee = anyEmployee;
	}

	/**
	 * Gets the employee's detailed information 
	 * @return the employee from the getEmployee method
	 */
	public HashMap<Integer, String> getEmployee() 
	{
				// Employees information records objects
		
				// Staff First Name -          Full lName - ID Number Dept. - Position
				EmployeeRecords John = new EmployeeRecords("John Wayne", 102000, "IT ", "Administrator");
				EmployeeRecords Kelly = new EmployeeRecords("Kelly Bosch", 102001, "IT ", "Webmaster");
				EmployeeRecords Kelvin = new EmployeeRecords("Kelvin Moore ", 102002, "IT ", "PC Technician");
				EmployeeRecords Frank = new EmployeeRecords("Frank Kleen ", 102003, "HR ", "Manager");
				EmployeeRecords Grace = new EmployeeRecords("Grace Jones ", 102004, "HR ", "Co-ordinator");
				EmployeeRecords Hilda = new EmployeeRecords("Hilda Russel ", 102005, "HR ", "Co-ordinator");
				EmployeeRecords Alice = new EmployeeRecords("Alice Fox ", 102006, "HR ", "Payroll");
				EmployeeRecords Chris = new EmployeeRecords("Chris Bell ", 102007, "Front Desk ", "Receptionis");
				EmployeeRecords Chad = new EmployeeRecords("Chad Lee ", 102008, "Leasing ", "Leasing Specialist");
				EmployeeRecords Ryan = new EmployeeRecords("Ryan Dove ", 102009, "Leasing ", "Leasing Specialist");
				EmployeeRecords Alicia = new EmployeeRecords("Alicia Doon ", 102010, "Marketing ", "Marketing Officer");
				EmployeeRecords Emy = new EmployeeRecords("Emy Hintz ", 102011, "Marketing ", "Marketing Officer");
				EmployeeRecords Eric = new EmployeeRecords("Eric Madilan ", 102012, "Maintenance ", "Maintenance Manager");
				EmployeeRecords Jake = new EmployeeRecords("Jake Banden ", 102013, "Maintenance ", "Maintenance Tech.");
				EmployeeRecords Kazman = new EmployeeRecords("Kazman Kizon ", 102014, "Maintenance ", "Maintenance Tech.");
				EmployeeRecords Judy = new EmployeeRecords("Judy Braswic ", 102015, "HR ", "Intern");
				
				
				//Identify staff by last 3 digits of SSN
				
				employee.put(883,John.toString());
				employee.put(555,Kelly.toString());
				employee.put(567,Kelvin.toString());
				employee.put(457,Frank.toString());
				employee.put(135,Grace.toString());
				employee.put(980,Hilda.toString());
				employee.put(905,Alice.toString());
				employee.put(736,Chris.toString());
				employee.put(102,Chad.toString());
				employee.put(114,Ryan.toString());
				employee.put(774,Alicia.toString());
				employee.put(806,Emy.toString());
				employee.put(922,Eric.toString());
				employee.put(611,Jake.toString());
				employee.put(541,Kazman.toString());
				employee.put(117,Judy.toString());

		return employee;
	}

	/**
	 * Sets employee detailed information
	 * @param employee the employee parameter in the setEmployee method
	 */
	public void setEmployee(HashMap<Integer, String> employee) 
	{
		this.employee = employee;
	}
	
	/**
	 * Checks if there is an employee.
	 * @param value
	 * @return true is there is an employee
	 * @see java.util.HashMap#containsValue(java.lang.Object)
	 */
	public boolean containsValue(Object value) 
	{
		return employee.containsValue(value);
	}

	/**
	 * Sets key for employee. 
	 * @return the keySet for employee
	 * @see java.util.HashMap#keySet()
	 */
	public Set<Integer> keySet() 
	{
		return employee.keySet();
	}

	/**
	 * Void getHourlyPayRate method. 
	 * 
	 * Gets hourly pay rate for employees
	 */
	public  void getHourlyPayRate() 
	{
		
		double hourlyPayRate = 0;
		int staffPay = 1;

		do {
			 MenuServiceImpl.showEmployeeMenu();

			staffPay = keyboardInput.nextInt();

			if (staffPay == 1) 
			{
				hourlyPayRate = 24;

				System.out.printf("HR Manager pay is $%.2f per hour%n",hourlyPayRate);
			}

			else if (staffPay == 2) 
			{
				hourlyPayRate = 26;

				System.out.printf("Maintenance Manager pay is $%.2f per hour%n",hourlyPayRate);
			}

			else if (staffPay == 3) 
			{
				hourlyPayRate = 19;

				System.out.printf("HR Staff  pay is $%.2f per hour%n",hourlyPayRate);
			}

			else if (staffPay == 4) 
			{
				hourlyPayRate = 21;

				System.out.printf("Maintenance Technicians pay is $%.2f per hour%n",hourlyPayRate);
			}

			else if (staffPay == 5) 
			{
				hourlyPayRate = 18;

				System.out.printf("Other staff pay is $%.2f per hour%n",hourlyPayRate);
			}

			else 
			{
				System.out.println("Invalid entry");
				
			}

		} while (staffPay != 0);

		System.out.println("You exited getHourlyPayRate()!\n");
	}

	

	 //Prints number of hours worked  by employees
	  
	public void printNumbOfHoursWorked() 
	{
		double daysWorked;

		System.out.println("Please enter number of days you worked?:\n");

		daysWorked = keyboardInput.nextDouble();

		double numbOfHoursWorked = daysWorked * 8;

		System.out.println("Number of hours worked is :" + numbOfHoursWorked + " hours\n");
	}
	

	//Manages staff work-related information
	public void employeeManager()
	{
	int ssn = 0;

	int choice = 0;
	
	MenuServiceImpl menus = new MenuServiceImpl();

	do {	
				menus.showStaffMenu();

				System.out.println("Enter a number: ");
				try {
				choice = keyboardInput.nextInt();

				switch (choice) 
				{
				case 1:
					// Gets all staff information
					
					System.out.println(getEmployee());
					break;

				case 2:
						// Gets a staff information
						try 
						{
			     		System.out.println("Enter last 3 SSN:");

						ssn = keyboardInput.nextInt();

						if (getEmployee().containsKey(ssn)) 	
						{
							System.out.println(ssn + " is the " + getEmployee().get(ssn));
							
							}
					else 
						{
							System.out.println("Invalid entry!\n");						
							break;
							}
						}
						catch (Exception e) 
							{
							System.out.println("Invalid entry!\n");
							System.exit(0);
							}
						System.out.println("Staff information obtained successfully!\n");
							break;

					case 3:
							// Gets staff hourly per rate
							getHourlyPayRate();
							break;

				   case 4:
					   		// Gets staff number of hours worked
					   		printNumbOfHoursWorked();
					   		break;

				   default:
					   		System.out.println("Invalid entry or data type mismatch!");
					   		break;
							}

							} 
					catch (Exception e) 
							{
							// TODO Auto-generated catch block

							System.out.println("Invalid entry or data type mismatch!");
							System.exit(0);
							}						
		
			} 	while (choice > 0 && choice < 5);

			System.out.println("You have exited the whole program!");
	
	}
	
	/**
	 * 
	 * @return toString method's values
	 */
	public String toString()
	{
		
		return (" SSN" + "\nEmployee: Name: " + name + "\nID Number: " +  idNumber + "\nDepartment: " + department + "\nPosition : " + position + "\n\n");
	}

}

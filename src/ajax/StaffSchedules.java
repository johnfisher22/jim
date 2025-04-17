/**
 * 
 */
package ajax;
/**
 * StaffSchedule extends Employee and manages employees shift and schedules. 
 * 
 * @author Johnfisher Uchem
 * @version 1.0.2  / 12/24/2024 
 * @since Ajax Clients Employees Manager 1.0 
 *
 */
public class StaffSchedules extends EmployeeRecords 
{
	MenuServiceImpl menu = new MenuServiceImpl();
	
	private String shift ;
	private String staffSchedule;
	
	/**
	 * Non-parametric constructor for StaffSchedule
	 */
	public StaffSchedules()
	{
		
		this.shift = "";
		this.staffSchedule = "";
	}

	/**
	 * Parametric constructor for StaffSchdule 
	 * @param shift
	 * @param staffSchedule
	 */
	public StaffSchedules(String name, int idNumber, String department, String position ,String shift, String staffSchedule)
{
		super( name, idNumber, department, position);
		
		this.shift = shift;
		this.staffSchedule = staffSchedule;
	}

	/**
	 * Gets employee's shift
	 * @return the shift from getShif method
	 */
	public String getShift() 
	{	
		//shift();
		
		return shift;
	}

	/**
	 * Sets employee's shift
	 * @param shift the shift parameter in the setShif method
	 */
	public void setShift(String shift ) 
	{
		
		this.shift = shift;
	}

	/**
	 * Gets employee's schedule
	 * @return the staffSchedule from getSchedule method
	 */
	public String getStaffSchedule()
	{
		checkStaffSchedule();

		return staffSchedule;
		
	}

	/**
	 * Sets employee's schedule
	 * @param staffSchedule the staffSchedule parameter in the setStaffSchedule method
	 */
	public void setStaffSchedule(String staffSchedule) 
	{
		this.staffSchedule = staffSchedule;
	}


	
	/**
	 * Checks employee's schedule. 
	 * checkStaffSchedule void method 
	 */
	public void checkStaffSchedule()
	{
		String staffPosition;
		
		menu.showPositionsMenu();
		
		try {
			System.out.println("\nEnter staff position to view schedule: ");
			
			staffPosition = keyboardInput.next().toUpperCase();
			
			switch(staffPosition)
			{
			case "IT" :
				
			case "HR" :
			
			case "MARKETING" :
				
			case "RECEPTIONIST" :
				menu.showRecetptionistSchedule();
				
				System.out.println("Select a position to view pay rate \n");
			  
			    super.getHourlyPayRate();
		
				break;
				
			case "LEASING" :
				menu.showLeasingSchedule();
				
				System.out.println("Select a position to view pay rate \n");
				  
			    super.getHourlyPayRate();
			    
				break;
				
			case "MAINTENANCE" :
				menu.showMaintenanceSchedule();
				
				System.out.println("Select a position to view pay rate \n");
				  
			    super.getHourlyPayRate();
			    
				break;
				
			default :
				
				System.out.println("Invalid entry!");
				break;
			
			}
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.getMessage();
		}
	
	}
	
	
	/**
	 * Gets employee's shift type.  
	 * Void shift method
	 */
	public void shift()
	{
		menu.showPositionsMenu();
		
		System.out.println("\nEnter a position");
		
		String position = keyboardInput.next().toUpperCase();

		if ((position.equals("IT")) || (position.equals("HR")) || (position.equals("MARKETING")) ||  (position.equals("LEASING"))) 
		{
				System.out.println("Day shift");
		} 
		
	else if (position.equals("MAINTENANCE")) 
		{
		System.out.println("Night shift");
		} 
	else 
		{
				
		System.out.println("This position is not in the list!");

		}
	}
	
	
	/**
	 * Views employee's shift and schedule. 
	 * Void viewStaffSchedule methods 
	 */
	public  void viewStaffSchedule()
	{
		try {
			System.out.println("ENTER 1 TO CHECK STAFF SCHEDULE\n" + "ENTER 2 TO VIEW STAFF SHIFTS");
			
			int scheduleShift = keyboardInput.nextInt();
			
			if(scheduleShift == 1)
			{
				getStaffSchedule();
			}
			else if (scheduleShift == 2)
			{
				getShift();
			}
			else
			{
				System.out.println("Wrong entry!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Check your entry!");
		}
	}


/**
 * toString for StaffSchedules class. 
 * @return toString values from toString method
 */
@Override
public String toString() 
{

	return ( "Shift: " + shift + "\nSchedule" + staffSchedule + super.toString());
}

}



























package ajax;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Johnfisher Uchem
 * This class manages public services and company's information. 
 */

public class PublicServices 
{
	
    Scanner keyboardInput = new Scanner(System.in);
    
    MenuServiceImpl option = new MenuServiceImpl();
	
	/**
	 * This function calls Ajax apartments help line and 911
	 */
	public void callAjaxPhone() 
	{
		String yourPhoneNumber = " ";
		
		do {
			option.showOfficeInfo();
			
			MenuServiceImpl.officeMenu();
			
			try {
				yourPhoneNumber = keyboardInput.nextLine().toLowerCase();

				switch (yourPhoneNumber) 
				{
				case "911":
					System.out.println("Help is here !\n");

					// Method call for incident report function
					System.out.println("911 team on the way to your location");
					break;

				case "7015550009":
					// Method call for incident report function
					option.showOfficeInfo(); 
					break;

				case "7015554489":
					System.out.println("Thank you for contacting our office");
					option.viewManagementTeam();
					
					System.out.println("\nView apartment details below\n");
					
					option.viewManagementTeam();
					break;

				default:
					System.out.println("Enter \"exit\" to quit!\n");
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Input mismatch!");
				System.exit(0);
			}

		}
		while (!yourPhoneNumber.contains("exit"));
		System.out.println("You have exited callAjaxPhone()!");
	}
	
	
	
	/**
	 * This function plays even and odd number game in the Ajax apartments reception common room. 
	 */
	public void playEvenOddNumberGame() 
	{
		int number;

		try {
			System.out.println("Enter a number");
			number = keyboardInput.nextInt();

			if (number <= 0) {
				System.out.println("Invlid number");
			}

			else if (number % 2 == 0) {
				System.out.println("This is even number");

			}

			else {
				System.out.println("This is odd number ");

			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Input mismatch!");
			System.exit(0);
		}

	}
	

	/**
	 * Public calculator in the Ajax apartments reception common room. 
	 */
	public void useCalculator() 
	{
      
		int num1 = 0;
		int num2 = 0;
		String selection = null;

		do {
			System.out.println("Enter first number");
			try {
				try {
					num1 = keyboardInput.nextInt();
					
					System.out.println("Enter second number");
					
					num2 = keyboardInput.nextInt();
				
					option.calculatorMenu();
				
					selection = keyboardInput.next();
				} catch (Exception e) 
				{
					// TODO Auto-generated catch block
					System.out.println("Input mismatch!");
					System.exit(0);
				}
			
				switch (selection) {

				case "1":
					System.out.println("Anser is :  " + (num1 + num2));
					break;

				case "2":
					System.out.println("Anser is :  " + (num1 - num2));
					break;

				case "3":
					System.out.println("Anser is System.out.println(:  " + (num1 * num2));
					break;

				case "4":
					System.out.println("Anser is :  " + (num1 / num2));
					break;

				case "5":
					System.out.println("Anser is :  " + (Math.pow(num1, num2)));
					break;

				case "6":
					System.out.println(
							" Squar root of num1 = " + Math.sqrt(num1) + " : Squar root of num2 = " + Math.sqrt(num2));
					break;

				default:
					System.out.println("Please select a valid operation ");
					break;

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid entry");
				
				break;
			}
				

		} while (!selection.equalsIgnoreCase("exit"));
		System.out.println("You have exited useCalculator()!\n");

	}

	
	/**
	 * Temperature converter in the Ajax apartments reception common room.
	 */
	public void tempConverter() 
	{
		float frht;
		float celsius;
		int option;

		do {
			System.out.println("\nWhich temperature conversion do you want ?");
		
			MenuServiceImpl.tempConversionMenu();

			try {
				option = keyboardInput.nextInt();

				if (option == 1) 
				{
					System.out.println("Enter Celsius temperature");
					celsius = keyboardInput.nextFloat();
					frht = (celsius * 9 / 5) + 32;
					System.out.println("Fahrenheit temperature is : " + frht);
				} 
				else if (option == 2) 
				{
					System.out.println("Enter Fahrenheit temperature");
					frht = keyboardInput.nextFloat();
					celsius = (frht - 32) * 5 / 9;
					System.out.println("Celsius temperature is : " + celsius);
				}

				else 
				{
					System.out.println("Wrong input ...");

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid entry");
				break;
			}
		} while (option != 3);
		System.out.println("You have exited tempConversion()!\n");

	}

	
	/**
	 * Function for purchasing items from vending machine in the reception common room. 
	 */
	public void getSoftDrink() 
	{
		System.out.println(
				"Enter 1. for Diet Coke\n" + "2. for Regular  Code\n" + "3. for Bottled Water\n" + "0. to exit");

		int pick;
		try {
			pick = keyboardInput.nextInt();

			int itemQuantity = 0;
			float payment = 0;
			float balance = 0;

			do {

				if (pick == 1 || pick == 2) 
				{
						System.out.println("How many cokes do you want ? $2 each ");
						itemQuantity = keyboardInput.nextInt();

						System.out.println("Total price = $ " + itemQuantity * 2);
						System.out.println("Please enter payment amount");
						payment = keyboardInput.nextFloat();

						if (payment < itemQuantity * 2) {
						System.out.println("Please complete your payment");
						break;
						} 
						else if (payment > itemQuantity) 
						{

						balance = payment - itemQuantity * 2;
						System.out.println("Here is your balance : $" + balance + " Thank you!");
						break;
						}

						else 
						{
						System.out.println("Payment received! Thank you!");
						break;
						}
						}

			else if (pick == 3) 
					{
					System.out.println("How many bottled water do you want ? $2.50 each");

					itemQuantity = keyboardInput.nextInt();

					System.out.println("Total price = $ " + itemQuantity * 2.5);

					System.out.println("Please enter payment amount");
					payment = keyboardInput.nextFloat();

					if (payment < itemQuantity * 2.5) 
						{
						System.out.println("Please complete your payment");
						}

					else if (payment > itemQuantity) 
						{

						balance = (float) (payment - itemQuantity * 2.5);
						System.out.println("Here is your balance : $" + balance + " Thank you!");
						break;
						} 
					else 
						{
						System.out.println("Payment received! Thank you!");
						break;
						}
						}

			else 
				{
				   System.out.println("Invalid entry");
				break;

				}

			} while (pick != 0);
			System.out.println("You have exited purchaseStoreItem() !\n");
			System.exit(pick);
			} 
		catch (Exception e) 
			{
			// TODO Auto-generated catch block
			System.out.println("Invalid entry");
		}

	}
 
}

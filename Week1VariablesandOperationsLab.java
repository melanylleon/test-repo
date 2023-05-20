//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week1;

public class Week1VariablesandOperationsLab {
	
	

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight	
			int planeSeatsLeft = 13;

		
		// 2. Create a variable to hold the cost of groceries at checkout
			double groceriesTotalCost = 235.56;
		
		// 3. Create a variable to hold a person's middle initial
			char middleInitial = 'N';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
			boolean hotOutside = true; 
		
		// 5. Create a variable to hold a customer's first name
			String firstName = "Ashley";
		
		// 6. Create a variable to hold a street address
			String streetAddress = "23 Bear St, Denver, Colorodo 80014";

		// 7. Print all variables to the console
					System.out.println("The number of seats available on the plane are " + planeSeatsLeft);
					System.out.println(groceriesTotalCost + " is the total cost of groceries.");
					System.out.println("The customers middle name is " + middleInitial);
					System.out.println("It is " + hotOutside + " that it's hot outside.");
					System.out.println("The customer's first name is " + firstName);
					System.out.println("The customer's street address is " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
					planeSeatsLeft = planeSeatsLeft - 2;
					System.out.println(planeSeatsLeft);
					//Another shorter way to do it is: planeSeatsLeft -= 2;
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
					groceriesTotalCost = groceriesTotalCost + 2.15;
					System.out.println(groceriesTotalCost);
					//Another shorter way to do it is: groceriesTotalCost += 2.15; 
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
					middleInitial = 'T';
					System.out.println(middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
					hotOutside = false;
					//Another way to do this is: hotOutside = !hotOutside;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
					String fullName = firstName + " " + middleInitial + " Johnson";
					System.out.println(fullName);
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

					System.out.println("The customer's name is " + fullName + " and her address is " + streetAddress + ".");
		
	}
	}
		

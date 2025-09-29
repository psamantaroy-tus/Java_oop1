package com.tus.shoppingcart25;

//package com.tus.shoppingcart;
import java.util.Scanner;//scanner

public class ConsoleMain {

	public static void main(String[] args) {
		
		//create scanner object to get user input
		Scanner sc = new Scanner(System.in);
		
		//Customer name entry
		String custName;
		System.out.println("Enter Your Name : ");
		custName = sc.nextLine();
		
		//welcome message 
		System.out.println("******** Welcome to ShoppingCartConsole : " + custName + " ******* ");	
		
		
		
		//print options to select
		System.out.println(">> View Products/Catalog :  1");
		System.out.println(">> Add Items to cart :  2");
		System.out.println(">> Display/View cart items and Itemized total : 3");
		System.out.println(">> Update/Remove Product: 4");
		System.out.println(">> Checkout : 5");	
		System.out.println(">> EXIT the Console/System : 6");	
		
		//Asking for user input to select options
		System.out.println("Which Option you want to select: 1,2,3,4,5,6 ? : ");
		
		//taking and storing input from user
		int option = sc.nextInt();
		
		//String message = STR."you have selected option : \{option}";
		System.out.println("You have selected option : " + option);	
		
		
		//close scanner
		sc.close();
		
		

	}

}

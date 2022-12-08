package address_Book;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.regex.*;

public class AddressBook {
	//Create Address Book; Empty
	private ArrayList<Contact> contactList  = new ArrayList<>();

	public  void addEntry(Scanner input) {
//		
		// all variables for loops
				boolean keepGoing = true;
				while (keepGoing) {
					String firstName = "";
					String lastName = "";
					String phoneNumber = "";
					String email = "";
						
		
		//printBars(2);
		

		// while loops with if/else
		
		//firstName
		boolean waitingForFirstName = true;
		while (waitingForFirstName) {
			System.out.println("Enter first name");
			String fName = input.nextLine();
			if (fName.length() > 2) {
				fName = firstName;
				waitingForFirstName = false;
			} else {
				System.out.println("Please enter a response that is three letters or longer.");
			}
		}
		//lastName
		boolean waitingForLastName = true;
		while (waitingForLastName) {
			System.out.println("Enter last name");
			String lName = input.nextLine();
			if (lName.length() > 2) {
				lName = lastName;
				waitingForLastName = false;
			} else {
				System.out.println("Please enter a response that is three letters or longer.");
			}
		}
		
		//phone number
		boolean waitingForPhoneNumber = true;
		while (waitingForPhoneNumber) {
			System.out.println("Enter phone number");
			String digits = input.nextLine();
			if (digits.length() > 6) {
				digits = phoneNumber;
				waitingForPhoneNumber = false;
			} else {
				System.out.println("Please enter a response that is three letters or longer.");
			}}}
		}
		
		
		
		//email
		//validate
		boolean isValid(String email) { 
				String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$";
				return email.matches(regex);
			}
		
		boolean waitingForEmail = true; {
		while (waitingForEmail) {
			
			System.out.println("Enter email address");
			Scanner input;
			String correo = input.nextLine();
			if (isValid (email) == true) {
				correo = email;
				waitingForEmail = false;
			} else {
				System.out.println("Please enter a valid email address.");
		}}
	

		//email
		
	
//	//	System.out.println("Enter first name");
//	//	String firstName = input.next();
//////		Contact.setFirstName(input.next());
//	//	System.out.println("Enter last name");
//	//	String lastName = input.next();
//	//	System.out.println("Enter phone number");
//		String phoneNumber = input.next();
//		System.out.println("Enter email address.");
//		String email = input.next();
//		Contact k = new Contact(firstName, lastName,phoneNumber, email);
//		contactList.add(k);
//		System.out.println(k);
////		System.out.print(contactList);
//		Menu.printBars(1);
////		pauseForInput();
////		goToMenu();
//	}


	
//	System.out.print(contactList);



public  void removeEntry(Scanner input) {
	printAddressBook();
		
	System.out.println("Index values start at 0. \n which one do you want to delete?");
	contactList.remove(input.nextInt());	
	printAddressBook();
	System.out.println("Your welcome!");
//		goToMenu();
}

public  void searchEntry(Scanner input) {
	Menu.printBars(2);
	System.out.println("Honestly, search is over-rated...");
	Menu.printBars(3);
//	pauseForInput();
//	goToMenu();
}
public  void printAddressBook() {
	ListIterator<Contact> litr = contactList.listIterator();
	while (litr.hasNext()) {
		System.out.print(litr.next());
}
//	goToMenu();
}


public  void deleteBook(Scanner input) {

	System.out.println("Delete all our hard work?\n 'y': I'm a jerk! \n 'n': whoops didn't meant to.");
	String userInput = input.next();
	
	if (userInput.equalsIgnoreCase("y")) {
			System.out.println("Seriously!.....");
			contactList.clear();
		} 
	else if(userInput.equalsIgnoreCase("n")) {
			System.out.println("Thank you!");
	}
//	goToMenu();
}

public void quit() {
	System.exit(0);
}	
//private static void pauseForInput(Scanner input) {
//    System.out.println("<Press Enter to continue...>");
//    input.nextLine();
//}




}}
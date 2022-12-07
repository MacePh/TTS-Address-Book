package address_Book;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {
	//Create Address Book; Empty
	public static ArrayList<Contact> contactList  = new ArrayList<>();

	public static void addEntry(Scanner input) {
//		printBars(2);
		System.out.println("Enter first name");
		String firstName = input.next();
//		Contact.setFirstName(input.next());
		System.out.println("Enter last name");
		String lastName = input.next();
		System.out.println("Enter phone number");
		String phoneNumber = input.next();
		System.out.println("Enter email address.");
		String email = input.next();
		Contact k = new Contact(firstName, lastName,phoneNumber, email);
		contactList.add(k);
		System.out.println(k);
//		System.out.print(contactList);
		printBars(1);
//		pauseForInput();
//		goToMenu();
	}

	
//	System.out.print(contactList);



public static void removeEntry(Scanner input) {
	printAddressBook();
		
	System.out.println("Index values start at 0. \n which one do you want to delete?");
	contactList.remove(input.nextInt());	
	printAddressBook();
	System.out.println("Your welcome!");
//		goToMenu();
}

public static void searchEntry(Scanner input) {
	printBars(2);
	System.out.println("Honestly, search is over-rated...");
	printBars(3);
//	pauseForInput();
//	goToMenu();
}
public static void printAddressBook() {
	ListIterator<Contact> litr = contactList.listIterator();
	while (litr.hasNext()) {
		System.out.print(litr.next());
}
//	goToMenu();
}


public static void deleteBook(Scanner input) {

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

public static void quit() {
	System.exit(0);
}

	    

//private static void pauseForInput(Scanner input) {
//    System.out.println("<Press Enter to continue...>");
//    input.nextLine();
//}



}


}

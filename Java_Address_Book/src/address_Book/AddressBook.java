package address_Book;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {
	//Create Address Book; Empty
	private ArrayList<Contact> contactList  = new ArrayList<>();

	public  void addEntry(Scanner input) {
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
		Menu.printBars(1);

	}

	
//	System.out.print(contactList);



public  void removeEntry(Scanner input) {
	printAddressBook();
		
	System.out.println("Index values start at 0. \n which one do you want to delete?");
	contactList.remove(input.nextInt());	
	printAddressBook();
	System.out.println("Your welcome!");

}

public  void searchEntry(Scanner input) {
	printSearchOptions();
	//Search for a colleague information
	public int searchEntry(String s) {
		for(int i= 0;i< contactList.size(); i++) {
			
			if(contactList.get(i).getFirstName().equals(s) || contactList.get(i).getLastName().equals(s) || contactList.get(i).getPhoneNumber().equals(s)|| contactList.get(i).getEmail().equals(s)) { 
				System.out.println("found" + s);
				return i;
			}
	
}}

public  void printAddressBook() {
	ListIterator<Contact> litr = contactList.listIterator();
	while (litr.hasNext()) {
		System.out.print(litr.next());
}

}


public  void deleteBook(Scanner input) {

	System.out.println("Delete ENTIRE address book? ?\n 'y': Delete it. \n 'n': No, keep it.");
	String userInput = input.next();
	
	if (userInput.equalsIgnoreCase("y")) {
			System.out.println("Address Book Deleted.");
			contactList.clear();
		} 
	else if(userInput.equalsIgnoreCase("n")) {
			System.out.println("Thank you!");
	}

}

	public static void printSearchOptions() {
			System.out.println("Choose");
			System.out.println("===========================================");
			System.out.println("1) First name");
			System.out.println("2) Last name");
			System.out.println("3) Phone Number");
			System.out.println("4) Email address");
			System.out.println("===========================================");
			System.out.println("Enter 1-4 so select the search field.");	
		}
	    

//private static void pauseForInput(Scanner input) {
//    System.out.println("<Press Enter to continue...>");
//    input.nextLine();
//}



}



package address_Book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {

	private static final ArrayList<Contact> contactList2 = null;
	// Create Address Book; Empty
	private ArrayList<Contact> contactList = new ArrayList<>();

	public void addEntry(Scanner input) {
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
		Contact k = new Contact(firstName, lastName, phoneNumber, email);
		contactList.add(k);
		saveContact(contactList);
		System.out.println(k);
//		System.out.print(contactList);
		Menu.printBars(1);
//		pauseForInput();
//		goToMenu();

	}

//	System.out.print(contactList);

	public void removeEntry(Scanner input) {
		printAddressBook();

		System.out.println("Index values start at 0. \n which one do you want to delete?");
		contactList.remove(input.nextInt());
		saveContact(contactList);
		printAddressBook();
		System.out.println("Your welcome!");
//		goToMenu();
	}

	public void searchEntry(Scanner input) {
		Menu.printBars(2);
		System.out.println("Honestly, search is over-rated...");
		Menu.printBars(3);
//	pauseForInput();
//	goToMenu();
	}

	public void printAddressBook() {
		ListIterator<Contact> litr = contactList.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next());
		}
		ArrayList<Contact> list = readList(contactList);
		System.out.println(list);
	}

	public void deleteBook(Scanner input) {

		System.out.println("Delete all our hard work?\n 'y': I'm a jerk! \n 'n': whoops didn't meant to.");
		String userInput = input.next();

		if (userInput.equalsIgnoreCase("y")) {
			System.out.println("Seriously!.....");
			contactList.clear();
		} else if (userInput.equalsIgnoreCase("n")) {
			System.out.println("Thank you!");
		}
//	goToMenu();
	}

	public void quit() {
		System.exit(0);
	}

	public void saveContact(ArrayList<Contact> contactList) {
		try {
			FileOutputStream writeData = new FileOutputStream("contactList.ser");
			ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

			writeStream.writeObject(contactList);
			writeStream.flush();
			writeStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Contact> readList(ArrayList<Contact> contactList) {
		try {
			FileInputStream readData = new FileInputStream("contactList.ser");

			ObjectInputStream readStream = new ObjectInputStream(readData);

			ArrayList<Contact> contactList2 = (ArrayList<Contact>) readStream.readObject();
			readStream.close();

			System.out.println(contactList2.toString());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return contactList2;
	}

//private static void pauseForInput(Scanner input) {
//    System.out.println("<Press Enter to continue...>");
//    input.nextLine();
//}

}

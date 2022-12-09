package address_Book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {
	public static ArrayList<Contact> readList() {
		try {
			FileInputStream readData = new FileInputStream("contactList.ser");

			ObjectInputStream readStream = new ObjectInputStream(readData);

			ArrayList<Contact> contactList = (ArrayList<Contact>) readStream.readObject();
			readStream.close();

		return contactList;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return contactList;
	
	}

	//Create Address Book; Empty
//	private static final ArrayList<Contact> contactList2 = readList() ;
	private static  ArrayList<Contact> contactList  = readList();
	Iterator<Contact> i = contactList.iterator();
	Scanner s = new Scanner(System.in);

	public void addEntry() {
//		printBars(2);
		System.out.println("Enter first name:");
		String firstName = s.next();
//		Contact.setFirstName(input.next());
		System.out.print("Enter last name :");
		String lastName = s.next();
		System.out.print("Enter phone number :");
		String phoneNumber = s.next();
		System.out.print("Enter email address :");
		String email = s.next();
		contactList.add(new Contact(firstName, lastName,phoneNumber, email));
		saveContact(contactList);
		
		System.out.println("=+=+=+=+=+=+=+=+ADDED=+=+=+=+=+=+=+=+=+=");
	}

	public  void removeEntry() {
	boolean found=false;
	printAddressBook();
	String fDel= s.next();
	Iterator<Contact> i = contactList.iterator();
	while(i.hasNext()) {
		Contact c = (Contact) i.next();
		if(c.getFirstName().equals(fDel)) {
			i.remove();
			saveContact(contactList);
			found = true;
		}
	}
	if(!found) {
		System.out.println("=+=+=+=+=+=+=+=+NOT=FOUND=+=+=+=+=+=+=+=+=+=\n");

	}
	else {
		
	}
	System.out.println("=+=+=+=+=+=+=+=+=+DELETED=+=+=+=+=+=+=+=\n");
	}
		
	public  void searchEntry() {
	boolean found=false;
	System.out.println("Enter First Name to search");
	String fSearch= s.nextLine();
	i = contactList.iterator();
	while(i.hasNext()) {
		Contact c = i.next();
		if(c.getFirstName().equals(fSearch)) {
			System.out.println("Found: "+c);
			found = true;
		}
	}if(!found) {
		System.out.println("=+=+=+=+=+=+=CONTACT=NOT=FOUND=+=+=+=+=+=+=\n");
	}
	System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
	}
	
	public  void printAddressBook() {
	System.out.println("Address book contains :");
	ListIterator<Contact> litr = contactList.listIterator();
	while (litr.hasNext()) {
		System.out.print(litr.next());
}
	System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
}
 
	public  void deleteBook() {

	System.out.println("Delete ENTIRE address book? ?\n 'y': Delete it. \n 'n': No, keep it.");
	String userInput = s.nextLine();
	
	if (userInput.equalsIgnoreCase("y")) {
		System.out.println("=+=+=+=+=+=+ADDRESS+BOOK=DELETED=+=+=+=+=+=\n");
			contactList.clear();
		} 
	else if(userInput.equalsIgnoreCase("n")) {
		System.out.println("=+=+=+=+=+=+NOT+DELETED+=+=+=+=+=+=+=+=+=+=\n");
	}
	System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");

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

}


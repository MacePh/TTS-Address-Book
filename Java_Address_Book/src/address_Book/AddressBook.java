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
<<<<<<< HEAD

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
=======
			ObjectInputStream readStream = new ObjectInputStream(readData);
			ArrayList<Contact> contactList = (ArrayList<Contact>) readStream.readObject();
			readStream.close();
			return contactList;
		} catch (IOException | ClassNotFoundException | NullPointerException e) {
			e.printStackTrace();
		}
		return contactList;
>>>>>>> refs/remotes/origin/phi
	}

<<<<<<< HEAD
	public  void removeEntry() {
	boolean found=false;
	printAddressBook();
	String fDel= s.next();
=======
	private static ArrayList<Contact> contactList = readList();
>>>>>>> refs/remotes/origin/phi
	Iterator<Contact> i = contactList.iterator();
<<<<<<< HEAD
	while(i.hasNext()) {
		Contact c = (Contact) i.next();
		if(c.getFirstName().equals(fDel)) {
			i.remove();
			saveContact(contactList);
			found = true;
=======
	static Scanner s = new Scanner(System.in);

	static public void addEntry() {
		boolean keepGoing = true;
		while (keepGoing == true) {
			String firstName = "";
			String lastName = "";
			String phoneNumber = "";
			String email = "";
			boolean waitingForFirstName = true;
			while (waitingForFirstName) {
				System.out.println("Enter first name");
				String fName = s.nextLine();
				if (fName.length() > 2) {
					firstName = fName;
					waitingForFirstName = false;
				} else {
					System.out.println("Please enter a response that is three letters or longer.");
				}
			}
			boolean waitingForLastName = true;
			while (waitingForLastName) {
				System.out.println("Enter last name");
				String lName = s.nextLine();
				if (lName.length() > 2) {
					lastName = lName;
					waitingForLastName = false;
				} else {
					System.out.println("Please enter a response that is three letters or longer.");
				}
			}

			boolean waitingForPhoneNumber = true;
			while (waitingForPhoneNumber) {
				System.out.println("Enter phone number");
				String digits = s.nextLine();
				if (digits.length() > 6) {
					phoneNumber = digits;
					waitingForPhoneNumber = false;
				} else {
					System.out.println("Please enter a response that is 6 numbers or longer.");
				}
			}

			boolean waitingForEmail = true;
			while (waitingForEmail) {
				System.out.println("Enter email address");
				String correo = s.nextLine();
				if (isValid(correo) == true) {
					email = correo;
					waitingForEmail = false;
					keepGoing = false;
				} else {
					System.out.println("Please enter a valid email address.");
				}

			}

			contactList.add(new Contact(firstName, lastName, phoneNumber, email));
			saveContact(contactList);

			System.out.println("=+=+=+=+=+=+=+=+ADDED=+=+=+=+=+=+=+=+=+=");

>>>>>>> refs/remotes/origin/phi
		}
	}

	public void removeEntry() {
		boolean found = false;
		printAddressBook();
		String fDel = s.next();
		Iterator<Contact> i = contactList.iterator();
		while (i.hasNext()) {
			Contact c = (Contact) i.next();
			if (c.getFirstName().equals(fDel)) {
				i.remove();
				saveContact(contactList);
				found = true;
			}
		}
<<<<<<< HEAD
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
=======
		if (!found) {
			System.out.println("=+=+=+=+=+=+=+=+NOT=FOUND=+=+=+=+=+=+=+=+=+=\n");
>>>>>>> refs/remotes/origin/phi

<<<<<<< HEAD
	System.out.println("Delete ENTIRE address book? ?\n 'y': Delete it. \n 'n': No, keep it.");
	String userInput = s.nextLine();
	
	if (userInput.equalsIgnoreCase("y")) {
		System.out.println("=+=+=+=+=+=+ADDRESS+BOOK=DELETED=+=+=+=+=+=\n");
=======
		} else {

		}
		System.out.println("=+=+=+=+=+=+=+=+=+DELETED=+=+=+=+=+=+=+=\n");

	}

	public void searchEntry() {
		boolean found = false;
		System.out.println("Enter First Name to search");
		String fSearch = s.nextLine();
		i = contactList.iterator();
		while (i.hasNext()) {
			Contact c = i.next();
			if (c.getFirstName().equals(fSearch)) {
				System.out.println("Found: " + c);
				found = true;
			}
		}
		if (!found) {
			System.out.println("=+=+=+=+=+=+=CONTACT=NOT=FOUND=+=+=+=+=+=+=\n");
		}
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
	}

	public void printAddressBook() {
		System.out.println("Address book contains :");
		contactList = readList();
		ListIterator<Contact> litr = contactList.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next());
		}
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
	}

	public void deleteBook() {

		System.out.println("Delete ENTIRE address book? ?\n 'y': Delete it. \n 'n': No, keep it.");
		String userInput = s.nextLine();

		if (userInput.equalsIgnoreCase("y")) {
			System.out.println("=+=+=+=+=+=+ADDRESS+BOOK=DELETED=+=+=+=+=+=\n");
>>>>>>> refs/remotes/origin/phi
			contactList.clear();
<<<<<<< HEAD
		} 
	else if(userInput.equalsIgnoreCase("n")) {
		System.out.println("=+=+=+=+=+=+NOT+DELETED+=+=+=+=+=+=+=+=+=+=\n");
	}
	System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
=======
			saveContact(contactList);
		} else if (userInput.equalsIgnoreCase("n")) {
			System.out.println("=+=+=+=+=+=+NOT+DELETED+=+=+=+=+=+=+=+=+=+=\n");
		}
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
	}
>>>>>>> refs/remotes/origin/phi

<<<<<<< HEAD
}


	public void saveContact(ArrayList<Contact> contactList) {
=======
	public static void saveContact(ArrayList<Contact> contactList) {
>>>>>>> refs/remotes/origin/phi
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

<<<<<<< HEAD
}

=======
	static boolean isValid(String email) {
		String regex = ".+\\@.+\\..+";
		return email.matches(regex);
	}

}
>>>>>>> refs/remotes/origin/phi

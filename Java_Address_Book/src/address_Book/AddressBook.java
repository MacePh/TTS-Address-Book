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
import java.util.regex.*;

public class AddressBook {
	//Create Address Book; Empty
	private static final ArrayList<Contact> contactList2 = null;
		private ArrayList<Contact> contactList  = new ArrayList<>();
		Iterator<Contact> i = contactList.iterator();
	Scanner s = new Scanner(System.in);
	
	
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
			}
			}
		boolean waitingForEmail = true; 
		while (waitingForEmail) {
			
			System.out.println("Enter email address");
			
			String correo = input.nextLine();
			
			if (isValid (email) == true) {
				correo = email;
				waitingForEmail = false;
			} else {
				System.out.println("Please enter a valid email address.");
		}
			}
				}
		}
		
		
		
		//email
		//validate
		public boolean isValid(String email) { 
				String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$";
				return email.matches(regex);
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

	ListIterator<Contact> litr = contactList.listIterator();
	while (litr.hasNext()) {
		System.out.print(litr.next());
}
	ArrayList<Contact> list = readList(contactList);
	System.out.println(list);
	System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
}
	

 
	public  void deleteBook() {
		System.out.println("Delete ENTIRE address book? ?\n 'y': Delete it. \n 'n': No, keep it.");
		String userInput = s.nextLine();
			if (userInput.equalsIgnoreCase("y")) {
			System.out.println("=+=+=+=+=+=+ADDRESS+BOOK=DELETED=+=+=+=+=+=\n");
				contactList.clear();
			} 	else if(userInput.equalsIgnoreCase("n")) {
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


	public ArrayList<Contact> readList(ArrayList<Contact> contactList) {
		try {
			FileInputStream readData = new FileInputStream("contactList.ser");

			ObjectInputStream readStream = new ObjectInputStream(readData);

			ArrayList<Contact> contactList2 = (ArrayList<Contact>) readStream.readObject();
			readStream.close();

			System.out.println(contactList.toString());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return contactList2;
	}
} 

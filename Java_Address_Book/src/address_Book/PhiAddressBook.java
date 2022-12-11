package address_Book;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.regex.*;

public class PhiAddressBook {

	public void addEntry(Scanner input) {
		boolean keepGoing = true;
		while (keepGoing) {
			String firstName = "";
			String lastName = "";
			String phoneNumber = "";
			String email = "";

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

			boolean waitingForPhoneNumber = true;
			while (waitingForPhoneNumber) {
				System.out.println("Enter phone number");
				String digits = input.nextLine();
				if (digits.length() > 6) {
					digits = phoneNumber;
					waitingForPhoneNumber = false;
				} else {
					System.out.println("Please enter a response that is 6 numbers or longer.");
				}
			}

			boolean waitingForEmail = true;
			while (waitingForEmail) {
				System.out.println("Enter email address");
				String correo = input.nextLine();
				if (isValid(correo) == true) {

					waitingForEmail = false;
				} else {
					System.out.println("Please enter a valid email address.");
				}
			}
		}
	}

	boolean isValid(String email) {
		String regex = ".+\\@.+\\..+";
		return email.matches(regex);
	}

	}



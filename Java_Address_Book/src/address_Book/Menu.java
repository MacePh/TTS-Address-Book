	package address_Book;
	import java.util.ArrayList;
	import java.util.ListIterator;
	import java.util.Scanner;

	public class Menu {

		public static ArrayList<Contact> contactList = new ArrayList<>();
		
		public static void main(String[] args) {
			System.out.println("What action would you like to perform?");
			println();
			System.out.println("1) Add an entry");
			println();
			System.out.println("2) Remove an entry");
			println();
			System.out.println("3) Search for a specific entry");
			println();
			System.out.println("4) Print Address Book");
			println();
			System.out.println("5) Delete Book");
			println();
			System.out.println("6) Quit");
			println();
			System.out.println("Please enter a number 1-6 to make your selection.");
			
			Int userChoice = input.next();
			
			
			//passing variable to the switch
			int userChose = input.next();
			
			
			switch (userChose)
			{
			//comparing value of variable against each case
			case 0:
				//execute "1) Add an entry");
				break;
			case 1:
				// execute "2) Remove an entry");
				break;
			case 2: 
				//"3) Search for a specific entry");
				break;
			case 3:
				//"4) Print Address Book");
				break;
			case 4:
				//"5) Delete Book");
				break;
			case 5: 
				//"6) Quit"););
				break;
			default:
		          System.out.println("Invalid Input!");
			
			}
			/*Starting the Program 
			Upon starting the program, it should as the user what action they want to perform. 
			1) Add an entry 
			2) Remove an entry 
			3) Search for a specific entry 
			4) Print Address Book 
			5) Delete Book 
			6) Quit 
			Please choose what you'd like to do with the database: 
			The user must enter a number 1-6. If the user enters invalid input, print an error message and show the main menu again to take in a new input.*/ 

		}
		//Asks user for Contact details
//		
		public int k = contactList.size() + 1;
		
		
		}
		public addEntry() {
			Contact k = new Contact(Contact.getFName(), "Ngo", "(333)333-3333", "aaaaaaaaaa@aaaaa.aaa");
			this.contactList.add(k);
}
		public removeEntry() {
			
		}
		public searchEntry() {
			
		}
		public printAddressBook() {
			ListIterator<Contact> litr = contactList.listIterator();
			while (litr.hasNext()) {
				System.out.println(litr.next());
		}
		public deleteBook() {
			
		}
		public quit() {
			quit())
		}
	}

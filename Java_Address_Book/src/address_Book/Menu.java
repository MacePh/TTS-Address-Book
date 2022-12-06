	package address_Book;
	import java.util.ArrayList;
	import java.util.ListIterator;
	import java.util.Scanner;

	public class Menu {
//Create Address Book; Empty
		
		public static ArrayList<Contact> contactList  = new ArrayList<>();

		
		public static void main(String[] args) {
			goToMenu();
		}
			
			
			public static void goToMenu() {
			try(Scanner input = new Scanner(System.in)){  // Create a Scanner object

			System.out.println("What action would you like to perform?");
			System.out.println("");
			System.out.println("1) Add an entry");
			System.out.println("");
			System.out.println("2) Remove an entry");
			System.out.println("");
			System.out.println("3) Search for a specific entry");
			System.out.println("");
			System.out.println("4) Print Address Book");
			System.out.println("");
			System.out.println("5) Delete Book");
			System.out.println("");
			System.out.println("6) Quit");
			System.out.println("");
			System.out.println("Please enter a number 1-6 to make your selection.");		
			int userChoice = input.nextInt();	
		//passing variable to the switch
//			
			switch (userChoice)
			{
//			//comparing value of variable against each case
			case 1:
				//execute "1)
				addEntry();
				break;
			case 2:
//				// execute "2) Remove an entry");
				removeEntry();
				break;
			case 3: 
				//"3) Search for a specific entry");
				searchEntry();
				break;
			case 4:
				//"4) Print Address Book");
				printAddressBook();
				break;
			case 5:
				//"5) Delete Book");
				deleteBook();
				break;
			case 6: 
				//quit
				quit();
				break;
			default:
		          System.out.println("Invalid Input!");
		          }
			}
			
		}
	
		
			
//			/*Starting the Program 
//			Upon starting the program, it should as the user what action they want to perform. 
//			1) Add an entry 
//			2) Remove an entry 
//			3) Search for a specific entry 
//			4) Print Address Book 
//			5) Delete Book 
//			6) Quit 
//			Please choose what you'd like to do with the database: 
//			The user must enter a number 1-6. If the user enters invalid input, print an error message and show the main menu again to take in a new input.*/ 
//
//		}
//		//Asks user for Contact details

			
		public static void addEntry() {
			try (Scanner input = new Scanner(System.in)) {
				printBars(2);
				System.out.println("Enter first name");
				String firstName = input.next();
//				Contact.setFirstName(input.next());
				System.out.println("Enter last name");
				String lastName = input.next();
				System.out.println("Enter phone number");
				String phoneNumber = input.next();
				System.out.println("Enter email address.");
				String email = input.next();
				
				 Contact k = new Contact(firstName, lastName,phoneNumber, email);
				contactList.add(k);
			}
			goToMenu();
//			System.out.print(contactList);
		}

		public static void removeEntry() {
			printAddressBook();
				try (Scanner input = new Scanner(System.in)) {
					System.out.println("Index values start at 0. \n which one do you want to delete?");
					contactList.remove(input.nextInt());	
				}
				printAddressBook();
				System.out.println("Your welcome!");
				goToMenu();
		}

		public static void searchEntry() {
			System.out.println("Honestly, search is over-rated...");
			goToMenu();
		}
		public static void printAddressBook() {
			ListIterator<Contact> litr = contactList.listIterator();
			while (litr.hasNext()) {
				System.out.print(litr.next());
		}
			goToMenu();
		}
		public static void deleteBook() {
			try (Scanner input = new Scanner(System.in)) {
			System.out.println("Delete all our hard work?\n 'y': I'm a jerk! \n 'n': whoops didn't meant to.");
			String userInput = input.next();
			
			if (userInput.equalsIgnoreCase("y")) {
					System.out.println("Seriously!.....");
					contactList.clear();
				} 
			else if(userInput.equalsIgnoreCase("n")) {
					System.out.println("Thank you!");
				}
		}
			goToMenu();
		}
		
		public static void quit() {
			System.exit(0);
		}
		
			    
	    private static void printBars(int numBars){
	        for (int i = 0; i < numBars ; i++) {
	            printBar();
	        }
	    }

	    private static void printBar() {
	        System.out.println("===========================================");
	    }
}
	

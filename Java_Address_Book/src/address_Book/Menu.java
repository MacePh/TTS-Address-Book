	package address_Book;
	import java.util.ArrayList;
	import java.util.ListIterator;
	import java.util.Scanner;

	public class Menu {
//Create Address Book; Empty
		
		public static ArrayList<Contact> contactList  = new ArrayList<>();
		
		public static void main(String[] args) {
			addEntry();
		
		
//			Scanner input = new Scanner(System.in);  // Create a Scanner object
}
//			System.out.println("What action would you like to perform?");
//			System.out.println("");
//			System.out.println("1) Add an entry");
//			System.out.println("");
//			System.out.println("2) Remove an entry");
//			System.out.println("");
//			System.out.println("3) Search for a specific entry");
//			System.out.println("");
//			System.out.println("4) Print Address Book");
//			System.out.println("");
//			System.out.println("5) Delete Book");
//			System.out.println("");
//			System.out.println("6) Quit");
//			System.out.println("");
//			System.out.println("Please enter a number 1-6 to make your selection.");
//			
//			int userChoice = input.nextInt();
//			
//			//passing variable to the switch
//			
//			switch (userChoice)
//			{
//			//comparing value of variable against each case
//			case 1:
//				//execute "1) Add an entry");
//				break;
//			case 2:
//				// execute "2) Remove an entry");
//				break;
//			case 3: 
//				//"3) Search for a specific entry");
//				break;
//			case 4:
//				//"4) Print Address Book");
//				break;
//			case 5:
//				//"5) Delete Book");
//				break;
//			case 6: 
//				//quit
//				break;
//			default:
//		          System.out.println("Invalid Input!");
//			}
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
////		
		
//		public static void addEntry() {
////			printBar(numBars:1);
//			try (Scanner input = new Scanner(System.in)) {
//			Contact contact = new Contact(null, null, null, null);
//			System.out.println("Adding Contact to Address Book");
//			
//			System.out.println("Enter first name");
//			contact.setFName(input.next());
//			
//			System.out.println("Enter last name");
//			contact.setLName(input.next());
//			
//			System.out.println("Enter phone number");
//			contact.setPhoneN(input.next());
//			
//			System.out.println("Enter email address.");
//			contact.setEmail(input.next());
//			
//			//add to contactList
//			contactList.add(contact);
//		}
//			System.out.print(contactList);
//		}
		
//		
			
		public static void addEntry() {
			try (Scanner input = new Scanner(System.in)) {
				
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
			System.out.print(contactList);
		}
//	}
////		public Contact(String firstN, String lastN, String number, String email) {
////			this.fName = firstN;
////			this.lName = lastN;
////			this.phoneN = number;
////			this.email = email;
//		public removeEntry() {
//			public void deleteEntry() {
//				try (Scanner input = new Scanner(System.in)) {
//					System.out.println("Enter first name you want to delete");
//					String delN = input.next();
//					if(delN ==null)return;
//					for(int i=0, i < contactList.size(), i++)
//						if (contactList[i] != null && delN.equals(contactList[i].getName())) {
//				            /* null out the deleted entry */
//				            entry[i] = null;
//					 Contact k = new Contact(firstN, lastN,phoneN, email);
//					contactList.add(k);
//				}
	
	
	
	
	
	
	
    /* get the input */
//		    SName = JOptionPane.showInputDialog("Enter Name to delete: ");
//		    /* if no input, nothing to delete */
//		    if(SName == null) return;
//		    /* find the name */
//		    for (int i = 0; i < counter; i++) {
//		        /* make sure we have an entry*/
//		                                /* we know SName is not null */
//		        if (entry[i] != null && SName.equals(entry[i].getName())) {
//		            /* null out the deleted entry */
//		            entry[i] = null;
//            // break; /* If you know you have unique names, you can leave the for loop now */
//        } /* end if */
//    } /* end for i*/
//}
//		}
//		public void searchEntry() {
//			
//		}
//		public void printAddressBook() {
//			ListIterator<Contact> litr = contactList.listIterator();
//			while (litr.hasNext()) {
//				System.out.println(litr.next());
//		}
//		public void deleteBook() {
//			
//		}
//		public void quit() {
//			
//		}
				private static void printBars(int numBars){
			        for (int i = 0; i < numBars ; i++) {
			            printBar();
			        }
			    }
				 private static void printBar() {
				        System.out.println("===========================================");
				    }
			}
//	}

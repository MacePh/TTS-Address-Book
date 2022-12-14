	package address_Book;

	import java.util.Scanner;

	public class Menu {

		

		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);  // Create a Scanner object
			AddressBook addressbook = new AddressBook();
			
//			While Loops Keeps "Main menu" active until user chooses to exit
			Boolean continueBool = true;
			while(continueBool) {
				
			//prompt message(input)
				printMainMenuOptions();
			String userChoice = input.next();	
		//passing variable to the switch
		
			
			switch (userChoice)
			{
//			//comparing value of variable against each case
			case "1":
				//execute "1)
				AddressBook.addEntry();
				break;
			case "2":
				// execute "2) Remove an entry");
				addressbook.removeEntry();
				break;
			case "3": 
				//"3) Search for a specific entry");
				addressbook.searchEntry();
				break;
			case "4":
				//"4) Print Address Book");
				addressbook.printAddressBook();
				break;
			case "5":
				//"5) Delete Book");
				addressbook.deleteBook();
				break;
			case "6": 
				//quit
			
				System.out.println("Goodbye");
				continueBool = false; 
				break;
				
			default:
		          System.out.println("Invalid Input!");
		          }
			
			}
			System.exit(0);
			}
		
//		Esthetics
		public static void printMainMenuOptions() {
			System.out.println("##  What action would you like to perform?  ##");
			System.out.println("--------------------------------------------");
			System.out.println("1) Add an entry");
			System.out.println("2) Remove an entry");
			System.out.println("3) Search for a specific entry");
			System.out.println("4) Print Address Book");
			System.out.println("5) Delete Book");
			System.out.println("6) Quit");
			System.out.println("--------------------------------------------");
			System.out.println("Please enter a number 1-6 to make your selection.");	
			}
	
	}
			
			
		
		
			


			
		
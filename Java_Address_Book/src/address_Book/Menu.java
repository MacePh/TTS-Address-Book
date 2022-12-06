	package address_Book;
	import java.util.Scanner;

	public class Menu {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);  // Create a Scanner object

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
			
			switch (userChoice)
			{
			//comparing value of variable against each case
			case 1:
				//execute "1) Add an entry");
				break;
			case 2:
				// execute "2) Remove an entry");
				break;
			case 3: 
				//"3) Search for a specific entry");
				break;
			case 4:
				//"4) Print Address Book");
				break;
			case 5:
				//"5) Delete Book");
				break;
			case 6: 
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

}

package address_Book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

//Phi
public class Contact {

	private String fName;
	private String lName;
	private String phoneN;
	private String email;

	public Contact(String firstN, String lastN, String number, String email) {
		this.fName = firstN;
		this.lName = lastN;
		this.phoneN = number;
		this.email = email;
	}

	public Contact(String firstN, String lastN, String email) {
		this.fName = firstN;
		this.lName = lastN;
		this.email = email;
	}

	public Contact(String number, String email) {
		this.phoneN = number;
		this.email = email;
	}

	public Contact(String email) {
		this.email = email;
	}

	public String getFName() {
		return this.fName;
	}

	public String getLName() {
		return this.lName;
	}

	public String getPhoneN() {
		return this.phoneN;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.fName = email;
	}

	public void setFName(String firstN) {
		this.fName = firstN;
	}

	public void setLName(String lastN) {
		this.lName = lastN;
	}

	public void setPhoneN(String number) {
		this.phoneN = number;
	}

	@Override
	public String toString() {
		String str = "\n\n" + getFName() + " " + getLName() + "\n" + getPhoneN() + "\n" + getEmail() + "\n\n";
		return str;
	}
	
	
	   public static void addContact(String[] newContact) throws Exception {
		      FileWriter writer = new FileWriter("contactList.txt");
		      String arr[] = newContact;
		      int len = arr.length;
		      for (int i = 0; i < len; i++) {
		         writer.write(arr[i] + "-");
		      }
		      writer.close();
		   }




	      public static void listContacts(String a[]) throws Exception {
	         Scanner sc = new Scanner(new BufferedReader(new FileReader("contactList.txt")));
	         int rows = 3;
	         int columns = 4;
	         int [][] myArray = new int[rows][columns];
	         while(sc.hasNextLine()) {
	            for (int i=0; i<myArray.length; i++) {
	               String[] line = sc.nextLine().trim().split(" ");
	               for (int j=0; j<line.length; j++) {
	                  myArray[i][j] = Integer.parseInt(line[j]);
	               }
	            }
	         }
	         System.out.println(Arrays.deepToString(myArray));
	      }
	   

}

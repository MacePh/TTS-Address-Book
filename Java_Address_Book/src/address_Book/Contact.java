package address_Book;

public class Contact {

	private String fName;
	private String lName;
	private int phoneN;
	private String email;
	
	public Contact (String firstN, String lastN, int number, String email) {
		this.fName = firstN;
		this.lName = lastN;
		this.phoneN = number;
		this.email = email;
		
	}

}
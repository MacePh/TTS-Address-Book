package address_Book;




//Phi
public class Contact {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
//Constructors
	public Contact(String firstName, String lastName, String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Contact(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Contact(String phoneNumber, String email) {
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Contact(String email) {
		this.email = email;
	}

	
	//Gets
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	
//Sets
	public void setEmail(String email) {
		this.email = email;
	}

	public void setFName(String firstName) {
		this.firstName = firstName;
	}

	public void setLName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneN(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		String str = "\n\n" + getFirstName() + " " + getLastName() + "\n" + getPhoneNumber() + "\n" + getEmail() + "\n\n";
		return str;
	}

}

package address_Book;

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
	
	

}

package address_Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

//collaboration
public class Test {

	public static void main(String[] args) throws Throwable {

		Contact a = new Contact("Phi", "Ngo", "(333)333-3333", "aaaaaaaaaa@aaaaa.aaa");
		Contact b = new Contact("Mace", "Phillips", "(111)111-1111", "bbbbb@bbbbb.bbb");
		Contact c = new Contact("Claire", "Novak", "(222)222-2222", "ccccccccc@cccccc.ccc");
//		Array[] d = new Array[4];
//		String[] newContact = {"Phi", "Ngo", "(333)333-3333", "aaaaaaaaaa@aaaaa.aaa"};	
//		String[] newContact2 = {"Mace", "Phillips", "(111)111-1111", "bbbbb@bbbbb.bbb"};
//		String[] newContact3 = {"Claire", "Novak", "(222)222-2222", "ccccccccc@cccccc.ccc"};
	ArrayList<Contact> contactList = new ArrayList<>();
		contactList.add(a);
		contactList.add(b);
		contactList.add(c);
//		Contact.addContact(newContact);
//		Contact.addContact(newContact2);
//		Contact.addContact(newContact3);

		ListIterator<Contact> litr = contactList.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());

		}

	}

}
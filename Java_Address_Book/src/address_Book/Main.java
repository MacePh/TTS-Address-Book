package address_Book;

import java.util.ArrayList;
import java.util.ListIterator;

//collaboration
public class Main {

	public static void main(String[] args) {
//Test
		Contact a = new Contact("Phi", "Ngo", "(333)333-3333", "aaaaaaaaaa@aaaaa.aaa");
		Contact b = new Contact("Mace", "Phillips", "(111)111-1111", "bbbbb@bbbbb.bbb");
		Contact c = new Contact("Claire", "Novak", "(222)222-2222", "ccccccccc@cccccc.ccc");
		
//
//		ArrayList<Contact> contactList = new ArrayList<>();
		Menu.contactList.add(a);
		Menu.contactList.add(b);
		Menu.contactList.add(c);
		Menu.addEntry();
//		ListIterator<Contact> litr = contactList.listIterator();
//		while (litr.hasNext()) {
//			System.out.println(litr.next());

		}

	}


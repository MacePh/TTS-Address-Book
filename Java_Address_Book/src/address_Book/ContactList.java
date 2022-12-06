package address_Book;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileWriter;

public class ContactList {

	public static void main(String[] args) throws Throwable {
//  test examples--------------------------------------------------------------------------------------------------------------
//		Contact a = new Contact("Phi", "Ngo", "(333)333-3333", "aaaaaaaaaa@aaaaa.aaa");
//		Contact b = new Contact("Mace", "Phillips", "(111)111-1111", "bbbbb@bbbbb.bbb");
//		Contact c = new Contact("Claire", "Novak", "(222)222-2222", "ccccccccc@cccccc.ccc");
//		//-------------------------------------------------------------------------------------
		ArrayList<Contact> contactList = new ArrayList<>();
		//-----------------------------------------------------------------------------------
//		contactList.add(a);
//		contactList.add(b);
//		contactList.add(c);
//----------------------------------------------------------------------------------------------------------------------------------
		//write new contacts into list
		FileWriter writer = new FileWriter("contactList.txt");
		for (Contact str : contactList) {
			writer.write(str + System.lineSeparator());
		}
		writer.close();
//-------------------------------------------------------------------------------------------------------------------------
		// Read text file and Creates an ArrayList -------contactList2-----------------------------
		List<String> list = Collections.emptyList();
		list = Files.readAllLines(Paths.get("contactList.txt"), StandardCharsets.UTF_8);
		String[] contactList2 = list.toArray(new String[list.size()]);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(contactList2[i]);
		}

	}
}

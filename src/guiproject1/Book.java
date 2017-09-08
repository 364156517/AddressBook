package guiproject1;

import java.util.ArrayList;

public class Book {

	ArrayList<Contact> addressbook;
	boolean sortname, sortzip;


	public Book(ArrayList<Contact> contacts) {
		this.addressbook = contacts;
	}

	public ArrayList<Contact> newAddressBook() {
		ArrayList<Contact> newaddbk = new ArrayList<Contact>();
		return newaddbk;
	}

	public void deleteAddressBook(ArrayList<Contact> addbk) {
		//addbk.clear();
		//addbk = null;
	}

	public void addContact(Contact contact) {
		addressbook.add(contact);
	}

	public void removeContact(Contact contact) {
		addressbook.remove(contact);
	}

	public void sortByName() {
		sortname = true;
		sortzip = false;
	}

	public void sortByZip() {
		sortname = false;
		sortzip = true;
	}

	public static ArrayList<Contact> mergeSortLastName(ArrayList<Contact> addbk) {
		if (addbk.size() == 1) {
			return new ArrayList<Contact>(addbk);
		}
		ArrayList<Contact> A3 = new ArrayList<Contact>();
		for (Contact contact : addbk) {
			if (contact.getLastName() == null || contact.getLastName().isEmpty()) {
				A3.add(contact);
				addbk.remove(contact);
			}
		}
		int middle = addbk.size() / 2;
		ArrayList<Contact> A1 = new ArrayList<Contact>(addbk.subList(0, middle));
		ArrayList<Contact> A2 = new ArrayList<Contact>(addbk.subList(middle, addbk.size()));
		ArrayList<Contact> merged = new ArrayList<Contact>();
		A1 = mergeSortLastName(A1);
		A2 = mergeSortLastName(A2);
		while (A1.size() > 0 && A2.size() > 0) {
			if (A1.get(0).toString().compareTo(A2.get(0).toString()) < 0) {
				merged.add(A1.remove(0));
			}
			else {
				merged.add(A2.remove(0));
			}
		}
		if (A1.size() > 0) {
			merged.addAll(A1);
		}
		if (A2.size() > 0) {
			merged.addAll(A2);
		}
		return merged;
	}

	public static ArrayList<Contact> mergeSortZipCode(ArrayList<Contact> addbk) {
		if (addbk.size() == 1) {
			return new ArrayList<Contact>(addbk);
		}
		ArrayList<Contact> A3 = new ArrayList<Contact>();
		for (Contact contact : addbk) {
			if (contact.getZipCode() == null || contact.getZipCode().isEmpty()) {
				A3.add(contact);
				addbk.remove(contact);
			}
		}
		int middle = addbk.size() / 2;
		ArrayList<Contact> A1 = new ArrayList<Contact>(addbk.subList(0, middle));
		ArrayList<Contact> A2 = new ArrayList<Contact>(addbk.subList(middle, addbk.size()));
		ArrayList<Contact> merged = new ArrayList<Contact>();
		A1 = mergeSortZipCode(A1);
		A2 = mergeSortZipCode(A2);
		while (A1.size() > 0 && A2.size() > 0) {
			if (A1.get(0).getZipCode().compareTo(A2.get(0).getZipCode()) < 0) {
				merged.add(A1.remove(0));
			}
			else {
				merged.add(A2.remove(0));
			}
		}
		if (A1.size() > 0) {
			merged.addAll(A1);
		}
		if (A2.size() > 0) {
			merged.addAll(A2);
		}
		if (A3.size() > 0) {
			merged.addAll(A3);
		}
		return merged;
	}

	public ArrayList<Contact> mergeBooks(ArrayList<Contact> addbk1, ArrayList<Contact> addbk2) {
		addbk1.addAll(addbk2);
		addbk1.removeAll(addbk2);
		return addbk1;
	}

	public ArrayList<Contact> search(String name) {
		if (addressbook.isEmpty()) {
			return null;
		}
		ArrayList<Contact> searchlist = new ArrayList<Contact>();
		for (Contact contact : addressbook) {
			if (contact.getLastName().matches("(?i)("+name+").*)") || contact.getFirstName().matches("(?i)("+name+").*)")) {
				searchlist.add(contact);
			}
		}
		if (sortname) {
			searchlist = mergeSortLastName(searchlist);
		}
		else if (sortzip) {
			searchlist = mergeSortZipCode(searchlist);
		}
		return searchlist;
	}

}
package main;

import java.util.LinkedList;

public class Library {
	int itemCount = 0;
	int memberCount = 0;
		
	LinkedList<LibraryItem> library = new LinkedList<LibraryItem>();
	LinkedList<Member> members = new LinkedList<Member>();
	
	public void addItem(LibraryItem i) {
		try {
			itemCount++;
			i.setId(itemCount);
			library.add(i);
		}catch(Exception e) {
			System.out.println("Invalid, try again");
		}
		
	}
	
	
	public void removeItem(int id) {
		LinkedList<LibraryItem> rmv = new LinkedList<LibraryItem>();
		library.stream().filter(library -> library.getId() == id)
						.forEach(library -> rmv.add(library));;
		
		library.removeAll(rmv);
		
	}
	
	public void updateItem(int id, LibraryItem i) {
		try {
			library.stream().filter(l -> l.getId() == id)
							.forEach(l -> {l.setAuthor(i.getAuthor()); l.setAuthor(i.getAuthor()); l.setDate(i.getDate()); l.setStock(i.getMaxStock() - (l.getMaxStock() - l.getStock())); l.setMaxStock(i.getMaxStock()); l.setName(i.getName());});	
		}catch(Exception e) {
			System.out.println("Invalid, try again");
		}
		
	}
	
	public void printItems() {
		library.stream().forEach(library -> System.out.println(library + "\n"));
	}
	
	public void checkOutItem(int memberid, int itemId) {
		for (LibraryItem l : library) {
			for(Member m: members) {
				if(memberid == m.getId() && itemId == l.getId() && m.getBookCount() < 3 && l.getStock() > 0) {
					m.setBookCount(m.getBookCount() + 1);
					l.setStock(l.getStock() - 1);
				}
			}
			
		}
	}
	
	public void checkInItem(int memberid, int itemid) {
			
	
		for (LibraryItem l : library) {
			for(Member m: members) {
				if(memberid == m.getId() && itemid == l.getId() && m.getBookCount() > 0 && l.getStock() < l.getMaxStock()) {
					m.setBookCount(m.getBookCount() - 1);
					l.setStock(l.getStock() + 1);
				}
			}
			
		}
	}
	
	public void registerPerson(Member m) {
		try {
			memberCount++;
			m.setId(memberCount);
			members.add(m);
		}catch(Exception e) {
			System.out.println("Invalid, try again");
		}
		
	}
	
	public void removePerson(int id) {
		LinkedList<Member> rmv = new LinkedList<Member>();
		members.stream().filter(members -> members.getId() == id)
						.forEach(members -> rmv.add(members));;
		members.removeAll(rmv);
	}

	public void updatePerson(int id, Member m) {
		try {
			members.stream().filter(n -> n.getId() == id)
							.forEach(n -> {n.setAge(m.getAge()); n.setEmail(m.getEmail()); n.setName(m.getName()); n.setNumber(m.getNumber());});	
		}catch(Exception e) {
			System.out.println("Invalid, try again");
		}
		
	}
	
	public void printMembers() {
		members.stream().forEach(members ->System.out.println(members + "\n"));
		
	}
	
	
	public void populate() {
		
		registerPerson(new Member("Kyle", 20, "01234567890", "kylesEmail"));
		registerPerson(new Member("Harry", 14, "", "harrysEmail"));
		registerPerson(new Member("Zel", 400, "15987536540", ""));
		addItem(new Book("harry potter", "JKRowling", "1/1/1998", 50, 35));
		addItem(new Book("lotr", "tolkien", "1/1/2002", 70, 90));
		addItem(new Map("UK", "Atlas", "1/1/2018", 20, 4));
		addItem(new Map("Scotland", "Google", "1/1/2019", 1, 16));
		addItem(new Magazine("morning", "bbc", "1/1/2016", 10, 25));
		addItem(new Magazine("afternoon", "itv", "1/1/2015", 70, 85));
		
	}
}

package Homeassignment_Week1.day2;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library lh = new Library();
		lh.addBook("Hello");
		lh.issueBook();
	}

}
	
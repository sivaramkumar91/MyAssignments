package week.day3;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println(bookTitle + " Book added successfully");
		return(bookTitle);
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");	
	}
		
	public static void main(String[] arg) {
		Library lib = new Library();
		lib.addBook("Harry Potter");
		lib.issueBook();
	}
}

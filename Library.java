import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<String> books;
    private List<String> issuedBooks;
    public Library() {
        books = new ArrayList<>();
        issuedBooks = new ArrayList<>();
    }
    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }
    public void issueBook(String bookTitle) {
        if (books.contains(bookTitle)) {
            books.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println("Book '" + bookTitle + "' has been issued.");
        } else {
            System.out.println("Book '" + bookTitle + "' is not available in the library.");
        }
    }
    public void returnBook(String bookTitle) {
        if (issuedBooks.contains(bookTitle)) {
            issuedBooks.remove(bookTitle);
            books.add(bookTitle);
            System.out.println("Book '" + bookTitle + "' has been returned.");
        } else {
            System.out.println("Book '" + bookTitle + "' was not issued from this library.");
        }
    }
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
    public void displayIssuedBooks() {
        System.out.println("Issued Books:");
        for (String book : issuedBooks) {
            System.out.println("- " + book);
        }
    }
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");
        System.out.println("Available Books:");
        library.displayAvailableBooks();
        library.issueBook("Book 1");
        System.out.println("\nAvailable Books:");
        library.displayAvailableBooks();
        System.out.println("\nIssued Books:");
        library.displayIssuedBooks();
        library.returnBook("Book 1");
        System.out.println("\nAvailable Books:");
        library.displayAvailableBooks();
        System.out.println("\nIssued Books:");
        library.displayIssuedBooks();
    }
}
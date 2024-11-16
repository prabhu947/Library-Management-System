// Library.java (Singleton + Static Members)
import java.util.ArrayList;

class Library implements LibraryOperations {
    private static Library libraryInstance;
    private ArrayList<Book> books;
    private static int totalBooksIssued = 0;

    private Library() {
        books = new ArrayList<>();
    }

    public static Library getInstance() {
        if (libraryInstance == null) {
            libraryInstance = new Library();
        }
        return libraryInstance;
    }

    public static int getTotalBooksIssued() {
        return totalBooksIssued;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void issueBook(String title) throws Exception {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                totalBooksIssued++;
                System.out.println("Book issued: " + title);
                return;
            }
        }
        throw new BookNotAvailableException("Book '" + title + "' is not available.");
    }

    @Override
    public void returnBook(String title) throws Exception {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Book returned: " + title);
                return;
            }
        }
        throw new BookNotAvailableException("Book '" + title + "' was not issued.");
    }

    public void displayBooks() {
        books.forEach(System.out::println);
    }
}

// Custom Exceptions
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// LibraryOperations.java (Abstraction)
interface LibraryOperations {
    void issueBook(String title) throws Exception;
    void returnBook(String title) throws Exception;
}

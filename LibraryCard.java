// LibraryCard.java (Composition)
import java.util.ArrayList;

class LibraryCard {
    private ArrayList<String> issuedBooks;

    public LibraryCard() {
        this.issuedBooks = new ArrayList<>();
    }

    public void addBook(String title) {
        issuedBooks.add(title);
    }

    public void removeBook(String title) {
        issuedBooks.remove(title);
    }

    public ArrayList<String> getIssuedBooks() {
        return issuedBooks;
    }

    @Override
    public String toString() {
        return "Issued Books: " + issuedBooks;
    }
}

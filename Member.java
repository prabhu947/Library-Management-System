// Member.java
class Member extends Person {
    private LibraryCard libraryCard;

    public Member(String name) {
        super(name);
        this.libraryCard = new LibraryCard();
    }

    public LibraryCard getLibraryCard() { return libraryCard; }

    public void borrowBook(Library library, String title) throws Exception {
        library.issueBook(title);
        libraryCard.addBook(title);
    }

    public void returnBook(Library library, String title) throws Exception {
        library.returnBook(title);
        libraryCard.removeBook(title);
    }

    @Override
    public void displayInfo() {
        System.out.println("Member Name: " + getName());
        System.out.println("Library Card Info: " + libraryCard);
    }
}
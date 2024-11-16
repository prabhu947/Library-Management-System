// Admin.java
class Admin extends Person {
    public Admin(String name) {
        super(name);
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
    }

    public void addBook(Library library, Book[] books) {
        for (Book book : books) {
            library.addBook(book);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin Name: " + getName());
    }
}

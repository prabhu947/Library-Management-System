import java.util.Scanner;

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Singleton Library Instance
        Library library = Library.getInstance();

        // Creating Admin and Member
        Admin admin = new Admin("Alice");
        Member member = new Member("Bob");

        // Welcome Message
        System.out.println("Welcome to the Library Management System");
        System.out.println("========================================");

        boolean exit = false;

        // Menu-Driven Loop
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Admin: Add Books");
            System.out.println("2. View All Books");
            System.out.println("3. Member: Borrow a Book");
            System.out.println("4. Member: Return a Book");
            System.out.println("5. View Member Information");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nAdmin: Add Books");
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    admin.addBook(library, new Book(title, author));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("\nView All Books");
                    library.displayBooks();
                    break;

                case 3:
                    System.out.println("\nMember: Borrow a Book");
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    try {
                        member.borrowBook(library, borrowTitle);
                        System.out.println("Book borrowed successfully!");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("\nMember: Return a Book");
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    try {
                        member.returnBook(library, returnTitle);
                        System.out.println("Book returned successfully!");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("\nView Member Information");
                    member.displayInfo();
                    break;

                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}

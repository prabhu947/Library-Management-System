Here’s a concise description:

Developed an advanced OOP-based Library Management System in Java.
Utilized OOP principles including:
Inheritance for Admin and Member roles.
Encapsulation with private fields and getter/setter methods.
Polymorphism through method overloading and overriding.
Abstraction via an interface for library operations.
Composition for Member-LibraryCard relationships.
Aggregation for representing Library branches.
Implemented:
Singleton Design Pattern for a globally accessible Library instance.
Static Members to track system-wide statistics like issued books.
Exception Handling with custom exceptions for error management.
Designed a menu-driven interactive system for real-time user operations, ensuring robustness, scalability, and usability.
****************************************
Welcome to the Library Management System
========================================

Choose an option:
1. Admin: Add Books
2. View All Books
3. Member: Borrow a Book
4. Member: Return a Book
5. View Member Information
6. Exit
Enter your choice: 1

Admin: Add Books
Enter book title: Java Programming
Enter book author: James Gosling
Book added successfully!

Choose an option:
1. Admin: Add Books
2. View All Books
3. Member: Borrow a Book
4. Member: Return a Book
5. View Member Information
6. Exit
Enter your choice: 2

View All Books
Book{Title='Java Programming', Author='James Gosling', Available=true}

Choose an option:
1. Admin: Add Books
2. View All Books
3. Member: Borrow a Book
4. Member: Return a Book
5. View Member Information
6. Exit
Enter your choice: 3

Member: Borrow a Book
Enter book title to borrow: Java Programming
Book borrowed successfully!

Choose an option:
1. Admin: Add Books
2. View All Books
3. Member: Borrow a Book
4. Member: Return a Book
5. View Member Information
6. Exit
Enter your choice: 2

View All Books
Book{Title='Java Programming', Author='James Gosling', Available=false}

Choose an option:
1. Admin: Add Books
2. View All Books
3. Member: Borrow a Book
4. Member: Return a Book
5. View Member Information
6. Exit
Enter your choice: 5

View Member Information
Member Name: Bob
Library Card Info: Issued Books: [Java Programming]

Choose an option:
1. Admin: Add Books
2. View All Books
3. Member: Borrow a Book
4. Member: Return a Book
5. View Member Information
6. Exit
Enter your choice: 6

Exiting the system. Goodbye!
************************************************************


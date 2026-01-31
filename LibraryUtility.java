import java.util.ArrayList;

public class LibraryUtility {

    // Static method
    public static int countTotalBooks(ArrayList<LibraryBook> books) {
        return books.size();
    }

    // Static method
    public static void displaySystemMessage() {
        System.out.println("Welcome to the Library Management System");
    }

    // Main method
    public static void main(String[] args) {

        displaySystemMessage();

        ArrayList<LibraryBook> books = new ArrayList<>();

        // Using constructor overloading
        LibraryBook book1 = new LibraryBook(
                "Java Basics", "B101", "James Gosling");

        LibraryBook book2 = new LibraryBook(
                "OOP in Java", "B102", "Herbert Schildt",
                "Advanced Java concepts");

        ReferenceBook refBook = new ReferenceBook(
                "Java Reference", "R201", "Oracle");

        books.add(book1);
        books.add(book2);
        books.add(refBook);

        // Method overloading
        book1.issueBook("Ankit");
        book2.issueBook("Rahul", 10);

        // Polymorphism
        refBook.issueBook("Student");

        // Display details
        System.out.println("\n--- Book Details ---");
        for (LibraryBook book : books) {
            book.displayBookDetails();
            System.out.println();
        }

        System.out.println("Total Books: " + countTotalBooks(books));
    }
}
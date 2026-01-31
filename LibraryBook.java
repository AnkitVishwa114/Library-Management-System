public class LibraryBook extends BookItem {

    // Encapsulated fields
    private boolean isAvailable;
    private String issuedTo;
    private String description;

    // Constructor 1 (Mandatory fields)
    public LibraryBook(String title, String bookId, String author) {
        super(title, bookId, author);
        this.description = "No description provided.";
        this.isAvailable = true;
        this.issuedTo = "None";
    }

    // Constructor 2 (All fields)
    public LibraryBook(String title, String bookId, String author, String description) {
        super(title, bookId, author);
        this.description = description;
        this.isAvailable = true;
        this.issuedTo = "None";
    }

    // Getters & Setters
    public boolean isAvailable() {
        return isAvailable;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    // Implement abstract method
    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + bookId);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
        System.out.println("Issued To: " + issuedTo);
        System.out.println("Description: " + description);
    }

    // Issue book (Method Overloading)
    public void issueBook(String studentName) {
        if (isAvailable) {
            isAvailable = false;
            issuedTo = studentName;
            System.out.println("Book issued to " + studentName);
        } else {
            System.out.println("Book already issued.");
        }
    }

    public void issueBook(String studentName, int issueDurationDays) {
        issueBook(studentName);

        if (issueDurationDays > MAX_ISSUE_DAYS) {
            System.out.println("Warning: Issue duration exceeds MAX_ISSUE_DAYS.");
        }
    }

    // Return book
    public void returnBook() {
        isAvailable = true;
        issuedTo = "None";
        System.out.println("Book returned successfully.");
    }
}
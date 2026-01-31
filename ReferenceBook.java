public class ReferenceBook extends LibraryBook {

    public ReferenceBook(String title, String bookId, String author) {
        super(title, bookId, author);
    }

    public ReferenceBook(String title, String bookId, String author, String description) {
        super(title, bookId, author, description);
    }

    // Override issueBook
    @Override
    public void issueBook(String studentName) {
        System.out.println("Reference books cannot be issued, only viewed in the library.");
    }
}
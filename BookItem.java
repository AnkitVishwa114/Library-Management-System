public abstract class BookItem {

    // Protected fields
    protected String title;
    protected String bookId;
    protected String author;

    // Static final constant
    public static final int MAX_ISSUE_DAYS = 7;

    // Constructor
    public BookItem(String title, String bookId, String author) {
        this.title = title;
        this.bookId = bookId;
        this.author = author;
    }

    // Abstract method
    public abstract void displayBookDetails();
}
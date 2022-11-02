import java.util.Objects;
public class Book {
    private final String bookName;
    private final Author author;
    private int pubLishYear;

    public Book(String bookName, Author author, int pubLishYear) {
        this.bookName = bookName;
        this.author = author;
        this.pubLishYear = pubLishYear;
    }
    public String getBookName() { return bookName; }
    public Author getAuthor() { return author; }
    public int getPubLishYear() { return pubLishYear; }
    public void setPubLishYear(int pubLishYear) {
        this.pubLishYear = pubLishYear;
    }

    public void setPublishYaer(int i) {
    }

    public boolean getPublishYear() {
        return false;
    }
}


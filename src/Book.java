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


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pubLishYear == book.pubLishYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }


    public int hashCode() {
        return Objects.hash(bookName, author, pubLishYear);
    }


    public String toString() {
        return "Book{" +
                "bookName='" +bookName + '\'' +
                ", author=" + author.toString() +
                ", publishYear=" + pubLishYear +
                '}';
    }
}
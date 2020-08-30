/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {

    private String bookName;
    private String authorName;
    private String bookISBNNumber;

    public Book() {
        bookName = "The Adventure";
        authorName = "Arthur Conan Doyle";
        bookISBNNumber = "1234567891234";
    }

    public Book(String bookName, String authorName, String bookISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookISBNNumber() {
        return bookISBNNumber;
    }

    public void setBookISBNNumber(String bookISBNNumber) {
        this.bookISBNNumber = bookISBNNumber;
    }

    public String toString() {
        return String.format("Book Name: %s , Author Name: %s, Book ISBN Number: %13s", getBookName(), getAuthorName(), getBookISBNNumber());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getBookISBNNumber(), book.getBookISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getBookISBNNumber());
    }
}

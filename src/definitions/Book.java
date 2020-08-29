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
    private String ISBNBookNumber;

    public Book() {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNBookNumber = ISBNBookNumber;
    }

    public Book(String bookName, String authorName, String ISBNBookNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNBookNumber = ISBNBookNumber;
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

    public String getISBNBookNumber() {
        return ISBNBookNumber;
    }

    public void setISBNBookNumber(String ISBNBookNumber) {
        this.ISBNBookNumber = ISBNBookNumber;
    }

    @Override
    public String toString() {
        return "bookName= '" + bookName + '\'' +
                "authorName= '" + authorName + '\'' +
                "ISBNBookNumber= '" + ISBNBookNumber + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getISBNBookNumber(), book.getISBNBookNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getISBNBookNumber());
    }
}

/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private String[] Book;

    public Library(String[] Book) {
        this.Book = new String[5];
    }

    public Library() {
        this.Book = new String[5];
    }

    public String[] getBook() {
        return Book.clone();
    }

    public void setBook(String[] book) {
        this.Book = book;
    }

    @Override
    public String toString() {
        return Arrays.toString(Book);
    }
}

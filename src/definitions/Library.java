/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private String[] Books;

    public Library(String[] Books) {
        this.Books = new String[5];
    }

    public Library() {
        this.Books = new String[5];
    }

    public String[] getBooks() {
        return Books.clone();
    }

    public void setBooks(String[] books) {
        this.Books = books;
    }

    @Override
    public String toString() {
        return Arrays.toString(Books);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooks(), library.getBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooks());
    }

    /**
     * This method is used to display the books names.
     */
    public void listInventory() {
        for (String Book : this.Books) {
            if (Book != null) {
                System.out.println(Book);
            }
        }
    }
}

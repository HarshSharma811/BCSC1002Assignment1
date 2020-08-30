/*  Created by IntelliJ IDEA.
 *  User: Harsh Sharma
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

    /**
     * This method allowed us to add a new book in the library.
     *
     * @param booksName bookName allow user to enter the book name.
     */
    public void addBooks(String booksName) {
        System.out.println('\'' + booksName + '\'' + "book is added successfully. ");
    }

    /**
     * This method is allows us to issued a book from library.
     *
     * @param bookName bookName allow user to enter the book name that user want to issue.
     */
    public void doCheckOut(String bookName) {
        System.out.println('\'' + bookName + '\'' + "book is issued to you succcessfully. ");
    }
}

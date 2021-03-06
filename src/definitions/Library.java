/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[10];
        for (int i = 0; i < availableBooks.length; i++) {
            availableBooks[i] = new Book();
        }
    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Book[] getAvailableBooks() {
        return availableBooks.clone();
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getAvailableBooks(), library.getAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBooks());
    }

    @Override
    public String toString() {
        return Arrays.toString(availableBooks);
    }

    /**
     * This method add Book to the Library Book Inventory System.
     *
     * @param name The name of the book to be added.
     */

    public void addBook(String name) {
        System.out.println(name + " was added to the Inventory");
    }

    /**
     * This method helps us to issue a Book.
     *
     * @param name The name of the book you want to issue.
     */
    public void doCheckOut(String name) {
        System.out.println("Thank you for issuing" + name + ".");
    }

    /**
     * This method returns a book to the Library Book Inventory System.
     *
     * @param name The name of the book you want to return.
     */
    public void doReturn(String name) {
        System.out.println("Thank ypu for returning" + name + ".");
    }

    /**
     * This method shows a list of all the books in our Inventory.
     */
    public void listInventory() {
        for (Book availableBook : availableBooks) {
            System.out.println(availableBook);
        }
    }


}

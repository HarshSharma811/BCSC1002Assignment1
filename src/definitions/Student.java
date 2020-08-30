/*  Created by IntelliJ IDEA.
 *  User: Harsh sharma
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    Scanner scannerObject = new Scanner(System.in);
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int bookIssuedByStudent;
    private String[] books;

    public Student() {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.bookIssuedByStudent = bookIssuedByStudent;
        this.books = new String[5];
    }

    public Student(String firstName, String middleName, String lastName, long universityRollNumber, int bookIssuedByStudent) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.bookIssuedByStudent = bookIssuedByStudent;
        this.books = new String[5];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setMiddleName() {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getBookIssuedByStudent() {
        return bookIssuedByStudent;
    }

    public void setBookIssuedByStudent(int bookIssuedByStudent) {
        this.bookIssuedByStudent = bookIssuedByStudent;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", bookIssuedByStudent=" + bookIssuedByStudent +
                ", books=" + Arrays.toString(books);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getBookIssuedByStudent() == student.getBookIssuedByStudent() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(getBooks(), student.getBooks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getBookIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getBooks());
        return result;
    }

    /**
     * This method allows student to enter their details.
     */
    public void studentInfo() {
        System.out.println("Enter your first name: ");
        String firstName = scannerObject.next();
        System.out.println("Enter your middle name: ");
        String middleName = scannerObject.next();
        System.out.println("Enter your last name: ");
        String lastName = scannerObject.next();
        System.out.println("Enter your University roll number: ");
        String rollNumber = scannerObject.next();
    }

}

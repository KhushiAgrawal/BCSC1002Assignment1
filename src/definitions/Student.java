/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentName;
    private long universityRollNumber;
    private int numberOfIssuedBooks;
    private Book[] namesOfBooksIssued;

    public Student() {
        studentName = "Sushant Singh Rajput";
        universityRollNumber = 191500396;
        numberOfIssuedBooks = 3;
        this.namesOfBooksIssued = new Book[5];
        for (int i = 0; i < namesOfBooksIssued.length; i++) {
            namesOfBooksIssued[i] = new Book();
        }
    }

    public Student(String studentName, long universityRollNumber, int numberOfIssuedBooks, Book[] namesOfBooksIssued) {
        this.studentName = studentName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfIssuedBooks = numberOfIssuedBooks;
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfIssuedBooks() {
        return numberOfIssuedBooks;
    }

    public void setNumberOfIssuedBooks(int numberOfIssuedBooks) {
        this.numberOfIssuedBooks = numberOfIssuedBooks;
    }

    public Book[] getNamesOfBooksIssued() {
        return namesOfBooksIssued.clone();
    }

    public void setNamesOfBooksIssued(Book[] namesOfBooksIssued) {
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfIssuedBooks() == student.getNumberOfIssuedBooks() &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Arrays.equals(getNamesOfBooksIssued(), student.getNamesOfBooksIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getUniversityRollNumber(), getNumberOfIssuedBooks());
        result = 31 * result + Arrays.hashCode(getNamesOfBooksIssued());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfIssuedBooks=" + numberOfIssuedBooks +
                ", namesOfBooksIssued=" + Arrays.toString(namesOfBooksIssued) +
                '}';
    }
}

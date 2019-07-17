package edu.lion.students;

/**
 * SWENG 568
 * Student.java
 * Purpose: Plain Old Data Object simulating a student record
 *
 * @author Sean Davis
 */
public class Student {
    // Public members
    public int StudentID;
    public String StudentName;
    public String StudentSSN;
    public String StudentEmail;
    public String StudentPhone;


    /**
     * Get a string representation of the student.
     *
     * @return a string with all fields of the student
     */
    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + StudentID +
                ", StudentName='" + StudentName + '\'' +
                ", StudentSSN='" + StudentSSN + '\'' +
                ", StudentEmail='" + StudentEmail + '\'' +
                ", StudentPhone='" + StudentPhone + '\'' +
                '}';
    }
}

package edu.lion.students;

/**
 * SWENG 568
 * RosterStudent.java
 * Purpose: Plain Old Data Object simulating a student record
 *
 * @author Sean Davis
 */
public class CourseStudent {
    // Private members
    private int StudentID;
    private String StudentName;
    private String StudentSSN;
    private String StudentEmail;
    private String StudentPhone;


    // Getters and Setters
    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentSSN() {
        return StudentSSN;
    }

    public void setStudentSSN(String studentSSN) {
        StudentSSN = studentSSN;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getStudentPhone() {
        return StudentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        StudentPhone = studentPhone;
    }
}

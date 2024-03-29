package edu.lion.students;

/**
 * SWENG 568
 * edu.lion.students.RosterStudent.java
 * Purpose: Plain Old Data Object simulating a student record
 *
 * @author Sean Davis
 */
public class RosterStudent {
    //Public fields
    public int stuID;
    public String name;
    public String ssn;
    public String emailAddress;
    public String homePhone;
    public String homeAddr;
    public String localAddr;
    public String emergencyContact;
    public int programID;
    public String paymentID;
    public int academicStatus;

    /**
     * Get a string representation of the student.
     *
     * @return a string with all fields of the student
     */
    @Override
    public String toString() {
        return "RosterStudent{" + '\n' +
                "stuID=" + stuID + '\n' +
                "name='" + name + '\n' +
                "ssn='" + ssn + '\n' +
                "emailAddress='" + emailAddress + '\n' +
                "homePhone='" + homePhone + '\n' +
                "homeAddr='" + homeAddr + '\n' +
                "localAddr='" + localAddr + '\n' +
                "emergencyContact='" + emergencyContact + '\n' +
                "programID=" + programID +  '\n' +
                "paymentID='" + paymentID + '\n' +
                "academicStatus=" + academicStatus + '\n' +
                '}';
    }

    /**
     * Return a converted copy of this data in the Student.java format
     *
     * @return the RosterStudent in the plain Student format
     */
    public Student toStudent(){
        Student converted = new Student();

        // Set the Student object fields to match those of the RosterStudent
        converted.setStudentID(stuID);
        converted.setStudentName(name);
        converted.setStudentSSN(ssn);
        converted.setStudentPhone(homePhone);
        converted.setStudentEmail(emailAddress);

        return converted;
    }
}

package edu.lion.students;

import java.net.URL;
import java.net.MalformedURLException;

public class StudentRosterService {
    public static void main(String[] args) {
        try {
            // Get a new RosterStudent object from the UI
            RosterStudent student = postNewStudent();

            // Convert the RosterStudent to a Student
            Student converted = student.toStudent();

            // Set the url to the course management's wsdl file
            URL url = new URL("http://localhost:7366/coursemanagement?wsdl");

            // Create a new CourseManagementService client and connect to it at the specified URL
            CourseManagementImplService service = new CourseManagementImplService(url);
            CourseManagement proxy = service.getCourseManagementImplPort();

            System.out.println("Connected to the Course Management System on http://localhost:7366/");

            // Update the Course Management System with the new Student Roster System Student
            Student updated = proxy.updateStudent(converted);
            System.out.println("Sending student "+converted.getStudentName()+".");
        } catch (MalformedURLException e) {
            // Print an error if there is an issue with the URL format
            e.printStackTrace();
        }
    }

    /**
     * Method for simulating new student data being
     * entered into the system from an imaginary UI layer
     *
     * @return a new Student object
     */
    public static RosterStudent postNewStudent(){
        RosterStudent student = new RosterStudent();

        //Set the member variables to the test data
        student.stuID = 1111;
        student.name = "Bob Smith";
        student.ssn = "222-333-1111";
        student.emailAddress = "bsmith@yahoo.com";
        student.homePhone = "215-777-8888";
        student.homeAddr = "123 Tulip Road, Ambler, PA 19002";
        student.localAddr = "321 Maple Avenue, Lion Town, PA 16800";
        student.emergencyContact = "John Smith (215-222-6666)";
        student.programID = 206;
        student.paymentID = "1111-206";
        student.academicStatus = 1;

        // Output the RosterStudent to the console
        System.out.println("Record received from UI: ");
        System.out.println(student.toString());

        // Return the student
        return student;
    }
}

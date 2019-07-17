package edu.lion.students;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

/**
 * SWENG 568
 * CourseManagementImpl.java
 * Purpose: Implements the CourseManagement service interface
 *
 * @author Sean Davis
 */
@WebService(endpointInterface = "edu.lion.students.CourseManagement")
public class CourseManagementImpl implements CourseManagement {

    // Array list simulating the course management database
    private ArrayList<Student> students = new ArrayList<>();

    @WebMethod
    public Student updateStudent(Student student) {
        System.out.println("Update requested for student : "+student.StudentName+".");

        // Student variable representing a student that is already in the database. Null if not found.
        Student found = findByID(student.StudentID);

        // If the record already exists, update the record if the update object field is not null
        if (found != null) {

            // If the update object's field is not null, update the record. Otherwise, do not change it.
            found.StudentName = (student.StudentName !=null) ? student.StudentName : found.StudentName;
            found.StudentSSN = (student.StudentSSN !=null) ? student.StudentSSN : found.StudentSSN;
            found.StudentEmail = (student.StudentEmail !=null) ? student.StudentEmail : found.StudentEmail;
            found.StudentPhone = (student.StudentPhone !=null) ? student.StudentPhone : found.StudentPhone;

            System.out.println("Updating student: "+student.StudentName+".");
        } else {
            // Add the student if the student does not exist in the database
            students.add(student);
            System.out.println("Record not found. Adding student: "+student.StudentName+" to the Course Management Database");
        }
        // Return the updated student
        System.out.println("Updated Record Received: ");
        System.out.println(student.toString());
        return student;
    }

    // Find a student by id in the list
    private Student findByID(int id){
        // Loop through the list
        for (Student student : students) {
            // If a student with teh same ID already exists, set the found variable to the existing student
            if (student.StudentID == id) {
                return student;
            }
        }
        // Return null if not found
        return null;
    }



}

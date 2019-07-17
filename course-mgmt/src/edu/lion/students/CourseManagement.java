package edu.lion.students;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * SWENG 568
 * CourseManagement.java
 * Purpose: An interface that describes the course management services.
 *
 * @author Sean Davis
 */
@WebService
public interface CourseManagement {

    /**
     * Updates the database with the provided student. If the record does not exist, it will be created and added to the database.
     *
     * @param student A student record to provide updates. Fields that are left null will not overwrite what is already in the database.
     * @return The updated student record object.
     */
    @WebMethod
    Student updateStudent(Student student);

}

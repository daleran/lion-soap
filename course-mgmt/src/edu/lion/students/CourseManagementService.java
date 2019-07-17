package edu.lion.students;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CourseManagementService {

    @WebMethod
    CourseStudent getStudent(int id);

    @WebMethod
    CourseStudent updateStudent(CourseStudent student);

    @WebMethod
    boolean deleteStudent(int id);

    @WebMethod
    CourseStudent addStudent(CourseStudent student);
}

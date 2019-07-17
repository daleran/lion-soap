package edu.lion.students;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "edu.lion.students.CourseManagementService")
public class CourseManagementServiceImpl implements CourseManagementService {

    private ArrayList<CourseStudent> students = new ArrayList<>();

    @WebMethod
    public CourseStudent getStudent(int id) {
        for (CourseStudent student : students) {
            if (student.getStudentID() == id) {
                return student;
            }
        }
        return null;
    }

    @WebMethod
    public CourseStudent updateStudent(CourseStudent student) {
        CourseStudent found = getStudent(student.getStudentID());

        if (found != null) {
            found.setStudentName(student.getStudentName());
            found.setStudentSSN(student.getStudentSSN());
            found.setStudentEmail(student.getStudentEmail());
            found.setStudentPhone(student.getStudentPhone());
        } else {
            students.add(student);
        }
        return student;
    }

    @WebMethod
    public boolean deleteStudent(int id) {
        CourseStudent student = getStudent(id);

        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }

    @WebMethod
    public CourseStudent addStudent(CourseStudent student) {
        students.add(student);
        return student;
    }
}

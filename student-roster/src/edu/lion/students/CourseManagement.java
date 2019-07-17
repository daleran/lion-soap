
package edu.lion.students;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CourseManagement", targetNamespace = "http://students.lion.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CourseManagement {


    /**
     * 
     * @param arg0
     * @return
     *     returns edu.lion.students.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateStudent", targetNamespace = "http://students.lion.edu/", className = "edu.lion.students.UpdateStudent")
    @ResponseWrapper(localName = "updateStudentResponse", targetNamespace = "http://students.lion.edu/", className = "edu.lion.students.UpdateStudentResponse")
    @Action(input = "http://students.lion.edu/CourseManagement/updateStudentRequest", output = "http://students.lion.edu/CourseManagement/updateStudentResponse")
    public Student updateStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        Student arg0);

}

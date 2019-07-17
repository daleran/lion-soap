
package edu.lion.students;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StudentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StudentSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StudentEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StudentPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {
    "studentID",
    "studentName",
    "studentSSN",
    "studentEmail",
    "studentPhone"
})
public class Student {

    @XmlElement(name = "StudentID")
    protected int studentID;
    @XmlElement(name = "StudentName")
    protected String studentName;
    @XmlElement(name = "StudentSSN")
    protected String studentSSN;
    @XmlElement(name = "StudentEmail")
    protected String studentEmail;
    @XmlElement(name = "StudentPhone")
    protected String studentPhone;

    /**
     * Gets the value of the studentID property.
     * 
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Sets the value of the studentID property.
     * 
     */
    public void setStudentID(int value) {
        this.studentID = value;
    }

    /**
     * Gets the value of the studentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets the value of the studentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentName(String value) {
        this.studentName = value;
    }

    /**
     * Gets the value of the studentSSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentSSN() {
        return studentSSN;
    }

    /**
     * Sets the value of the studentSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentSSN(String value) {
        this.studentSSN = value;
    }

    /**
     * Gets the value of the studentEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentEmail() {
        return studentEmail;
    }

    /**
     * Sets the value of the studentEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentEmail(String value) {
        this.studentEmail = value;
    }

    /**
     * Gets the value of the studentPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPhone() {
        return studentPhone;
    }

    /**
     * Sets the value of the studentPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPhone(String value) {
        this.studentPhone = value;
    }

    /**
     * Get a string representation of the student.
     *
     * @return a string with all fields of the student
     */
    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + studentID +
                ", StudentName='" + studentName + '\'' +
                ", StudentSSN='" + studentSSN + '\'' +
                ", StudentEmail='" + studentEmail + '\'' +
                ", StudentPhone='" + studentPhone + '\'' +
                '}';
    }

}

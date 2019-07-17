package edu.lion.students;

import javax.xml.ws.Endpoint;


/**
 * SWENG 568
 * CourseManagementSystem.java
 * Purpose: Create a new CourseManagementImpl and publish it to the endpoint
 *
 * @author Sean Davis
 */
public class CourseManagementSystem {
    public static void main(String[] args) {
        // Publish the course management service to the local host port 7366 under the /coursemanagement endpoint
        Endpoint.publish("http://localhost:7366/coursemanagement", new CourseManagementImpl());
    }
}

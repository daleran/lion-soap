package edu.lion.students;

import javax.xml.ws.Endpoint;

public class CourseManagementSystem {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7366/coursemanagement", new CourseManagementServiceImpl());
    }
}

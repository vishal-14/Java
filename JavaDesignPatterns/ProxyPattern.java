package com.designpattern;

/**
 * 8.Implement proxy design for accessing Record of a student
 * and allow the access only to Admin.
 */

interface Studentrecord {
    void getStudentRecord(String user);
}

class RealUser implements Studentrecord {

    @Override
    public void getStudentRecord(String user) {
        System.out.println(user + " accessing student's records.");
    }
}

class ProxyUser implements Studentrecord {

    @Override
    public void getStudentRecord(String user) {
        if (user.equalsIgnoreCase("admin")) {
            System.out.println(user + " accessing student's records.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
public class ProxyPattern {

    public static void main(String[] args) {

        Studentrecord student = new ProxyUser();
        student.getStudentRecord("Admin");

        Studentrecord student1 = new ProxyUser();
        student1.getStudentRecord("Director");
    }
}


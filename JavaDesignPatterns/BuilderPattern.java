package com.designpattern;

/**
 * 4.Implement Builder pattern to create a student object with more than 6 fields.
 */

class Student {

    private int rollNo;
    private String studentName;
    private int yearOfAdmission;
    private String course;
    private String branch;
    private boolean hosteler;
    private boolean feeWaiver;

    public Student(StudentBuilder studentBuilder) {
        rollNo = studentBuilder.getRollNo();
        studentName = studentBuilder.getStudentName();
        yearOfAdmission = studentBuilder.getYearOfAdmission();
        course = studentBuilder.getCourse();
        branch = studentBuilder.getBranch();
        hosteler = studentBuilder.isHosteler();
        feeWaiver = studentBuilder.isFeeWaiver();
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public boolean isHosteler() {
        return hosteler;
    }

    public void setHosteler(boolean hosteler) {
        this.hosteler = hosteler;
    }

    public boolean isFeeWaiver() {
        return feeWaiver;
    }

    public void setFeeWaiver(boolean feeWaiver) {
        this.feeWaiver = feeWaiver;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + rollNo +
                ", Name='" + studentName + '\'' +
                ", Year_of_adm=" + yearOfAdmission +
                ", Course='" + course + '\'' +
                ", Branch='" + branch + '\'' +
                ", Hostler=" + hosteler +
                ", FeeWaiver=" + feeWaiver +
                '}';
    }
}

class StudentBuilder {
    private int rollNo;
    private String studentName;
    private int yearOfAdmission;
    private String course;
    private String branch;
    private boolean hosteler;
    private boolean feeWaiver;

    public int getRollNo() {
        return rollNo;
    }

    public StudentBuilder hasRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public StudentBuilder hasStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public StudentBuilder inYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public StudentBuilder optedCourse(String course) {
        this.course = course;
        return this;
    }

    public String getBranch() {
        return branch;
    }

    public StudentBuilder hasBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public boolean isHosteler() {
        return hosteler;
    }

    public StudentBuilder hasOptedforHostel(boolean hosteler) {
        this.hosteler = hosteler;
        return this;
    }

    public boolean isFeeWaiver() {
        return feeWaiver;
    }

    public StudentBuilder hasFeeWaiver(boolean feeWaiver) {
        this.feeWaiver = feeWaiver;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
public class BuilderPattern {
    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .hasStudentName("Vishal")
                .hasRollNo(1503210242)
                .optedCourse("B.Tech")
                .hasBranch("CSE")
                .inYearOfAdmission(2015)
                .hasFeeWaiver(false)
                .hasOptedforHostel(false)
                .build();

        System.out.println(student);
    }
}

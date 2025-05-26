package com.example;

import java.util.List;

public class Course {
    private String courseName;
    private Teacher teacher;
    private List<Student> studentsList;

    public Course(String courseName, List<Student> studentsList, Teacher teacher) {
        this.courseName = courseName;
        this.studentsList = studentsList;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudent(Student student)
    {
        this.studentsList.add(student);
    }

    public void showParticipants()
    {
        System.out.println("PROFESOR: " + this.teacher.getName());
        for (Student student : this.studentsList) {
            System.out.println("Alumno: " + student.getName());
        }
    }
}

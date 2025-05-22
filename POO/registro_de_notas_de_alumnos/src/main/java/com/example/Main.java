package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Tony", List.of(9.5, 9.5, 9.5));
        Student s2 = new Student("Steve", List.of(9.5, 8.5, 9.5));
        Student s3 = new Student("Thor", List.of(3.5, 4.5, 2.5));
        Student s4 = new Student("Natasha", List.of(7.5, 6.5, 9.5));

        System.out.println("<<< PROMEDIO DE CADA ALUMNO >>>\n");
        System.out.println(s1.getName() + ": " + s1.calculateAverage() + s1.studentApproves());
        System.out.println(s2.getName() + ": " + s2.calculateAverage() + s2.studentApproves());
        System.out.println(s3.getName() + ": " + s3.calculateAverage() + s3.studentApproves());
        System.out.println(s4.getName() + ": " + s4.calculateAverage() + s4.studentApproves());
        System.out.println();
        
        // System.out.println("Mejor alumno: " + Student.bestStudent(s1, s2, s3, s4));
    }
}
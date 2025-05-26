package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner optionScanner = new Scanner(System.in);
        boolean p = false;
        
        Teacher teacher = new Teacher("Matematicas", 46, "Roberto");
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Primero", 13, "Steve");
        Student s2 = new Student("Segundo", 14, "Tony");
        Student s3 = new Student("Primero", 13, "Thor");
        Student s4 = new Student("Primero", 13, "Natasha");
        Student s5 = new Student("Tercero", 13, "Yelena");
        Student s6 = new Student("Primero", 15, "Bruce");
        Student s7 = new Student("Segundo", 12, "Nick");
        Student s8 = new Student("Segundo", 14, "Thanos");
        Student s9 = new Student("Tercero", 13, "Loki");
        Student s10 = new Student("Primero", 13, "Pepper");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);

        Course course = new Course("Curso de matematicas", students, teacher);


        System.out.println("<<< SISTEMA ESCOLAR >>>");

        do { 
            System.out.println("1. Añadir estudiante");
            System.out.println("2. Mostrar participantes del curso");
            System.out.println("3. Salir");
            System.out.print("-> Selecciona una opción: ");
            int opt = optionScanner.nextInt();

            switch (opt) {
                case 1:
                    Scanner newStudentData = new Scanner(System.in);
                    System.out.print("Nombre: ");
                    String newName = newStudentData.nextLine();
                    System.out.print("Edad: ");
                    int newAge = newStudentData.nextInt();
                    System.out.print("Grado: ");
                    newStudentData.nextLine();
                    String newDegree = newStudentData.nextLine();

                    Student newStudent = new Student(newDegree, newAge, newName);
                    course.addStudent(newStudent);
                    System.out.println("-> Estudiante añadido!");
                    break;
                case 2:
                    System.out.println("\n-> PARTICIPANTES DEL CURSO: \n");
                    course.showParticipants();
                    System.out.println();
                    break;
                case 3:
                    p = true; 
                    break;
            }
        } while (!p);
    }
}
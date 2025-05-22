package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean phone = true;

        Student s1 = new Student("Tony", new ArrayList<>(List.of(9.5, 9.5, 9.5)));
        Student s2 = new Student("Steve", new ArrayList<>(List.of(9.5, 8.5, 9.5)));
        Student s3 = new Student("Thor", new ArrayList<>(List.of(3.5, 4.5, 2.5)));
        Student s4 = new Student("Natasha", new ArrayList<>(List.of(7.5, 6.5, 9.5)));

        System.out.println("<<< REGISTRO DE NOTAS >>>");

        do { 
            System.out.println("\n1. Listar alumnos");
            System.out.println("2. Añadir nota");
            System.out.println("3. Salir");

            System.out.print("\n-> Seleccione una opción: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option < 1 || option > 3) {
                System.out.println("\n** ERROR: Opción fuera de rango **");
            } else {
                switch(option) {
                    case 1:
                        System.out.println("\n<<< PROMEDIO DE CADA ALUMNO >>>\n");
                        System.out.println("1. " + s1.getName() + ": " + s1.calculateAverage() + s1.studentApproves());
                        System.out.println("2. " + s2.getName() + ": " + s2.calculateAverage() + s2.studentApproves());
                        System.out.println("3. " + s3.getName() + ": " + s3.calculateAverage() + s3.studentApproves());
                        System.out.println("4. " + s4.getName() + ": " + s4.calculateAverage() + s4.studentApproves());
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Introduce el número del alumno deseado (1-4): ");       
                        int desiredStudent = scanner.nextInt();
                        scanner.nextLine();

                        if(desiredStudent < 1 || desiredStudent > 4) {
                            System.out.println("\n** ERROR: Este alumno no existe **");
                        } else {
                            System.out.print("Introduce la nota que deseas añadir: ");
                            double newNoteToAdd = scanner.nextDouble();

                            if(newNoteToAdd < 0.0 || newNoteToAdd > 10.0) {
                                System.out.println("\n** ERROR: Nota fuera de rango **");
                            } else {
                                switch(desiredStudent) {
                                    case 1:
                                        s1.addNotes(newNoteToAdd, s1.getNotes());
                                        break;
                                    case 2:
                                        s2.addNotes(newNoteToAdd, s2.getNotes());
                                        break;
                                    case 3:
                                        s3.addNotes(newNoteToAdd, s3.getNotes());
                                        break;
                                    case 4:
                                        s4.addNotes(newNoteToAdd, s4.getNotes());
                                        break;
                                }
                            }
                        }
                        break;
                    case 3:
                        phone = false;
                        break;
                }
            }
        } while (phone);
    }
}

package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Task> tasks = new ArrayList<>();

        boolean phone = true;

        System.out.println("\n<<< LISTA DE TAREAS >>>\n");
        Task task1 = new Task("Deberes de Java", "Acabar los deberes de Java de POO", Task.State.completed);
        Task task2 = new Task("Comprar el pan", "Comprar pan en el Condis", Task.State.completed);
        Task task3 = new Task("Sacar al perro", "Sacar al perro 15 minutos", Task.State.completed);
        Task task4 = new Task("Comprar agua", "Comprar agua en el Spar", Task.State.uncompleted);
        
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);

        Task.listTasks(tasks);

        /* System.out.print("-> Actualizar tarea | Crear tarea [1/2]: ");
        int r = s.nextInt();

        if (r == 1) {
            System.out.print("\n-> Selecciona una tarea: ");
            int num = s.nextInt();
            if(num >= 0 && num < tasks.size())
            {
                System.out.print("\n-> Introduce el estado de la tarea [ 0 (completed) / 1 (uncompleted) ]: ");
                int newState = s.nextInt();
                
                if (newState == 0) {
                    tasks.get(num).setState(Task.State.completed);
                }
                else
                {
                    tasks.get(num).setState(Task.State.uncompleted);
                }

                Task.listTasks(tasks);
            }
            else
            {
                System.out.print("-> Tarea no existente. Vuelve a probar.");
            }
        } 
        else if(r == 2)
        {
            System.out.print("\n-> Nombre de la nueva tarea: ");
            String newTask = s.nextLine();
            System.out.print("\n-> Descripción de la nueva tarea: ");
            String newDescription = s.nextLine();
            System.out.print("\n-> Estado de la nueva tarea [ 0 (completed) / 1 (uncompleted) ]: ");
            int actualNewState = s.nextInt();
            if (actualNewState == 0) {
                Task n = new Task(newTask, newDescription, Task.State.completed);
                tasks.add(n);
            }
            else
            {
                Task n = new Task(newTask, newDescription, Task.State.completed);
                tasks.add(n);
            }
        }
        else
        {
            System.out.print("-> De acuerdo.");
        } */  

        System.out.println("\n<<< LISTA DE TAREAS >>>\n");
        
        do { 
            System.out.println("\n1. Listar tareas");
            System.out.println("2. Actualizar tarea");
            System.out.println("3. Crear tarea");
            System.out.println("4. Salir");

            System.out.print("\n-> Seleccione una opción: ");
            
            int option = s.nextInt();

            if (option < 1 || option > 4) {
                System.out.println("\n** ERROR: Opción fuera de rango **");
            }
            else
            {
                Scanner sca = new Scanner(System.in);
                switch(option)
                {
                    case 1:
                        Task.listTasks(tasks);
                        break;
                    case 2:
                        System.out.print("\n-> Selecciona una tarea: ");
                        int num = s.nextInt();
                        if(num >= 0 && num < tasks.size())
                        {
                            System.out.print("\n-> Introduce el estado de la tarea [ 0 (completed) / 1 (uncompleted) ]: ");
                            int newState = s.nextInt();
                            
                            if (newState == 0) {
                                tasks.get(num).setState(Task.State.completed);
                            }
                            else
                            {
                                tasks.get(num).setState(Task.State.uncompleted);
                            }

                            Task.listTasks(tasks);
                        }
                        else
                        {
                            System.out.print("-> Tarea no existente. Vuelve a probar.");
                        }
                        break;
                    case 3:
                        Scanner newTaskSca = new Scanner(System.in);
                        System.out.print("\n-> Nombre de la nueva tarea: ");
                        String newTask = newTaskSca.nextLine();
                        System.out.print("\n-> Descripción de la nueva tarea: ");
                        String newDescription = newTaskSca.nextLine();
                        System.out.print("\n-> Estado de la nueva tarea [ 0 (completed) / 1 (uncompleted) ]: ");
                        int actualNewState = newTaskSca.nextInt();
                        if (actualNewState == 0) {
                            Task n = new Task(newTask, newDescription, Task.State.completed);
                            tasks.add(n);
                        }
                        else
                        {
                            Task n = new Task(newTask, newDescription, Task.State.uncompleted);
                            tasks.add(n);
                        }
                        break;
                    case 4:
                        phone = false;
                        break;
                }
            }
        }
        while(phone != false);
    }
}
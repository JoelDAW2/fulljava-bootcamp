package com.example;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Task> tasks = new ArrayList<>();

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

        System.out.print("-> Actualizar tarea? [y/n]: ");
        String r = s.nextLine();

        if (r.equalsIgnoreCase("y")) {
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
        else 
        {
            System.out.print("-> De acuerdo.");
        }  
    }
}
package com.example;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner answerScanner = new Scanner(System.in);

        Question q1 = new Question("¿Quién es el rey de la sabana?", new String[] {"León", "Jirafa", "Tortuga"}, 0);
        Question q2 = new Question("¿Quién tiene el cuello más largo?", new String[] {"León", "Jirafa", "Cebra"}, 1);
        Question q3 = new Question("¿Quién tiene trompa?", new String[] {"Rinoceronte", "Jirafa", "Elefante"}, 2);
        
        Question[] questions = { q1, q2, q3 };

        Survey survey1 = new Survey("Reino animal", questions);

        for (Question question : survey1.getQuestions()) {
            System.out.println(">>> " + question.getQuestion());
            int index2 = 0;
            for (String answer : question.getPossibleAnswers()) {
                System.out.println("    " + index2 + ". " + answer);
                index2++;
            }
            boolean ans = false;
            do { 
                System.out.print("   -> ");
                int answer = answerScanner.nextInt();
                answerScanner.nextLine();
                if(answer >= 0 && answer <= 2)
                {
                    ans = true;
                    if(answer == question.getAnswer())
                    {
                        System.out.println("\n*** CORRECTO ***\n");
                    }
                    else 
                    {
                        System.out.println("\n*** INCORRECTO ***\n");
                    }
                }
                else 
                {
                    System.out.println("\n** ERROR: Respuesta fuera de rango. Introduce un número válido **\n");
                }
            } while (ans == false);
        }

        System.out.println("-> Enquesta finalizada");

        try {
            File newTxtFile = new File("C:\\Users\\Mati\\Desktop\\filename.txt");;
            if (newTxtFile.createNewFile()) {
                System.out.println("Resultados de la encuesta en: " + newTxtFile.getName());
            } 
            else {
                System.out.println("Archivo existente.");
            }
        } catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
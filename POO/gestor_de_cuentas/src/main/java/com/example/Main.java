package com.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        // Ruta del txt
        File newTxtFile = new File("C:\\Users\\Mati\\Desktop\\mySurvey.txt");
        // Encuesta 1
        Question q1 = new Question("¿Quién es el rey de la sabana?", new String[] {"León", "Jirafa", "Tortuga"}, 0);
        Question q2 = new Question("¿Quién tiene el cuello más largo?", new String[] {"León", "Jirafa", "Cebra"}, 1);
        Question q3 = new Question("¿Quién tiene trompa?", new String[] {"Rinoceronte", "Jirafa", "Elefante"}, 2);
        Question[] questions = { q1, q2, q3 };
        Survey survey1 = new Survey("Reino animal", questions);
        // Encuesta 2
        Question q4 = new Question("¿Cuál de los siguientes animales tiene pico?", new String[] {"Jirafa", "Loro", "Camaleón"}, 1);
        Question q5 = new Question("¿Cuál de los siguientes animales tiene cola?", new String[] {"Gorila", "Tucán", "Gato"}, 2);
        Question q6 = new Question("¿Cuál de los siguientes animales vive en el polo norte?", new String[] {"Pinguino", "Zorro", "Tigre"}, 0);
        Question[] questions2 = { q4, q5, q6 };
        Survey survey2 = new Survey("Reino animal - 2", questions2);
        // Lista de encuestas
        Survey[] surveysList = new Survey[] {survey1, survey2};


        createJsonFile();

        // REGISTRO DEL USUARIO
        boolean userPhone = false;
        Scanner userScanner = new Scanner(System.in);
        // Registramos el usuario
        do { 
            System.out.println("<<< REGISTRO DE USUARIO >>>");
            System.out.print("Inserte nombre de usuario: ");
            String userName = userScanner.nextLine();
            System.out.print("Inserte contraseña: ");
            String userPassword = userScanner.nextLine();
            User newUser = new User(userName, userPassword);
            if(newUser != null)
            {
                userPhone = true;
            }
        } while (userPhone == false);

        // Menu de inicio
        boolean initialMenuPhone = false;
        Scanner menuScanner = new Scanner(System.in);

        System.out.print("Iniciar encuestas [Yes/No]: ");
        String menuAnswer = menuScanner.nextLine();
        do { 
            if(menuAnswer.equalsIgnoreCase("Yes"))
            {
                System.out.println("-> ENCUESTAS DISPONIBLES: ");
                System.out.println("0. " + survey1.getTitle());
                System.out.println("1. " + survey2.getTitle());
                System.out.println("3. Salir");
                System.out.print("-> Selecciona una opción: ");
                int surveyMenuOption = menuScanner.nextInt();
                if(surveyMenuOption == 1 || surveyMenuOption == 2)
                {
                    Survey selectedSurvey = surveysList[surveyMenuOption];
                    generateSurvey(selectedSurvey, newTxtFile);
                }
                else
                {
                    initialMenuPhone = true;    
                }
            }
            else 
            {
                System.out.println("De acuerdo");
                initialMenuPhone = true;
            }
        } while (initialMenuPhone == false);
    }

    public static void createJsonFile()
    {
        try 
        {
            //String jsonString = "{\"question_1\":\"0\", \"question_2\":\"0\", \"question_3\":\"0\"}";
            // Crear objeto JSON
            JSONObject obj = new JSONObject();
            // Crear key value pairs
            obj.put("question_1", "0");
            obj.put("question_2", "0");
            obj.put("question_3", "0");
    
            FileWriter newJsonFile = new FileWriter("C:\\Users\\Mati\\Desktop\\test.json");
            newJsonFile.write(obj.toJSONString());
            newJsonFile.close();
        } catch (Exception e) 
        {
            System.out.println("** ERROR: Fallo al guardar la data **");
            e.printStackTrace();
        }
    }

    public static void generateSurvey(Survey survey, File newTxtFile)
    {
        Scanner answerScanner = new Scanner(System.in);
        // Variable para almacenar el resultado de la encuesta
        String savingData = "<<< REGISTRO DE LA ENCUESTA >>>\n";

        System.out.println("<<< RESPONDE LAS ENCUESTAS >>>");

        createFile(newTxtFile);

        for (Question question : survey.getQuestions()) {
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
                        if(newTxtFile.exists())
                        {
                            savingData += "PREGUNTA: " + question.getQuestion() + " | RESPUPESTA: " + Integer.toString(answer) + " (Correcto)\n";
                            //saveData(newTxtFile, savingData);
                        }
                        else
                        {
                            System.out.println(">>>>>>>>>>>>>>>>> No existe el archivo");
                        }
                    }
                    else 
                    {
                        System.out.println("\n*** INCORRECTO ***\n");
                        if(newTxtFile.exists())
                        {
                            savingData += "PREGUNTA: " + question.getQuestion() + " | RESPUPESTA: " + Integer.toString(answer) + " (Incorrecto)\n";
                            //saveData(newTxtFile, savingData);
                        }
                        else
                        {
                            System.out.println(">>>>>>>>>>>>>>>>> No existe el archivo");
                        }
                    }
                }
                else 
                {
                    System.out.println("\n** ERROR: Respuesta fuera de rango. Introduce un número válido **\n");
                }
            } while (ans == false);
        }

        System.out.println("-> Enquesta finalizada");
        
        Scanner savingScanner = new Scanner(System.in);
        System.out.print("-> Desea guardar los resultados? [Yes/No]: ");
        String savingAskAnswer = savingScanner.nextLine();
        if(savingAskAnswer.equalsIgnoreCase("Yes"))
        {
            System.out.print("Nombre del archivo: ");
            String savedNewFile = savingScanner.nextLine();
            File newFile = new File("C:\\Users\\Mati\\Desktop\\" + savedNewFile + ".txt");
            saveData(newFile, savingData);
        }
        else
        {
            System.out.println("-> De acuerdo");
        }
    }

    public static boolean createFile(File txtFile)
    {
        try {
            //File newTxtFile = new File("C:\\Users\\Mati\\Desktop\\filename.txt");
            if (txtFile.createNewFile()) {
                System.out.println("Resultados de la encuesta en: " + txtFile.getName());
            } 
            else {
                System.out.println("Archivo existente.");
            }
            return true;
        } catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    public static void saveData(File txtFile, String data)
    {
        try {
            FileWriter writing = new FileWriter(txtFile);
            writing.write("\n" + data);
            writing.close();
            System.out.println("-> Data almacenada");
        } 
        catch (IOException e) 
        {
            System.out.println("** ERROR: Fallo al guardar la data **");
            e.printStackTrace();
        }
    }
}
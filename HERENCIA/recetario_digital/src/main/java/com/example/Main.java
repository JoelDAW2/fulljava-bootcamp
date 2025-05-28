package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Recipe> recipes = new ArrayList<>();

        System.out.println("<<< RECETARIO DIGITAL >>>\n");
        // RECETA DULCE
        // Ingredientes
        Ingredient colacao = new Ingredient(4.5, "Colacao", "g");
        Ingredient milk = new Ingredient(1, "Leche", "l");
        Ingredient sugar = new Ingredient(500, "Azúcar", "mg");
        Ingredient honey = new Ingredient(1, "Miel", "l");
        // Nueva lista de ingredientes
        List<Ingredient> sweetIngredients = new ArrayList<>();
        // Añadimos los ingredientes a la lista de ingredientes
        sweetIngredients.add(colacao);
        sweetIngredients.add(milk);
        sweetIngredients.add(sugar);
        sweetIngredients.add(honey);
        // Lista de pasos
        List<String> steps = new ArrayList<>();
        // Añadimos los pasos en la lista
        steps.add("Añadimos el colacao en un vaso.");
        steps.add("Añadimos el azúcar.");
        steps.add("Añadimos la leche.");
        steps.add("Añadimos un chorrito de miel.");
        steps.add("Calentarlo en el miscroondas durante 1 minuto.");
        steps.add("Removemos el contenido");
        // Creamos la receta dulce
        SweetRecipe sr1 = new SweetRecipe(sweetIngredients, "Colacao", steps);

        // RECETA SALADA
        // Ingredientes
        Ingredient potato = new Ingredient(1, "Patatas", "kg");
        Ingredient oil = new Ingredient(1, "Aceite", "l");
        Ingredient salt = new Ingredient(500, "Sal", "g");
        // Nueva lista de ingredientes salados
        List<Ingredient> saltyIngredients = new ArrayList<>();
        // Añadimos los ingredientes salados a la lista 
        saltyIngredients.add(potato);
        saltyIngredients.add(oil);
        saltyIngredients.add(salt);
        // Lista de pasos
        List<String> steps2 = new ArrayList<>();
        // Añadimos los pasos en la lista
        steps2.add("Cortamos las patatas al gusto.");
        steps2.add("Calentamos el aceite.");
        steps2.add("Añadimos las patatas.");
        steps2.add("Tiramos sal.");
        steps2.add("Sacamos las patatas y las añadimos en un plato.");
        steps2.add("Esperamos a que enfríen.");
        // Creamos la receta salada
        SavoryRecipe sr2 = new SavoryRecipe(saltyIngredients, "Patatas fritas", steps2);
        
        recipes.add(sr1);
        recipes.add(sr2);

        showMenu(recipes);
        
    }

    public static void showMenu(List<Recipe> recipes)
    {
        boolean p = false;
        do { 
            Scanner s = new Scanner(System.in);
            System.out.println("***************************");
            System.out.println("1. Añadir receta.");
            System.out.println("2. Mostrar recetas disponibles.");
            System.out.println("3. Mostrar detalles de un receta.");
            System.out.println("4. Salir.");
            System.out.print("-> Selecciona una opción: ");
            int opt = s.nextInt();
            System.out.println("***************************");

            switch (opt) {
                case 1:
                    createRecipe(recipes);
                    break;
                case 2:
                    showAllRecipes(recipes);
                    break;
                case 3:
                    showRecipesDetails(recipes);
                    break;
                case 4:
                    p = true;
                    break;
            }

        } while (!p);
    }

    public static void showAllRecipes(List<Recipe> recipes)
    {
        System.out.println();
        for (Recipe recipe : recipes) {
            System.out.println("Receta: " + recipe.getName());
            System.out.println("Tipo de receta: " + recipe.getClass().getSimpleName());
            System.out.println("Número de ingredientes: " + recipe.getIngredients().size());
            System.out.println();
        }
    }

    public static void showRecipesDetails(List<Recipe> recipes)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el nombre de la receta deseada: ");
        String name = s.nextLine();

        for (Recipe recipe : recipes) {
            if(recipe.getName().equalsIgnoreCase(name))
            {
                recipe.getGeneralDescription();
                return;
            }
        }
    }

    public static Ingredient createIngredient()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Nombre del ingrediente: ");
        String niName = s.nextLine();
        System.out.print("Cantidad: ");
        double niAmount = s.nextDouble();
        s.nextLine();
        System.out.print("Unidades: ");
        String niUnits = s.nextLine();

        Ingredient newIngredient = new Ingredient(niAmount, niName, niUnits);
        return newIngredient;
    }

    private static String createStep()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el paso: ");
        String nStep = s.nextLine();
        return nStep;
    }

    public static void createRecipe(List<Recipe> recipes)
    {   
        List<Ingredient> newIngredients = new ArrayList<>();
        List<String> newSteps = new ArrayList<>();
        boolean f = false;
        boolean n = false;
        Scanner s = new Scanner(System.in);
        System.out.print("Nombre de la receta: ");
        String niName = s.nextLine();
        System.out.println("Añade los ingredientes necesarios: ");
        do { 
            Ingredient newIngredientToAdd = createIngredient();
            newIngredients.add(newIngredientToAdd);
            System.out.print("Añadir otro [Si/No]: ");
            String addNewIngredientResponse = s.nextLine();
            if(!addNewIngredientResponse.equalsIgnoreCase("Si"))
            {
                f = true;
            }
        } while (!f);

        System.out.println("Añade los pasos necesarios: ");
        do { 
            String newStepToAdd = createStep();
            newSteps.add(newStepToAdd);
            System.out.print("Añadir otro [Si/No]: ");
            String addNewStepsResponse = s.nextLine();
            if(!addNewStepsResponse.equalsIgnoreCase("Si"))
            {
                n = true;
            }
        } while (!n);
        
        System.out.print("Receta dulce o salada [1/2]: ");
        int r = s.nextInt();
        if(r == 1)
        {
            SweetRecipe newSweetRecipeToAdd = new SweetRecipe(newIngredients, niName, newSteps);
            recipes.add(newSweetRecipeToAdd);
        }
        else
        {
            SavoryRecipe newSavoryRecipeToAdd = new SavoryRecipe(newIngredients, niName, newSteps);
            recipes.add(newSavoryRecipeToAdd);
        }
    }
}
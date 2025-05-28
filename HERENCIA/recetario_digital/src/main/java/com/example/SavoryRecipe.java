package com.example;

import java.util.List;

public class SavoryRecipe extends Recipe{

    public SavoryRecipe(List<Ingredient> ingredients, String name, List<String> steps) {
        super(ingredients, name, steps);
    }

    public void getGeneralDescription() {
        System.out.println("****************");
        System.out.println("* RECETA SALADA *");
        System.out.println("****************");
        System.out.println();
        System.out.println("--->>> INGREDIENTES: ");
        getAllIngredients();
        System.out.println("--->>> PASOS: ");
        getAllSteps();
    }
}

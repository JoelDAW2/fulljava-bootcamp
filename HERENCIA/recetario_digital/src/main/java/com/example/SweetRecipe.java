package com.example;

import java.util.List;

public class SweetRecipe extends Recipe {

    public SweetRecipe(List<Ingredient> ingredients, String name, List<String> steps) {
        super(ingredients, name, steps);
    }

    //@Override
    public void getGeneralDescription() {
        System.out.println("****************");
        System.out.println("* RECETA DULCE *");
        System.out.println("****************");
        System.out.println();
        System.out.println("--->>> INGREDIENTES: ");
        getAllIngredients();
        System.out.println("--->>> PASOS: ");
        getAllSteps();
    }
}

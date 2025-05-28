package com.example;
import java.util.List;

public abstract  class Recipe {
    private String name;
    private List<Ingredient> ingredients;
    private List<String> steps;

    public Recipe(List<Ingredient> ingredients, String name, List<String> steps) {
        this.ingredients = ingredients;
        this.name = name;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void getAllIngredients()
    {
        int index = 0;
        for (Ingredient ingredient : this.ingredients) {
            System.out.println(index + ": " + ingredient.getName());
            index++;
        }
        System.out.println();
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void getAllSteps()
    {
        int index = 0;
        for (String step : this.steps) {
            System.out.println(index + ": " + step);
            index++;
        }
        System.out.println();
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    public abstract void getGeneralDescription();
}


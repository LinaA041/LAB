package model;

import java.util.LinkedList;

public class Recipe {

    Ingredient name;
    Ingredient weight;

    public Ingredient getName() {
        return name;
    }

    public void setName(Ingredient name) {
        this.name = name;
    }

    public Ingredient getWeight() {
        return weight;
    }

    public void setWeight(Ingredient weight) {
        this.weight = weight;
    }
    public LinkedList<Ingredient> ingredients;

    public Recipe(){
        ingredients = new LinkedList<>();
        this.name = null;
        this.weight = null;
    }

    public void addIngredient(Ingredient ingredient) {

        ingredients.add(ingredient);

    }
}

package model;

import exceptions.InvalidNumberException;

public class Ingredient {

    private String name;
    private int weight;

    public Ingredient() {

        this.name = null;
        this.weight = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  Ingredient addIngredient(String name, int weight) {

        Ingredient ingredient = new Ingredient();
        ingredient.setName(name);
        ingredient.setWeight(weight);

        return ingredient;

    }

    public void addWeight(int weight) throws InvalidNumberException {

        if (weight < 0) {
            throw new InvalidNumberException();
        }
        this.weight += weight;
    }

    public void modifyWeight(int weight) throws InvalidNumberException {

        if (weight < 0) {
            throw new InvalidNumberException();
        }
        this.weight = weight;
    }


    public void removeWeight(int weight)throws InvalidNumberException{

        if(weight<0){

            throw new InvalidNumberException();

        }
        this.weight -= weight;
    }
}

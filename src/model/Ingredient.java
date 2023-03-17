package model;

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

    public void addIngredient(String name, int weight) {

    }

    public void addWeight(int weight){

        setWeight(weight);
    }
}

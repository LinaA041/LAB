package model;

import exceptions.InvalidNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IngredientTest {


    @Test
    public void ingredientIsCreatedSuccesfullyTest(){

        Ingredient ingrediente = new Ingredient();
        ingrediente.setName("Tomate");
        ingrediente.setWeight(245);

        assertNotNull(ingrediente);

        assertEquals(ingrediente.getName(), "Tomate");
        assertEquals(ingrediente.getWeight(),245);


    }

    @Test
    public void weightIsChangeSucesfully(){

        Ingredient ingredient = new Ingredient();
        ingredient.setWeight(245);
        ingredient.addWeight(54);
        assertEquals(299, ingredient.getWeight());

    }

   @Test
    public void weightIsNotChangeSucesfully() {

        Ingredient ingredient = new Ingredient();
        ingredient.setWeight(245);

        try {
            ingredient.addWeight(-100);
        } catch (InvalidNumberException e) {

            assertEquals("Weight cannot be negative", e.getMessage());
        }
        assertEquals(245, ingredient.getWeight());
    }

    @Test
    public void weightIsSuccessfullyRemoved() {

        Ingredient ingredient = new Ingredient();
        ingredient.setWeight(245);

        ingredient.removeWeight(45);
        assertEquals(200, ingredient.getWeight());
    }

    @Test
    public void weightIsNotSuccessfullyRemoved() {

        Ingredient ingredient = new Ingredient();
        ingredient.setWeight(245);


        try {
            ingredient.removeWeight(-100);
        } catch (InvalidNumberException e) {

            assertEquals("Weight cannot be negative", e.getMessage());
        }
        assertEquals(245, ingredient.getWeight());
    }



}

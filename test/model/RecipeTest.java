package model;

import exceptions.InvalidNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    private Recipe prueba;
    @Test
    public void recipeIsCreatedNullSuccesfullyTest(){

        Recipe recipe = new Recipe();

        assertNull(recipe);

    }

    @Test
    public void recipeTestIsCreatedWithMoreThanObjectTest(){

        prueba = new Recipe();
        prueba.addIngredient(new Ingredient());

        prueba.addIngredient(new Ingredient());
        prueba.addIngredient(new Ingredient());

    }

    @Test
    public void contactNumberIsNotNumericTest(){


    }

    public void contactEmailIsValidTest(){
        assertTrue(false);
    }
}

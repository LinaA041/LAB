package model;

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

    
    }
}

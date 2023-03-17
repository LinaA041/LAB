package model;

import exceptions.InvalidNumberException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    private Recipe prueba;
    @Test
    public void recipeIsCreatedNullSuccesfullyTest(){

        Recipe recipe = new Recipe();
        List<Ingredient> ingredients = recipe.getIngredients();
        assertTrue(ingredients.isEmpty());

    }

    @Test
    public void recipeTestIsCreatedWithMoreThanObjectTest(){

        Recipe recipe = new Recipe();

        Ingredient cebolla = new Ingredient();
        cebolla.setName("Cebolla");
        cebolla.setWeight(315);

        Ingredient ajo = new Ingredient();
        ajo.setName("Ajo");
        ajo.setWeight(58);

        Ingredient arroz = new Ingredient();
        arroz.setName("Arroz");
        arroz.setWeight(520);

        recipe.addIngredient(cebolla);
        recipe.addIngredient(ajo);
        recipe.addIngredient(arroz);

        List<Ingredient> ingredients = recipe.getIngredients();

        assertEquals("Cebolla", ingredients.get(0).getName());
        assertEquals(315, ingredients.get(0).getWeight());
        assertEquals("Ajo", ingredients.get(1).getName());
        assertEquals(58, ingredients.get(1).getWeight());
        assertEquals("Arroz", ingredients.get(2).getName());
        assertEquals(520, ingredients.get(2).getWeight());

    }

    @Test
    public void addIngredientTest() {
        Recipe recipe = new Recipe();

        Ingredient ingredient = new Ingredient();
        ingredient.setName("Sal");
        ingredient.setWeight(12);

        recipe.addIngredient(ingredient);

        assertEquals(1, recipe.getIngredients().size());
        assertEquals("Sal", ingredient.getName());
        assertEquals(12, ingredient.getWeight());
    }

    @Test
    public void addIngredientExistingIngredientTest() {

        Recipe recipe = new Recipe();

        Ingredient cebolla = new Ingredient();
        cebolla.setName("Cebolla");
        cebolla.setWeight(315);

        Ingredient ajo = new Ingredient();
        ajo.setName("Ajo");
        ajo.setWeight(58);

        Ingredient arroz = new Ingredient();
        arroz.setName("Arroz");
        arroz.setWeight(520);

        recipe.addIngredient(cebolla);
        recipe.addIngredient(ajo);
        recipe.addIngredient(arroz);

        ajo.setWeight(79);
        recipe.addIngredient(ajo);

        List<Ingredient> ingredients = recipe.getIngredients();

        assertEquals("Ajo", ingredients.get(1).getName());
        assertEquals(79, ingredients.get(1).getWeight());
    }


}

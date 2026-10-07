package model;

import model.Ingredient.Unit;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RecipeTest {

    private Recipe recipe;
    private Ingredient ingredient;

    @BeforeEach
    void setUp() {
        this.recipe = new Recipe("Chocolate chip cookies", 10);
        this.ingredient = null;
    }

    @Test
    @Order(1)
    void addIngredient_addsExistingIngredient() {

        // Arrange
        ingredient = new Ingredient("Butter", Unit.GRAM, 120);

        // Act
        recipe.addIngredient(ingredient);

        // Assert
        assertTrue(recipe.getIngredients().contains(ingredient));
    }

    @Test
    @Order(2)
    void createIngredient_createsNewIngredient() {

        // Arrange
        String name = "Butter";
        Unit unit = Unit.GRAM;
        int amount = 120;

        // Act
        ingredient = recipe.createIngredient(name, unit, amount);

        // Assert
        assertEquals("Butter", ingredient.getName());
        assertEquals(unit, ingredient.getUnit());
        assertEquals(amount, ingredient.getAmount());
    }

    @Test
    @Order(3)
    void createIngredient_addsNewIngredient() {

        // Arrange
        String name = "Butter";
        Unit unit = Unit.GRAM;
        int amount = 120;

        // Act
        ingredient = recipe.createIngredient(name, unit, amount);

        // Assert
        assertTrue(recipe.getIngredients().contains(ingredient));
    }
}
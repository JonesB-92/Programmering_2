package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String name;
    private int pieces;
    private List<Ingredient> ingredients;

    public Recipe(String name, int pieces) {
        this.name = name;
        this.pieces = pieces;
        this.ingredients = new ArrayList<>();
    }

    public String getName() { return name; }

    public int getPieces() {
        return pieces;
    }

    public ArrayList<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    public Ingredient createIngredient(String name, Ingredient.Unit unit, int amount) {
        Ingredient ingredient = new Ingredient(name, unit, amount);
        ingredients.add(ingredient);
        return ingredient;
    }

    public void addIngredient(Ingredient ingredient) {
        if (!ingredients.contains(ingredient)) {
            ingredients.add(ingredient);
        }
    }

    private void removeIngredient(Ingredient ingredient) {
        if (ingredients.contains(ingredient)) {
            ingredients.remove(ingredient);
        }
    }
}

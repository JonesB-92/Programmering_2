package controller;

import model.*;

public class CookieController implements CookieControllerI {

    private IngredientControllerI ingredientController;

    public CookieController(IngredientControllerI ingredientController) {
        this.ingredientController = ingredientController;
    }

    public CookieController() {}

    @Override
    public Dough prepareDough(Recipe recipe) {
        Dough dough = new Dough(recipe);
        for (int i = 0; i < recipe.getIngredients().size(); i++) {
            Ingredient ingredient = recipe.getIngredients().get(i);
            ingredientController.collectIngredient(ingredient.getName(), ingredient.getAmount());
        }
        return dough;
    }

    @Override
    public Cookie[] makeCookies(Dough dough) {
        int pieces = dough.getPiecesRemaining();
        Cookie[] cookies = new Cookie[pieces];
        for (int i = 0; i < pieces; i++) {
            Cookie cookie = dough.createCookie();
            cookie.bake();
            cookies[i] = cookie;
        }
        return cookies;
    }
}

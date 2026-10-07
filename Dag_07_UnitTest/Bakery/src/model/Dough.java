package model;

public class Dough {

    private Recipe recipe;
    private int piecesRemaining;
    private Cookie[] cookies;

    public Dough(Recipe recipe) {
        this.recipe = recipe;
        this.piecesRemaining = recipe.getPieces();
        this.cookies = new Cookie[piecesRemaining];
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public int getPiecesRemaining() {
        return piecesRemaining;
    }

    public Cookie[] getCookies() {
        return cookies;
    }

    public Cookie createCookie() {
        Cookie cookie;
        if (piecesRemaining > 0) {
            cookie = new Cookie(this);
            cookies[recipe.getPieces() - piecesRemaining] = cookie;
            piecesRemaining--;
        } else {
            throw new RuntimeException(String.format("No dough left"));
        }
        return cookie;
    }
}

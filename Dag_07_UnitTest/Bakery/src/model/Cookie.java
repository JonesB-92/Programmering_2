package model;

public class Cookie implements Bakeable {

    private Dough dough;
    private boolean baked;

    public Cookie(Dough dough) {
        this.dough = dough;
    }

    public Dough getDough() {
        return dough;
    }

    @Override
    public boolean isBaked() {
        return baked;
    }

    @Override
    public void bake() {
        this.baked = true;
    }
}

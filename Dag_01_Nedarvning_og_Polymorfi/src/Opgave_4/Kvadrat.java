package Opgave_4;

public class Kvadrat extends Firkant {

    public Kvadrat(int x, int y, double side1) {
        super(x, y, side1, side1);
        form = "Kvadrat";
    }

    //Hvorfor kræver den ikke, at jeg har denne formel, hvis min Firkant er abstrakt?
    @Override
    public double beregnAreal() {
        return super.beregnAreal();
    }


}

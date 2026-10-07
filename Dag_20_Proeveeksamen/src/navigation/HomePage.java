package navigation;

public class HomePage {
    // Composite pattern: Træstruktur = polymorfi - rekursiv, til man når bundelement
    //

    private NavigationComponent root;

    public HomePage(NavigationComponent root) {
        this.root = root;
    }

    public void print() {
        root.print();
    }
}

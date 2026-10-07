package navigation;


import java.util.ArrayList;
import java.util.List;

public class NavigationMenu extends NavigationComponent {
    private String name;

    //Composite klasse, der indeholder en eller flere components.

    //Link
    private List<NavigationComponent> navigationComponents;

    public NavigationMenu(String name) {
        this.name = name;
        navigationComponents = new ArrayList<>();
    }
}

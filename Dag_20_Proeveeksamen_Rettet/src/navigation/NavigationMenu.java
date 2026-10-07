package navigation;

import java.util.ArrayList;

public class NavigationMenu extends NavigationComponent {
    private String name;
    private ArrayList<NavigationComponent> navigationComponents;

    public NavigationMenu(String name) {
        this.name = name;
        navigationComponents = new ArrayList<>();
    }

    @Override
    public void addChild(NavigationComponent navigationComponent) {
        if (!navigationComponents.contains(navigationComponent)) {
            navigationComponents.add(navigationComponent);
        }
    }

    @Override
    public ArrayList<NavigationComponent> getChildren() {
        return new ArrayList<>(navigationComponents);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (NavigationComponent item : navigationComponents) {
            item.print();
        }
    }
}

package navigation;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class NavigationItem extends NavigationComponent {
    private String name;
    private String link;

    public NavigationItem(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public void addChild(NavigationComponent navigationComponent) {
        super.addChild(navigationComponent);
    }

    @Override
    public ArrayList<NavigationComponent> getChildren() {
        return super.getChildren();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLink() {
        return link;
    }

    @Override
    public void print() {
        System.out.println("--- " + name);
    }
}

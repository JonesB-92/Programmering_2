package navigation;

import java.util.ArrayList;

public abstract class NavigationComponent {
    //private String name; ?


    public void addChild(NavigationComponent navigationComponent) {
//        if (navigationComponent instanceof )
        throw new UnsupportedOperationException();
    }

    public ArrayList<NavigationComponent> getChildren() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getLink() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}

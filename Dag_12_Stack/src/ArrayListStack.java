import java.util.ArrayList;

public class ArrayListStack implements StackI {
    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    public void push(Object element) {
        objects.add(element);
    }

    @Override
    public Object pop() {
        return objects.removeLast();
    }

    @Override
    public Object peek() {
        return objects.getLast();
    }

    @Override
    public int size() {
        return objects.size();
    }

    @Override
    public boolean isEmpty() {
        return objects.isEmpty();
    }
}

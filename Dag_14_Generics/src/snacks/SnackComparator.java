package snacks;

import java.util.Comparator;

public class SnackComparator implements Comparator<Snack> {
    @Override
    public int compare(Snack s1, Snack s2) {

        if (s1 instanceof Smartie && s2 instanceof Smartie) {
            return ((Smartie) s1).getColor().ordinal() - ((Smartie) s2).getColor().ordinal();
        } else if (s1 instanceof Pez && s2 instanceof Pez) {
            return ((Pez) s1).getFlavor().ordinal() - ((Pez) s2).getFlavor().ordinal();
        } else if (s1 instanceof Limb && s2 instanceof Limb) {
            return ((Limb) s1).getType().ordinal() - ((Limb) s2).getType().ordinal();
        }

        return s1.getClass().getSimpleName().compareTo(s2.getClass().getSimpleName());
    }
}

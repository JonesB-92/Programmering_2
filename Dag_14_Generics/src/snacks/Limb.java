package snacks;

import java.util.Random;

public class Limb extends Snack {
    public enum Types {
        Toe, Finger, Heel, Foot, Hand, Knee
    }

    private Types type;

    public Limb() {
        Random random = new Random();
        Types[] types = Types.values();
        this.type = types[random.nextInt(types.length)];
    }

    public Limb(Types type) {
        this.type = type;
    }

    public Types getType() {
        return type;
    }

    // Menneskelemmer sorteres efter størrelse
//    @Override
//    public int compareTo(Snack other) {
//        if (other instanceof Limb) {
//            return Integer.compare(this.type.ordinal(), ((Limb) other).type.ordinal());
//        } else throw new ClassCastException("Cannot compare Limb with " + other.getClass().getSimpleName());
//
//    }

}

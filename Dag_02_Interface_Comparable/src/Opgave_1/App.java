package Opgave_1;

public class App {
    public static void main(String[] args) {
        Chili[] chilier = {
                new Chili("Jalapeño", 8000),
                new Chili("Habanero", 100000),
                new Chili("Carolina Reaper", 1500000),
                new Chili("Serrano", 25000),
                new Chili("Ghost Pepper", 1000000)
        };

        Measurable maxScoville = max(chilier);
        double averageScoville = avg(chilier);

        System.out.println("\nMax scoville i array: " + maxScoville + " på " + maxScoville.getMeasure());
        System.out.println("Average scoville i array: " + averageScoville);

    }

    public static Measurable max(Measurable[] objects) {
        if (objects == null || objects.length == 0) {
            return null;
        }

        Measurable max = null;

        for (Measurable measurable : objects) {
            if (max == null || measurable.getMeasure() > max.getMeasure()) {
                max = measurable;
            }
        }
        return max;
    }

    public static double avg(Measurable[] objects) {
        double sum = 0;
        int count = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
            count++;
        }

        return sum / count;
    }
}

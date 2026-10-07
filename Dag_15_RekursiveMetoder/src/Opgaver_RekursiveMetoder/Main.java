package Opgaver_RekursiveMetoder;

public class Main {
    public static void main(String[] args) {
        int a = 19, b = 3;

        System.out.println("=== productTrace ===");
        int result1 = productTrace(a, b);
        System.out.println("Result: " + result1);

        System.out.println("\n=== productRusTrace ===");
        int result2 = productRusTrace(a, b);
        System.out.println("Result: " + result2);
    }

    public static int productTrace(int a, int b) {
        System.out.println("product(" + a + ", " + b + ")");

        if (a == 0) {
            return 0;
        } else {
            return productTrace(a - 1, b) + b;
        }

    }

    public static int productRusTrace(int a, int b) {
        System.out.println("productRus(" + a + ", " + b + ")");
        if (a == 0) {
            return 0;
        } else if (a % 2 == 0) {
            return productRusTrace(a / 2, 2 * b);
        } else {
            return productRusTrace(a - 1, b) + b;
        }
    }
}



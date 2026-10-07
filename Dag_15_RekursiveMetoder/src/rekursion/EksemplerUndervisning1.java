package rekursion;

public class EksemplerUndervisning1 {
    public static int fac(int n) {
        int result = 0;
        if (n == 0) {
            result = 1;
        }
        else {
            result = n * fac(n - 1);
        }
        return result;
    }
    
    public static int fib(int n) {
        int result = 0;
        if (n <= 1) {
            result = n;
        }
        else {
            result = fib(n - 1) + fib(n - 2);
        }
        return result;
    }
    
    public static int facItr(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result = i * result;
        }
        return result;
    }
    
    public static int fibItr(int n) {
        int result = 0;
        int f1 = 1;
        int f2 = 1;
        int i = 0;
        while (i != n) {
            result = f1;
            f1 = f2;
            f2 = result + f2;
            i++;
        }
        return result;
    }
    
    public static void main(String[] args) {
		for (int i = 1; i<=8; i++){
			System.out.println("Den rekursive fak " + i + "  er  "+ fac(i));
			System.out.println("Den iterative fak " + i + "  er  "+ facItr(i));
		}
//        for (int i = 0; i <= 20; i++) {
//            System.out.println("Den rekursive fib " + i + "  er  " + fib(i));
//            System.out.println("Den iterative fib " + i + "  er  " + fibItr(i));
//        }
    }
    
}

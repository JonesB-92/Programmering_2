package eksempel;

public class EksempelRekursiveMetoder {

	public static int arealTrekant(int bredde) {
		int result;
		if (bredde == 1) {
			result = 1;
		} else {
			result = bredde + arealTrekant(bredde - 1);
		}
		return result;
	}

	public static int fib(int n) {
		int result = 0;
		if (n <= 1) {
			result = n;
		} else {
			result = fib(n - 1) + fib(n - 2);
		}
		return result;
	}

	public static int g(int n) {
		int result;
		if (n == 1) {
			result = 1;
		} else if (n == 2) {
			result = 5;
		} else {
			result = 5 * g(n - 1) - 6 * g(n - 2);
		}
		return result;
	}

	// Hvad udskrives ved kaldet ex0(6)
	public static void ex0(int n) {
		if (n > 0) {
			System.out.println(n);
			ex0(n - 2);
			System.out.println(n);
		}
	}

	// Hvad udskrives ved kaldet ex1(6)
	public static void ex1(int n) {
		if (n > 0) {
			System.out.println(n);
			ex1(n - 2);
			ex1(n - 3);
			System.out.println(n);
		}
	}

	// Hvad udskrives ved kaldet ex2(6)
	public static String ex2(int n) {
		String result = "";
		if (n > 0) {
			result = n + ex2(n - 2) + n;
		}
		return result;
	}

	// Hvad udskrives ved kaldet ex3(6)
	public static String ex3(int n) {
		String result = n + ex3(n - 2) + n;
		if (n <= 0) {
			result = "";
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("TrekantAreal(4) " + arealTrekant(4));

//		System.out.println("fib(7) " + fib(7));

//		System.out.println("g(4) " + g(4));

//		System.out.println("Kald til ex0(6)");
//		ex1(6);
//		System.out.println();

//		System.out.println("Kald til ex2(6)");
//		System.out.println(ex2(6));
//		System.out.println();

//		System.out.println("Kald til ex3(6)");
//		System.out.println(ex3(6));
//		System.out.println();

	}

}

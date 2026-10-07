package eksempel;

public class Triangle {

	public static int areal(int bredde) {
		int result;
		if (bredde == 1) {
			result = 1;
		} else {
			result = bredde + areal(bredde - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(areal(4));

	}

}

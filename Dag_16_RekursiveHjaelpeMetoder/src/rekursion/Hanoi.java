/*
 * 
 */
package rekursion;

/**
 * @author mad
 */
public class Hanoi {

	public static void flyt(int n, int fra, int til){
		if (n==1) {
			System.out.println("Flyt fra " +fra +" til " + til);

		}
		else {
			int temp = 6 - fra - til;
			flyt(n-1,fra,temp);
			System.out.println("Flyt fra " + fra +" til " + til);
			flyt(n-1,temp,til);
		}
	}

	public static void main(String[] args) {
			flyt(4,1,3);
	}

}

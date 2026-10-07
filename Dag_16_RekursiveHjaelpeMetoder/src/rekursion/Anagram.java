package rekursion;

import java.util.ArrayList;

public class Anagram {

	public static void main(String[] args) {

		System.out.println(permutation("kat"));

	}

	private static ArrayList<String> permutation(String str) {
		ArrayList<String> result = new ArrayList<>();
		if (str.length() == 1) {
			result.add(str);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String shorter = str.substring(0, i) + str.substring(i + 1);
				ArrayList<String> shorterPermutations = permutation(shorter);
				for (String s : shorterPermutations) {
					result.add(str.charAt(i) + s);
				}
			}
		}
		return result;
	}

}

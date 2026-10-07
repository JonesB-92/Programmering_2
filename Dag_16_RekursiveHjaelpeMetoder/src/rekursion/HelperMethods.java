package rekursion;

import java.util.ArrayList;

public class HelperMethods {
	public static int sum1(ArrayList<Integer> list) {
		int result;
		if (list.size() == 0) {
			result = 0;
		} else {
			result = list.get(0);
			list.remove(0);
			result = result + sum(list);
		}
		return result;
	}

	public static int sum(ArrayList<Integer> list) {
		return sum(list, 0);
	}

	// Rekursiv hjælpemetode med de nødvendige parametre
	
	private static int sum(ArrayList<Integer> list, int index) {
		int result;
		if (index == list.size()) {
			result = 0;
		} else {
			result = list.get(index) + sum(list, index + 1);
		}
		return result;
	}




	public static int length(ArrayList<Integer> list) {
		return length(list, 0);
	}

	// Rekursiv hjælpemetode med de nødvendige parametre
	private static int length(ArrayList<Integer> list, int index) {
		int result;
		if (index == list.size()) {
			result = 0;
		} else {
			result = 1 + length(list, index + 1);
		}
		return result;

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(10);
		list.add(17);
		list.add(4);
		list.add(8);
		list.add(45);
		list.add(29);
		System.out.println(list);
		System.out.println("sum: " + sum(list));
		System.out.println("length: " + length(list));

		System.out.println(list);
	}

}

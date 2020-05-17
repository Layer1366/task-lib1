package com.neofleksjob.tasklibsearch;

public class TaskLibSearch {
	public static void binarySearchArrayPositiveInteger(int[] array, int item) {
		int first = 0;
		int last = array.length - 1;
		int position = (first + last) / 2;

		while ((array[position] != item) && (first <= last)) {
			if (array[position] > item) {
				last = position - 1;
			} else {
				first = position + 1;
			}
			position = (first + last) / 2;
		}
		if (first <= last) {
			System.out.println(item + " является " + position + " элементом в массиве");
		} else {
			System.out.println("Элемент не найден в массиве.");
		}
	}
}

package ru.job4j.array;

import java.util.Arrays;
/**
 * Class ArrayDuplicate.
 * @author ypak
 * @version $id$
 * @since 0.1
 */

public class ArrayDuplicate {
/**
 * method remove for delete duplicates.
 * @param array array with duplicates.
 * @return array without duplicates.
 */
	public String[] remove(String[] array) {
		int n = array.length;
		int sum = 0;
		for (int i = 0; i < n - sum - 1; i++) {
			String origin = array[i];
			for (int j = i + 1; j < n - sum; j++) {
			if (array[j].equals(origin)) {
			array[j] = array[n - sum - 1];
			sum++;
			array[n - 1] = origin;
			}
			}
		}
		return Arrays.copyOf(array, n - sum);
	}
}

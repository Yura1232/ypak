package ru.job4j.array;

/**
 * Class BubbleSort.
 * @author ypak
 * @version $id$
 * @since 10.06
 */

public class BubbleSort {
	/**
	 * method sort sort methodom puzirka.
	 * @param array - массив чисел.
	 * @return массив.
	 */
	public int[] sort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}

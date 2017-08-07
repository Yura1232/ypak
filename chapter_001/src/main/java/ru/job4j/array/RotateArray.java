package ru.job4j.array;

/**
 * Class RotateArray.
 * @author ypak
 * @version $id$
 * @since 0.1
 */

public class RotateArray {
	/**
	 * rotate array.
	 * @param array - initial array.
	 * @return mas - rotate array.
	 */
	public int[][] rotate(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int tmp = array[i][j];
				array[i][j] = array[array.length - j - 1][i];
				array[array.length - j - 1][i] = array[array.length - i - 1][array.length - j - 1];
				array[array.length - i - 1][array.length - j - 1] = array[j][array.length - i - 1];
				array[j][array.length - i - 1] = tmp;
			}
		}
		return array;
	}
}
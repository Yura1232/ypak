package ru.job4j.array;

/**
 * Class Turn.
 *
 * @author ypak
 * @version $Id$
 * @since 16.05
 */
public class Turn {
	/**
	 * method back переворачивает массив.
	 * @param array - массив чисел.
	 * @return массив.
	 */
	public int[] back(int[] array) {
        int indexst = 0;
		int indexdown = array.length - 1;
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[indexst];
        	array[indexst] = array[indexdown];
        	array[indexdown] = temp;
        	indexst++;
        	indexdown--;
		}
        return array;
    }
}
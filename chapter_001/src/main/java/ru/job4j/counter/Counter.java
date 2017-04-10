package ru.job4j.counter;

/**
 * Class Counter сумма чётных числе в диапазоне.
 *
 * @author ypak
 * @version $Id$
 * @since 22.03
 */
public class Counter {
	/**
	 * метод add выполняет подсчёт чётных элементов в диапазоне.
	 * @param start - начало.
	 * @param finish - конец.
	 * @return sum - сумма чётных.
	 */
	public int add(int start, int finish) {
		int sum = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
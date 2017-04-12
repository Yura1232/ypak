package ru.job4j.loop;

/**
 * Class factorial вычисление факториала.
 *
 * @author ypak
 * @version $Id$
 * @since 22.03
 */
public class Factorial {
	/**
	 * method calc вычисялет факториал.
	 * @param n - положительное целое число.
	 * @return factorial - факториал числа n.
	 */
	public int calc(int n) {
		int factorial = 1;
		if (n == 0) {
			factorial = 1;
		} else {
			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
		}
		return factorial;
	}
}
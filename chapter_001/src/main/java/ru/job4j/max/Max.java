package ru.job4j.max;

/**
 * Max.
 *
 * @author ypak
 * @version $Id$
 * @since 0.1
 */
public class Max {
	/**
	* max метод который возвращает максимальное из 2-х чисел.
	* @param first первый аргумент.
	* @param second второй аргумент.
	* @return если first больше second тогда first иначе second.
	*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	/**
	 * max максимальное из 3-х чисел.
	 * @param first первый аргумент.
	 * @param second второй аргумент.
	 * @param third третий аругмент.
	 * @return максимальное из трёх чисел.
	 */
	public int max(int first, int second, int third) {
		Max max = new Max();
		return max.max(max.max(first, second), third);
	}
}
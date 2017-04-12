package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ClassTest.
 *
 * @author ypak
 * @version $Id$
 * @since 22.03
 */
public class FactorialTest {
	/**
	* Test.
	*/
	@Test
	/**
	* Test проверяющий, что факториал для числа 5 равен 120.
	*/
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(5);
		int expected = 120;
		assertThat(result, is(expected));
	}
	/**
	* Test.
	*/
	@Test
	/**
	* Test проверяющий, что факториал для числа 0 равен 1.
	*/
	public void whenCalculateFactorialForZeroThenOne() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(0);
		int expected = 1;
		assertThat(result, is(expected));
	}
}
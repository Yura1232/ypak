package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
  * Test.
  *
  * @author ypak
  * @version $Id$
  * @since 0.1
  */
public class MaxTest {
	/**
	* Test.
	*/
	@Test
	/**
	* Test max максимум из 2-х чисел.
	*/
	public void whenMaxTwoMoreThenOneThenTwo() {
		Max max = new Max();
		int result = max.max(2, 1);
		assertThat(result, is(2));
	}
}

package ru.job4j.counter;

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
public class CounterTest {
	/**
	* Test.
	*/
	@Test
	/**
	* Test counter сумма чётных числе в диапазоне.
	*/
	public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter counter = new Counter();
		int result = counter.add(1, 10);
		int expected = 30;
		assertThat(result, is(expected));
	}
}

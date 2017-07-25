package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test Class ArrayDupclicate.
 * @author ypak
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
	/**
	 * Test.
	 */
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate rm = new ArrayDuplicate();
		String[] expected = new String[]{"Hello", "Hi", "Hello", "Morning"};
		String[] result = new String[]{"Hello", "Hi", "Morning"};
		rm.remove(expected);
		assertThat(expected, is(result));
	}
}
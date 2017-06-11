package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
 /**
  * Test.
  * @author ypak
  * @version $Id$
  * @since 0.1
  */
 public class BubbleSortTest {
    /**
     * Test.
     */
    @Test
    public void whenSourceArrayThenSortArray() {
        BubbleSort sort = new BubbleSort();
	      int[] expected = {4, 1, 6, 2};
        int[] result = {1, 2, 4, 6};
	      sort.sort(expected);
        assertThat(expected, is(result));
    }
}
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
 public class TurnTest {
    /**
     * Test.
     */
    @Test
    public void whenSourceArrayIsEvenThenTurnedArray() {
        Turn turn = new Turn();
	    int[] expected = {4, 1, 6, 2};
        int[] result = {2, 6, 1, 4};
	    turn.back(expected);
        assertThat(expected, is(result));
    }
    /**
     * Test.
     */
     @Test
    public void whenSourceArrayIsOddThenTurnedArray() {
        Turn turn = new Turn();
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = {5, 4, 3, 2, 1};
	    turn.back(expected);
        assertThat(expected, is(result));
    }
}
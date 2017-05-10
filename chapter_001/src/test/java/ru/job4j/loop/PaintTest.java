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
public class PaintTest {
	/**
	* Test.
	*/
	@Test
	/**
	* Test для h = 2.
	*/
 	public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected =  " ^\n^^^";
        assertThat(result, is(expected));
    }
	/**
	* Test.
	*/
	@Test
	/**
	* Test для h = 3.
	*/
 	public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = "  ^\n ^^^\n^^^^^";
        assertThat(result, is(expected));
    }
}
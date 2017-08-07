package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test class RotateArray.
 * @author ypak
 * @version $id$
 * @since 0.1
 */
public class RotateArrayTest {
	/**
	 * Test.
	 */
	@Test
	public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray ra = new RotateArray();
		int[][] expected = {{1, 2}, {3, 4}};
		int[][] result = {{3, 1}, {4, 2}};
		ra.rotate(expected);
		assertThat(expected, is(result));
	}
	/**
	 * Test.
	 */
	@Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
    	RotateArray ra = new RotateArray();
		int[][] expected = new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int[][] result = new int[][] {
			{7, 4, 1},
			{8, 5, 2},
			{9, 6, 3}
		};
		ra.rotate(expected);
		assertThat(expected, is(result));
    }
}
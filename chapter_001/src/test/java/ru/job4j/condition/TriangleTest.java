package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

 /**
  * Test.
  *
  * @author ypak
  * @version $Id$
  * @since 0.1
  */
 public class TriangleTest {
 	/**
 	 * Test.
 	 */
 	@Test
 	/**
 	* Test triangle .
 	*/
 	public void whenInputThreeCoordinateThenTriangleArea() {
 		Triangle triangle = new Triangle(new Point(1, 1), new Point(2, 2), new Point(3, 1));
 		double result = triangle.area();
 		double expected = 1D;
 		assertThat(result, closeTo(expected, 0.01));
 	}
 }
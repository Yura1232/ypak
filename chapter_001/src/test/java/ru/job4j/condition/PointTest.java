package ru.job4j.condition;

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
 public class PointTest {
 	/**
 	 * Test.
 	 */
 	@Test
 	/**
 	* Test point описание точки с системе координат.
 	*/
 	public void whenX1Y3ThenPointEntersA2B1() {
 		Point point = new Point(1, 3);
 		boolean expected = true;
 		boolean result = point.is(2, 1);
 		assertThat(result, is(expected));
 	}
 }
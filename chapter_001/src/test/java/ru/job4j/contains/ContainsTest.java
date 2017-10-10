package ru.job4j.contains;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test .
 *
 * @author ypak.
 * @version $Id$
 * @since 0.1.
 */

public class ContainsTest {
    /**
     * Test.
     */
    @Test
    /**
     * Test.
     */
    public void whenOneWordContainOtherWord() {
        Contains contains = new Contains();
        String word = "Привет";
        String part = "иве";
        boolean result = contains.contains(word, part);
        assertThat(result, is(true));
    }
}
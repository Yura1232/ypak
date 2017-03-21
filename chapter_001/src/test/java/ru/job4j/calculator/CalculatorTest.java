package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author ypak
 * @version $Id$
 * @since 18.03.17
 */
public class CalculatorTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Test add сложение.
     */
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test substruct вычитание.
     */
    public void whenSubstructFourMinusTwoThenTwo() {
    	Calculator calc = new Calculator();
        calc.substruct(4D, 2D);
    	double result = calc.getResult();
    	double expected = 2D;
    	assertThat(result, is(expected));
    }
    /**
     * Test div деление.
     */
    public void whenDivFourDivideTwoThenTwo() {
    	Calculator calc = new Calculator();
        calc.div(4D, 2D);
    	double result = calc.getResult();
    	double expected = 2D;
    	assertThat(result, is(expected));
    }
    /**
     * Test multiple умножение.
     */
    public void whenMultipleFourMultipleTwoThenEight() {
    	Calculator calc = new Calculator();
        calc.div(4D, 2D);
    	double result = calc.getResult();
    	double expected = 8D;
    	assertThat(result, is(expected));
    }
}
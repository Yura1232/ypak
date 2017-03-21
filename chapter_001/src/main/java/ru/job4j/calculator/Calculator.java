package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author ypak
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
	/**
     * result переменная результат.
     */
    private double result;
    /**
     * add.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void add(double first, double second) {
    	this.result = first + second;
    }
    /**
     * substurct.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void substruct(double first, double second) {
    	this.result = first - second;
    }
    /**
     * div.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void div(double first, double second) {
    	this.result = first / second;
    }
    /**
     * multiple.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void multiple(double first, double second) {
    	this.result = first * second;
    }
    /**
     * getResult.
     * @return результат.
     */
    public double getResult() {
        return this.result;
    }
}
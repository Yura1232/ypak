package ru.job4j.condition;

/**
 * Class Point положение точки.
 *
 *@author ypak
 *@version $Id$
 *@since 22.03
 */
public class Point {
	/**
	 * coordinate x.
	 */
	private int x;
	/**
	 * coordinate y.
	 */
	private int y;
	/**
	* method Point.
	* @param x coordinate.
	* @param y coordinate.
	*/
	public  Point(int x, int y) {
    	this.x = x;
    	this.y = y;
  	}
  	/**
  	 * method getX полочение координаты x.
  	 * @return возвращает координату x.
  	 */
  	public int getX() {
    	return this.x;
  	}
    /**
  	 * method getY полочение координаты y.
  	 * @return возвращает координату y.
  	 */
  	public int getY() {
    	return this.y;
  	}
  	/**
  	 * method is определяет находится ли точка на этой фукнции.
  	 * @param a - угловой коэффициент.
  	 * @param b - свободный член.
  	 * @return возвращает функцию опрделяющую положение точки.
  	 */
  	public boolean is(int a, int b) {
  		return (this.y == (this.x * a + b));
  	}
}
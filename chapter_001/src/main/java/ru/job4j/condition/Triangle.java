package ru.job4j.condition;

/**
 * Class Triangle для вычисление площади треугольника.
 *
 * @author ypak
 * @version $Id$
 * @since 22.03
 */
public class Triangle {
	/**
	 * положение точки а.
	 */
	private Point a;
	/**
	 * положение точки b.
	 */
	private Point b;
	/**
	 * положение точки c.
	 */
	private Point c;
	/**
	 * method Triangle описание треугольние.
	 * @param a - координаты точки а.
	 * @param b - координаты точки b.
	 * @param c - координаты точки с.
	 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	 * method area вычисление площади.
	 * @return площадь треугольника.
	 */
	public double area() {
	double square = 0.5D * ((b.getX() - a.getX()) * (c.getY() - a.getY()) - (b.getY() - a.getY()) * (c.getX() - a.getX()));
	return square >= 0D ? square : -square;
}

}
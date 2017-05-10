package ru.job4j.loop;

/**
 * Class paint stroit piramidu.
 *
 * @author ypak
 * @version $Id$
 * @since 22.03
 */
public class Paint {
	/**
	 * method piramid рисует пирамиду в псевдографике.
	 * @param h - висота.
	 * @return сторку.
	 */
	public String piramid(int h) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= h; i++) {
            for (int imbedded = 0; imbedded < h - i; imbedded++) {
                builder.append(" ");
            }
            builder.append("^");
            for (int j = 1; j < i * 2 - 1; j++) {
                builder.append("^");
            }
            if (i < h) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
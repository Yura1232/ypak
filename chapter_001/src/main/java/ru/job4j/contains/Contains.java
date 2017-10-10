package ru.job4j.contains;

/**
 * contains.
 *
 * @author ypak.
 * @version $Id$
 * @since 0.1
 */

public class Contains {
    /**
     * contains.
     * @param word - full word.
     * @param part - part of word.
     * @return result.
     */
    public boolean contains(String word, String part) {
        char[] first = word.toCharArray();
        char[] second = part.toCharArray();
        boolean result = false;
        for (int i = 0; i <  first.length; i++) {
            int j = 0;
            while (second[j] ==  first[i]) {
                j++;
                i++;
                if (j == second.length || i ==  first.length) {
                    break;
                }
            }
            if (j == second.length) {
                result = true;
                break;
            }
        }
        return result;
    }
}
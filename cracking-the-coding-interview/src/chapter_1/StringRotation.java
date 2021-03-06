/**
 *
 */
package chapter_1;

/**
 * Question 1.9: Assume you have a method isSubstring which checks if one word
 * is a substring of another. Given two strings s1 and s2, write code to check
 * if s2 is a rotation of s1 using only one call to isSubstring.
 * <p>
 * EXAMPLE
 * <p>
 * erbottlewat is a rotation of waterbottle.
 *
 * @author Sudharsanan Muralidharan
 */
public class StringRotation {

    /**
     * Checks if a string is a rotation of the other. Book solution.
     * <p>
     * Time Complexity: O(n)
     *
     * @param s1
     * @param s2
     * @return isRotation
     */
    public boolean isStringRotation(String s1, String s2) {

        // check if they are of equal length
        if (s1.length() == s2.length()) {
      /*
       * String s1 can be obtained by breaking s2 into x and y and rearranging
       * them. s1 = xy, s2 = yx. We check whether s1 + s1 which is xyxy contains
       * yx.
       */
            String s1twice = s1 + s1;
            return isSubSubstring(s1twice, s2);
        }

        return false;
    }

    /**
     * Checks if one string is substring of another
     *
     * @param s1
     * @param s2
     * @return isSubstring
     */
    private boolean isSubSubstring(String s1, String s2) {
        String longer = (s1.length() > s2.length()) ? s1 : s2;
        String shorter = (s1.length() > s2.length()) ? s2 : s1;

        return longer.toLowerCase().contains(shorter.toLowerCase());
    }
}

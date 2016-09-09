package org.mureinik.jawat.concat;

/**
 * An example of "concatenating" Strings to chars
 *
 * @author Allon Mureinik
 */
public class FunWithString_Example3 {
    public static void main(String[] args) {
        String str = "Reversim";

        // chars are just glorified ints.
        // So first '1' (49) and '6' (54) are added (since it's a + operator between two ints,
        // and we get 103
        // Then, since we have an int and a String, the int is converted to a String using String.valueOf
        // and concatenated to the following String.
        str = '1' + '6' + str ;
        
        System.out.println(str);
    }
}

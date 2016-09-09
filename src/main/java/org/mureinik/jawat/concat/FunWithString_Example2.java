package org.mureinik.jawat.concat;

/**
 * An example of concatenating chars to Strings
 *
 * @author Allon Mureinik
 */
public class FunWithString_Example2 {
    public static void main(String[] args) {
        String str = "Reversim";

        // chars are converted to Strings using String.valueOf
        str = str + '1' + '6';
        
        System.out.println(str);
    }
}

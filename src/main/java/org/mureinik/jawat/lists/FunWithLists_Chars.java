package org.mureinik.jawat.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * An example to display how a {@code List<String>} can be used
 *
 * @author Allon Mureinik
 */
public class FunWithLists_Chars {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        // This is a List<Character>.
        // The char literals are autoboxed to Characters, and List#add(T) is called.
        list.add('D');
        list.add('C');
        list.add('Z');

        // A char is essentially a small int.
        // 'Z' is promoted to the int 90, and List#remove(int) is called
        list.remove('Z');

        System.out.println(list);
    }
}

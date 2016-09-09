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
        list.add('R');
        list.add('S');
        list.add('2');

        // A char is essentially a small int.
        // 'S' is promoted to the int 83, and List#remove(int) is called
        list.remove('S');

        System.out.println(list);
    }
}

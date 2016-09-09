package org.mureinik.jawat.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * An example to display how a {@code List<String>} can be used
 *
 * @author Allon Mureinik
 */
public class FunWithLists_Strings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // This is a List<String> so List#add(T) is called.
        list.add("Reversim");
        list.add("Summit");
        list.add("2016");

        // Strings are Objects, so List#remove(Object) is called
        list.remove("Summit");

        System.out.println(list);
    }
}

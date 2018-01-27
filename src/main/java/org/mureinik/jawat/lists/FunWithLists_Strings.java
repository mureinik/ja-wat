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
        list.add("Dev");
        list.add("Conf");
        list.add("CZ");
        list.add("2018");

        // Strings are Objects, so List#remove(Object) is called
        list.remove("CZ");

        System.out.println(list);
    }
}

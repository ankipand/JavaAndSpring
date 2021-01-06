package com.person.learning.Excersise.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConvertfromArraytoSet {
public static void main(String[] args) {

    String[] array = {"a", "b", "c"};
    Set<String> set1 = new HashSet<>(Arrays.asList(array));

    System.out.println("Set: " + set1);
    
    Set<String> set = new HashSet<>();
    set.add("a");
    set.add("b");
    set.add("c");

    String[] array1 = new String[set.size()];
    set.toArray(array1);

}
}

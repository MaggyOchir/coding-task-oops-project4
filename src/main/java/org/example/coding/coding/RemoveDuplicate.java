package org.example.coding.coding;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//How can you remove all duplicates from ArrayList?
public class RemoveDuplicate {
    public static void main(String[] args) {
    List<String> duplicate=new ArrayList<>();
        duplicate.add("Apple");
        duplicate.add("Orange");
        duplicate.add("Banana");
        duplicate.add("Watermelon");
        duplicate.add("Orange");
        duplicate.add("Grape");
        duplicate.add("Blueberry");
        duplicate.add("Blueberry");
        Set<String> noDuplicate=new LinkedHashSet<>(duplicate);
        System.out.println(noDuplicate);


}}

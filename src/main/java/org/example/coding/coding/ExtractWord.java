package org.example.coding.coding;

import java.util.*;

//You have a list of strings and you want to keep only those that start with
//“A” and you want to return them in lower case"
public class ExtractWord {
    public static void main(String[] args) {
        List<String>str=new ArrayList<>();
        str.add("Apple");
        str.add("Orange");
        str.add("Banana");
        str.add("Watermelon");
        str.add("Orange");
        str.add("Grape");
        str.add("Blueberry");
        str.add("Anna");
        Set<String> wordA=new LinkedHashSet<>(str);
        wordA.removeIf(x->!x.startsWith("A"));
           System.out.println(wordA);
        } //lowerCase ruu huvirgaj chadaagui.

    }

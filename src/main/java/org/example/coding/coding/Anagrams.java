package org.example.coding.coding;

import java.util.Arrays;

//Check if Two Strings are Anagrams: Given two strings, determine if they
//are anagrams, meaning they contain the same characters in a different order.
//For example, "listen" and "silent" are anagrams.
public class Anagrams {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "act";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sorted1 = Arrays.toString(c1);
        String sorted2 = Arrays.toString(c2);
        if (sorted1.equals(sorted2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("non-anagrams");
        }
    } //uuruu hiigeegui tul sain tseejil
}
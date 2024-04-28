package org.example.coding.coding;
//Create a method to count how many vowels are present in a string
//“documentation”
public class CountVowels {
    public static void main(String[] args) {
        //String str="documentation";
        String str="Uuchee";
        System.out.println(str.replaceAll("[^aeiouAEIOU]","").length());
        }
    }
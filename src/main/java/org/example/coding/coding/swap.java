package org.example.coding.coding;

public class swap {
    //Write a program to swap 2 String without a temporary variable?
    public static void main(String[] args) {
        String str1="teacher";
        String str2="student";
        System.out.println(str1);
        System.out.println(str2);
        str1=str1+str2;
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println(str1);
        System.out.println(str2);
        //oilgosongui

    }
}

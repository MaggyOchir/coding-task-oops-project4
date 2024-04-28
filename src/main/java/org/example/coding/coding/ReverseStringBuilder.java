package org.example.coding.coding;

//Reverse a String: Write a function to reverse a given string. For example,
//given the input "Hello", the output should be "olleH".
public class ReverseStringBuilder {
    public static void main(String[] args) {
        String str = "Welcome to Java World";
       StringBuilder reversedStr= new StringBuilder(str);
       reversedStr.reverse();
        System.out.println(reversedStr);
    }
    }
package org.example;

//Reverse a String: Write a function to reverse a given string. For example,
//given the input "Hello", the output should be "olleH".
public class ReverseStringLoop {
    public static void main(String[] args) {

        String str = "Welcome to Java World";
       for(int i=str.length()-1; i>=0; i--){
        System.out.print(str.charAt(i));
        }
    }
}
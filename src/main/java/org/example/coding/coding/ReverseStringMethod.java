package org.example;

//Reverse a String: Write a function to reverse a given string. For example,
//given the input "Hello", the output should be "olleH".
public class ReverseStringMethod {
  void reverseWord(String s){
        for(int i=s.length()-1; i>=0; i--){
      System.out.print(s.charAt(i));   }}
    public static void main(String[] args) {
    ReverseStringMethod r=new ReverseStringMethod();
        r.reverseWord("Munkhmandakh");

        }
    }

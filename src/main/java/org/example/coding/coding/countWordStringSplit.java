package org.example;
//Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2.
public class countWordStringSplit {
    public static void main(String[] args) {
        String str="Maggy try harder so you will get a good job";
        String []words=str.split(" ");
        System.out.println(words.length);

}}

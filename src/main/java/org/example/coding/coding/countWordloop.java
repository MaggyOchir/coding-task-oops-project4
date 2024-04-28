package org.example;
//Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2.
public class countWordloop {
    public static void main(String[] args) {
        String str="Lucky is a good boy";
        String []words=str.split(" "); //ug tus bureer n salgaj array luu hurvyylne.
        int count=0;
        for(int i=0; i<words.length; i++){
            count++;
        }
        System.out.println(count);
}}

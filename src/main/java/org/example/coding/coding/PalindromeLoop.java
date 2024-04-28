package org.example.coding.coding;
//Check if a String is Palindrome: Determine whether a given string is a
//palindrome, which means it reads the same forwards and backward. For
//example, "madam" is a palindrome.
public class PalindromeLoop {
    public static void main(String[] args) {
        String str = "cat";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        boolean palindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (reverse.charAt(i) == str.charAt(i)) {
                System.out.println("the word is a palindrome");
            } else {
                System.out.println("the word is not palindrome");
            }
        }
    }
}
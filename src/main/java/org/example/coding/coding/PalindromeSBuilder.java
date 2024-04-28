package org.example;
//Check if a String is Palindrome: Determine whether a given string is a
//palindrome, which means it reads the same forwards and backward. For
//example, "madam" is a palindrome.
public class PalindromeSBuilder {
    public static void main(String[] args) {
        String word="Maggy"; //үгээ оноолоо
        StringBuilder str = new StringBuilder(word);//onooson ugee Sbuilder luu shiljuullee.
        str.reverse();//ugee uhraaj bichlee
        String reversed=str.toString();//ehnii ugee reverse gedeg string-d onooloo

        if (reversed.equals(word)) {//uhraasan ug ehnii ugteigee ijil esehiig shalgaj bna.
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
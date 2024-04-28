package org.example;
//Check if a String is Palindrome: Determine whether a given string is a
//palindrome, which means it reads the same forwards and backward. For
//example, "madam" is a palindrome.
public class PalindromeSBMethod {
    void palindrome(String str){
        StringBuilder word=new StringBuilder(str);
        word.reverse();
       String reverseWord= word.toString();
        if(reverseWord.equals(str)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeSBMethod p=new PalindromeSBMethod();

        p.palindrome("mom");
    }

    }

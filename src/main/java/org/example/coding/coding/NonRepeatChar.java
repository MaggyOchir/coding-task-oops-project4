package org.example.coding.coding;
//Find the First Non-Repeating Character in a String: Given a string, find and
//return the first non-repeating character. For example, in the string
//"abracadabra", the first non-repeating character is 'c'.
public class NonRepeatChar {
    public static void main(String[] args) {
        String noRepeat = "abracadabra";
        for (int i = 0; i < noRepeat.length(); i++) {
            int count = 0;
            for (int j = 0; j < noRepeat.length(); j++) {
                if (noRepeat.charAt(i) == noRepeat.charAt(j)) {
                    count++;
                }}
                if (count == 1) {
                    System.out.print(noRepeat.charAt(i));
                    break;
                }
            }//uuruu hiigeegui.
        }
    }
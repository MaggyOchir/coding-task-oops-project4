package org.example.coding.coding;
//Find out how many alpha characters are present in a string?
public class AlphaCharString {
    public static void main(String[] args) {
        String fullName = "MunkhMandakh OchirSHarav";
        String alphaChar=fullName.replaceAll("[^A-Z]","");
        System.out.println(alphaChar.length());
    }
}






       /* String str ="Hello World";
      char c='x';
      int upperCase=0;
        for(int i=0; i<str.length();i++) {
            c = str.charAt(i);
            if (Character.isUpperCase(c)){
            upperCase++;}
        }
            System.out.println(upperCase);
        }*/

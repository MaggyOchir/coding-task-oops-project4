package org.example;
//Find out how many alpha characters are present in a string?
public class AlphaCharLoop {
    public static void main(String[] args) {
        String fullName = "MunkhMandakh OchirSHarav";
        char c = 'x';
        int countUpper = 0;
        for (int i = 0; i < fullName.length(); i++) {
            c = fullName.charAt(i);
            if (Character.isUpperCase(c)) {
                countUpper++;
            }
        }
        System.out.println(countUpper);
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

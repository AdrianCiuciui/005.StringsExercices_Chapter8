package com.company;

public class Exercise3 {

    private int matches;
    private String string;
    private  char c;


    public Exercise3(String string, char c) {
        this.matches = 0;
        this.string = string;
        this.c = c;
    }

//    the recursion method - it doesn't work
//    private void checkStringContent (String stringToCheck) {
//
//        while (stringToCheck != null) {
//            int index = stringToCheck.indexOf(""); // stuck here
//            if (index == -1) {
//                stringToCheck = null;
//            }
//            else {
//                this.matches++;
//                checkStringContent(stringToCheck.substring(index));
//            }
//        }
//    }

    public void printResults () {
        matches = string.replaceAll("[^" + c +"]", "").length();
        System.out.println("The string '" + this.string + "' has '" + this.c + "' this many times:");
        System.out.println("Number of occurrences: " + this.matches);
    }

    public void setString(String string) {
        this.string = string;
    }

}
//3. Exercise checkForCharacterCount: Write a method which takes a String
//and a char as input ( two parameters ) and checks how many times the
//char appears in the String parameter; For example:
//
//        Enter a String: testing
//        Enter a char: 't'
//        Count: 2

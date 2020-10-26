package com.company;

public class Exercise6 {

//  6. Exercise searchAndReplace: Write a method which takes a String parameter and two char parameters and returns a String based on the following:
//
//  The method should search for char1 and replace it with char2 in the String parameter.
//  Example: You have the String "aminoamfetamine" which replaces all the "m" chars with "x" char.
//
//  Parameter String - the String in which you want to find a character and replace it with another character
//  Parameter char1 - the character which you want to replace
//  Parameter char2 - the character with which you want to replace char1

    private final String string;
    private final char cToFind;
    private final char cToReplace;
    private String changedString;

    public Exercise6(String string, char cToFind, char cToReplace) {
        this.string = string;
        this.cToFind = cToFind;
        this.cToReplace = cToReplace;
        this.changedString = string;
    }

    public void printResults (){
        System.out.println("The entered string is [" + string + "]. Now changing all " + cToFind + "'s to " + cToReplace + "'s.");
        processString();
        if (string.indexOf(cToFind) < 0) {
            System.out.println("Cannot find no occurrence of " + cToFind);
        } else {
            System.out.println("The new (processed) string is: " + changedString);
        }
    }

    private void processString () {
        changedString = changedString.replaceAll("[" + cToFind + "]", "" + cToReplace + "");
    }
}

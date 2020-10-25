package com.company;

public class Exercise5 {

//    Exercise captainCrunchDecode: Write a method which takes a String parameter and returns a String following the decoding rules
//
//    The Captain Crunch decoder ring works by taking each letter in a string and adding 13 to it.
//    For example, ’a’ becomes ’n’ and ’b’ becomes ’o’. The letters “wrap around” at the end, so ’z’ becomes ’m’.
//    Write a method that takes a String and that returns a new String containing the encoded version.
//    You should assume that the String contains upper and lower case letters, and spaces, but no other punctuation.
//        Lower case letters should be transformed into other lower case letters; upper into upper.
//    You should not encode the spaces.

    private final int encryptionAmount;
    private final String string;
    private String codedString;

    public Exercise5(String string) {
        this.string = string;
        this.encryptionAmount = 13;
        this.codedString = "";
        System.out.println("The inputted String is [" + string + "]");
    }

    public void printResult() {
        processString();
        if (this.codedString == null) System.out.println("Null string ");
        else System.out.println("The result of encrypting is: [" + this.codedString + "]");
    }

    private void processString() {
        int index = 0;
        while (index < this.string.length()) {
            char c = this.string.charAt(index);
            int value = this.string.charAt(index);

            if (Character.isLowerCase(c)) {
                if (value + this.encryptionAmount > 122) {
                    this.codedString += (char) (((value + this.encryptionAmount) % 122) + 96);
                } else {
                    this.codedString += (char) (value + this.encryptionAmount);
                }
            } else if (Character.isUpperCase(c)) {
                if (value + this.encryptionAmount > 90) {
                    this.codedString += (char) (((value + this.encryptionAmount) % 90) + 64);
                } else {
                    this.codedString += (char) (value + this.encryptionAmount);
                }
            } else {
                this.codedString += c;
            }
            index++;
        }
    }
}

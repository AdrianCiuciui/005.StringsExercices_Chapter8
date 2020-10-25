package com.company;

public class Exercise2 {

    private int vowels;
    private int digits;
    private String string;
    private final char[] vowelsArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    private final int[] numbersArray= {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    private String stringWithoutWhitespace;

    public Exercise2(String string) {
        this.string = string;
        vowels = 0;
        digits = 0;
        stringWithoutWhitespace = this.string.replaceAll("\\s", "");
    }

    private void checkStringContent () {
        // vowel selection area
        char[] characters = this.string.toCharArray();
        for (char c : characters) {
            for (char value : vowelsArray)
                if (value == c) {
                    this.vowels++;
                }
            }

        // digits selection area
        String numbersOnlyString = this.stringWithoutWhitespace.replaceAll("[^0-9]", ""); // String keeps only digits
        this.digits = numbersOnlyString.length();

        }

    public void printResults () {
        checkStringContent();
        System.out.println("The string '" + this.string + "' has:");
        System.out.println("Number of vowels: " + this.vowels + " (" +
                (double) ((this.vowels * 100) / stringWithoutWhitespace.length()) + "%)");
        System.out.println("Number of digits: " + this.digits + " ("+
                (double) ((this.digits * 100) / stringWithoutWhitespace.length()) + "%)");
    }

    public void setString(String string) {
        this.string = string;
    }
}

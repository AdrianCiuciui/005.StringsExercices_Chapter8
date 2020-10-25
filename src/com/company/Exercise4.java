package com.company;

public class Exercise4 {

    private String string;

    public Exercise4(String string) {
        this.string = string;
    }

    public void printResult () {
        if (isAbecedarian()) {
            System.out.println("the string '" + this.string + "' is abecedarian");
        }
        else {
            System.out.println("the string '" + this.string + "' is NOT abecedarian");
        }
    }

    private boolean isAbecedarian () {

    }
}

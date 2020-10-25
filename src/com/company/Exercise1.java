package com.company;

public class Exercise1 {

    String string;

    public Exercise1(String string) {
        this.string = string;
    }

    public String reverse() {
        System.out.println("The original name, '" + this.string + "' has been reversed into:");
        return new StringBuilder(this.string).reverse().toString();
    }
}

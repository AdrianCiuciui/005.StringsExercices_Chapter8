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
        if (this.string == null || this.string.length() < 2 || !compareCharacters(0)) {
            System.out.println("isAbecedarian false");
            return false;
        }
        else {
            System.out.println("isAbecedarian true");
            return true;
        }

    }

    private boolean compareCharacters (int index) {
        if (this.string.charAt(index - 1) == string.length()) return true;
        int compare = Character.compare(this.string.charAt(index), this.string.charAt(index+1));
        System.out.println("int compare value:" + compare);
        if (compare >= 0) {
            System.out.println("compare >= 0");
            return false;
        } else {
            System.out.println("compare < 0");
            compareCharacters(index + 1);
        }
        return true;
    }
}

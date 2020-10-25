package com.company;

public class Exercise4 {

    private String string;

    public Exercise4(String string) {
        this.string = string;
    }

    public void printResult () {
        if (isAbecedarian()) {
            System.out.println("The string '" + this.string + "' is abecedarian");
        }
        else {
            System.out.println("The string '" + this.string + "' is NOT abecedarian");
        }
    }

    private boolean isAbecedarian () {
        return this.string != null && this.string.length() >= 3 && compareCharacters();
    }

    private boolean compareCharacters () {
        int index = 0;
        while (index + 1 < this.string.length()) {

            int compare = Character.compare(this.string.charAt(index), this.string.charAt(index + 1));
            if (compare >= 0) {
                return false;
            } else {
                index++;
            }
        }
        return true;
    }

}

package com.company;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Random;

public class Exercise7 {
//    Ex1
//    public static void main(String[] args) {
//        System.out.println();
//        String str = "eeny";
//        str.concat(" meeny");                                      // problema e ca aici nu atribuie niciunde valoarea noua
//        StringBuilder stringBuilder = new StringBuilder(" miny");
//        stringBuilder.append(" mo");
//        System.out.println(str + stringBuilder);
//    }
//    Exercise 2
//    /** Question: What does this print and why ? **/
//    public static void main(String[] args) {
//        System.out.println();
//
//        System.out.print("H" + "a\n");
//        System.out.println((int)'H' + (int)'a');                  // aici am facut un test
//        System.out.println('H' + 'a');                            // aduna valoarea ASCII a caracterului, nu le concateneaza
//
//        System.out.print("2 + 2 = " + 2+2);
//    }
//    Exercise 3:
//    /** Question: What does this print ? **/
//    public static void main(String[] args) {
//        System.out.println();
//
//        String quote = "An *onion* a day keeps everyone away!";
//// match the word delimited by *'s
//        int startDelimit = quote.indexOf('*');
//        startDelimit += 1;                                                            //bugfix
//        int endDelimit = quote.lastIndexOf("*");
//        System.out.println(quote.substring(startDelimit, endDelimit));               // printeaza ce este intre '*'
//    }
//    Exercise 4:
//    /** What is the outcome of the following program ? **/
//    public static void main(String[] s) {
//        System.out.println();
//
//        String quote = "Never lend books-nobody ever returns them!";
//        String [] words = quote.split(" ", 2);                           // limit-ul pare ca nu functioneaza corect, are nevoie de +1 la valoarea sa.
//                                                                                    // Sau, poate, se refera la cate stringuri noi sa fie, asa are sens
//// split strings based on the delimiter " " (space)
//        for (String word : words) {                                                 // un enhanced for loop pentru a trece prin array-ul de stringuri 'words'
//            System.out.println(word);
//        }
//    }
//Exercise 5:
//The regex "\w+@\w+\.com" is used to match e-mail addresses in a string where the e-mail addresses end with a “.com” domain.
// Can you replace the regex with the following: "\w+@\w+.com" ?
//Note: Argument your answer!
//Answer: \. will accept only the '.' character.
// '.' - this in a regex means a different thing. It accepts any characters except linebreaks.
// This email would be valid in this case: asd@asdcom
//    Exercise 6:
//
//    Which of the following regular expressions is the correct expression for matching a mobile number stored in following format: +YY-XXXXXXXXXX (YY is the country code, the rest of the number is a mobile number)?
//    A.	 “\+\d{2}-\d{10}”
//    B.	 “\b\+\d{2}-\d{10}\b”
//    C.	 “+\d{2}-\d{10}”
//    D.	 “\b+\d{2}-\d{10}\b”
// Answer: A is correct
//    Exercise 3 (COMPILER)
//    /** Question: What is the problem here ? Print out the correct values (meaning the values of the characters themselves) **/
//    public static void main(String[] args) {
//        String letters = "ABC";
//        char[] numbers = {'1', '2', '3'};
//        String num = new String(numbers);                      // fixed here
//        System.out.println(letters + " easy as " + num);       // also changed to "num"
//    }
//    Exercise 4 (COMPILER)
//    /** Question: Make this code print className/class **/
//    Answer is in Ex6

//    Exercise 5 (Compiler)
//    private static final Random random = new Random();
//
//    public static void main(String[] args) {
//        System.out.println();
//        StringBuffer word;
//        switch(random.nextInt(3)) {
//            case 0:
//                word = new StringBuffer("P");
//                break;
//            case 1:
//                 word = new StringBuffer("G");
//                break;
//            default:
//                 word = new StringBuffer("M");
//                break;
//        }
//        word.append('a');
//        word.append('i');
//        word.append('n');
//        System.out.println(word);
//    }

//    Regex exercises
//
//1. Regex that matches the letter 'x'.
//  ([x])

//2. Regex that matches any character followed by 'x'.
//  ([\S]x)/gi

//3. Regex that matches words, where a word is a series of ASCII alphabetic characters.
// Match both upper- and lowercase.
// ?????

//4. Regex that matches a series of vowels (a, e, i, o, or u). Match both upper- and lowercase.
//  [aeiou]/gi

//5. Any four-letter sequence. The word may be embedded in another word.
// For example, matching on "This is a terrible test" would match "This", "terr", "ible", and "test".
// Match both upper- and lowercase.
//  \w{4}

//6. Any four-letter word, but do not allow them to be embedded in another word.
// For example, matching on "This is a terrible test" would match "This"and "test".
// Match both upper- and lowercase.
//


}

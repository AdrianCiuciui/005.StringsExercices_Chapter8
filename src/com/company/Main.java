package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
//    Exercise1 exercise1 = new Exercise1("Have a great and awesome day");
//    System.out.println(exercise1.reverse());

//    Exercise2 exercise2 = new Exercise2("adriantest149  AAAAAI  123 1 3123 123 12 123");
//    exercise2.printResults();

//        Exercise3 exercise3 = new Exercise3("xaxXXa 123123", 'x');
//        exercise3.printResults();

//        Exercise4 exercise43 = new Exercise4("adi");
//        Exercise4 exercise44 = new Exercise4("asddsa");
//        exercise43.printResult();
//        exercise44.printResult();

//        Exercise5 exercise5 = new Exercise5("x y z_a b c WXYZ_ABC");
//        exercise5.printResult();

        Exercise6 exercise6 = new Exercise6("aminoamfetamine", 'm', 'X');
        exercise6.printResults();
        System.out.println(exercise6.printClassName());
        Exercise6 exercise61 = new Exercise6("m", 'm', 'x');
        exercise61.printResults();
        System.out.println(exercise6.printClassName());


    }
}

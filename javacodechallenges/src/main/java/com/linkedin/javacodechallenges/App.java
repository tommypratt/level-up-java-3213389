package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isEven(int input) {
        return input % 2 == 0;
    }

    /*
     * code for odd or even main event
     * public static void main(String[] args) {
     * Scanner reader = new Scanner(System.in);
     * 
     * System.out.println("Please enter a number: ");
     * int input = reader.nextInt();
     * 
     * System.out.println("Is number even? " + isEven(input));
     * reader.close();
     * }
     */

    public static boolean isPasswordComplex(String input) {
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int input = reader.nextInt();

        System.out.println("Is number even? " + isEven(input));
        reader.close();
    }

}

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
        return input.length() >= 6
                && input.matches(".*\\d.*") // find number
                && input.matches(".*[a-z].*") // find lowercase
                && input.matches(".*[A-Z].*"); // find uppercase

        // long way vs regex way
        // int lower = 0, upper = 0, numeric = 0;

        // if (input.length() < 6)
        // return false;

        // for (char i : input.toCharArray()) {
        // if (Character.isUpperCase(i))
        // upper++;
        // else if (Character.isLowerCase(i))
        // lower++;
        // else if (Character.isDigit(i))
        // numeric++;
        // }

        // if (upper == 0 || lower == 0 || numeric == 0)
        // return false;

        // return true;
    }


    // public static void main(String[] args) {
    //     Scanner reader = new Scanner(System.in);

    //     System.out.println("Enter a Password: ");
    //     String input = reader.nextLine();

    //     System.out.println("Is the password complex? " + isPasswordComplex(input));
    //     reader.close();
    // }

    public static void main(String[] args) {
        DoubleOrNothing game = new DoubleOrNothing();
        game.playGame();

    }
}

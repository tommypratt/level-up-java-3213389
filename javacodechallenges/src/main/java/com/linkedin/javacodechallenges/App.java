package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int input = reader.nextInt();

        System.out.println("Is number even? " + IsEven(input));
        reader.close();
    }

    public static boolean IsEven(int input) {
        return input % 2 == 0;
    }
}

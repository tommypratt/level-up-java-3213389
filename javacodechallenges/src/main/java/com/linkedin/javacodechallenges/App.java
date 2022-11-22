package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        IsEven();

    }

    public static void IsEven() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int input = reader.nextInt();

        boolean output = input % 2 == 0;

        System.out.println("Is number even? " + output);
        reader.close();
    }
}

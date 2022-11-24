package com.linkedin.javacodechallenges;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = reader.nextLine();
        System.out.println("Word Score: " + wordScoreCalculator(input));
    }

    public static final Map<Character, Integer> letterPoints = Map.ofEntries(
            Map.entry('A', 1), Map.entry('B', 3), Map.entry('C', 3), Map.entry('D', 2),
            Map.entry('E', 1), Map.entry('F', 4), Map.entry('G', 2), Map.entry('H', 4),
            Map.entry('I', 1), Map.entry('J', 8), Map.entry('K', 5), Map.entry('L', 1),
            Map.entry('M', 1), Map.entry('N', 1), Map.entry('O', 1), Map.entry('P', 3),
            Map.entry('Q', 10), Map.entry('R', 1), Map.entry('S', 1), Map.entry('T', 1),
            Map.entry('U', 3), Map.entry('V', 4), Map.entry('W', 4), Map.entry('X', 8),
            Map.entry('Y', 1), Map.entry('Z', 10));

    public static int wordScoreCalculator(String word) {
        String normalised = word.toUpperCase();
        AtomicInteger wordScore = new AtomicInteger();

        normalised.chars()
                .filter(Character::isAlphabetic)
                .mapToObj(n -> (char) n)
                .forEachOrdered(letter -> {
                    if (letterPoints.containsKey(letter)) {
                        wordScore.getAndAdd(letterPoints.get(letter));
                    } else {
                        System.out.println("Looks like we need to add " + letter);
                    }
                });

        return wordScore.get();
    }
}

package com.linkedin.javacodechallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }

    public static double calculateAverageChangeInvested(List<Double> purchases) {
        return purchases.stream().mapToDouble(x -> Math.ceil(x) - x).average().orElse(0);
    }
}

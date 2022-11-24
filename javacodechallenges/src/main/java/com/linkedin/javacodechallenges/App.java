package com.linkedin.javacodechallenges;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        List<StoreItem> items = List.of(
                new StoreItem("T-shirt small", 10, .5),
                new StoreItem("T-shirt large", 20, .16),
                new StoreItem("T-shirt medium", 15, .5),
                new StoreItem("Shorts small", 100, .5),
                new StoreItem("Shorts large", 120, .16),
                new StoreItem("Shorts medium", 150, .125));

        Optional<StoreItem> leastExpensiveOpt = StoreItem.leastExpensiveItem(items);
        if (leastExpensiveOpt.isPresent()) {
            System.out.println(leastExpensiveOpt.get());
        }

    }
}

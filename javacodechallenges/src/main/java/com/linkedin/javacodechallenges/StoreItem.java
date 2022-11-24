package com.linkedin.javacodechallenges;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class StoreItem {
  String name;
  double price;
  double discount;

  public static Optional<StoreItem> leastExpensiveItem(Collection<StoreItem> items) {
    return items.stream().min(Comparator.comparing(StoreItem::calculateCurrentPrice));
  }

  private double calculateCurrentPrice() {
    return price - (price * discount);
  }

  @Override
  public String toString() {
    return "Name: " + name + ", Retail Price: " + price + ", Discount: " + discount;
  }

}

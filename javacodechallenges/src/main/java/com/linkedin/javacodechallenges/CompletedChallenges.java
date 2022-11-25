package com.linkedin.javacodechallenges;

import java.security.KeyStore.Entry;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Period;
import java.util.concurrent.atomic.AtomicInteger;

public class CompletedChallenges {
  // *********START CHALLENGE ODD OR EVEN
  // public static boolean isEven(int input) {
  // return input % 2 == 0;
  // }

  // public static void main(String[] args) {
  // Scanner reader = new Scanner(System.in);

  // System.out.println("Please enter a number: ");
  // int input = reader.nextInt();

  // System.out.println("Is number even? " + isEven(input));
  // reader.close();
  // }
  /***** END OF ODD OR EVEN */

  // ******START CHALLENGE PASSWORD COMPLEXITY */
  // public static boolean isPasswordComplex(String input) {
  // return input.length() >= 6
  // && input.matches(".*\\d.*") // find number
  // && input.matches(".*[a-z].*") // find lowercase
  // && input.matches(".*[A-Z].*"); // find uppercase

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
  // }

  // public static void main(String[] args) {
  // Scanner reader = new Scanner(System.in);

  // System.out.println("Enter a Password: ");
  // String input = reader.nextLine();

  // System.out.println("Is the password complex? " + isPasswordComplex(input));
  // reader.close();
  // }
  // ******END PASSWORD COMPLEXITY */

  // *******START CHALLENGE DOUBLE OR NOTHING */
  // public static void main(String[] args) {
  // DoubleOrNothing game = new DoubleOrNothing();
  // game.playGame();

  // }
  // ******END DOUBLE OR NOTHING */

  // *****START CHALLENGE CALCULATE WATER BILL */
  // public static double calculateWaterBill(double gallonsUsage)
  // {
  // double amountOwing = 18.84;
  // double ccf = gallonsUsage / 748;

  // if(ccf - 2 > 0)
  // {
  // amountOwing = (Math.ceil(ccf - 2)) * 3.90 + amountOwing;
  // }

  // return amountOwing;
  // }

  // public static void main(String[] args) {
  // Scanner reader = new Scanner(System.in);
  // System.out.println("How many gallons of water did you use this month?");
  // double usage = reader.nextDouble();
  // System.out.println("Your waterbill is $" + calculateWaterBill(usage));
  // reader.close();
  // }
  // ******END CALCULATE WATER BILL */

  // ******START CHALLENGE MODEL A PERSON */
  // public static void main(String[] args) {
  // Person p1 = new Person("Tommy", "Pratt", 27);
  // Person p2 = new Person("Gillian", "Dunn", 25);

  // p2.setAge(26);

  // p1.introduction();
  // }
  // ******END MODEL A PERSON */

  // *****START 100 DAYS FROM NOW */
  // public static void main(String[] args) {
  // LocalDate today = LocalDate.now(ZoneId.of("Australia/Sydney"));
  // System.out.println("100 days from now is " + oneHundredDaysFromNow(today));
  // }

  // public static LocalDate oneHundredDaysFromNow(LocalDate today) {
  // // can use calendar but java.time.* is better
  // // Calendar today = Calendar.getInstance();
  // // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  // // today.add(Calendar.DAY_OF_MONTH, 100);
  // // return sdf.format(today.getTime());

  // Period hundredDays = Period.ofDays(100);
  // return today.plus(hundredDays);
  // }
  // ******END 100 DAYS FROM NOW */

  /****** START CHALLENGE STUDENT VOLUNTEERS */
  // public static void main(String[] args) {
  // List<String> students = List.of("Tom", "Gill", "Josh", "Dean", "Sam");

  // Map<String, List<String>> attendeesMapping = Map.of(
  // "Farmers Market", List.of("Tom", "Gill", "Joey"),
  // "Car Wash", List.of("Josh", "Gill", "Dean"),
  // "Cooking Workshop", List.of("Tom"),
  // "Midnight Breakfast", List.of("Dean", "Sam"));

  // System.out.println(findStudentsWithIncompleteVolunteerEvents(students,
  // attendeesMapping));
  // }

  // public static List<String> findStudentsWithIncompleteVolunteerEvents(
  // List<String> students, Map<String, List<String>> attendeesMapping) {
  // List<String> incompleteVolunteerList = new ArrayList<String>();

  // for (String student : students) {
  // int counter = 0;
  // for (List<String> attendees : attendeesMapping.values()) {
  // if (attendees.contains(student))
  // counter++;
  // }

  // if (counter < 2)
  // incompleteVolunteerList.add(student);
  // }
  // return incompleteVolunteerList;
  // }
  // *******END OF STUDENT VOLUNTEERS */

  // ******START OF WORD SCORE CHALLENGE */
  // public static void main(String[] args) {
  // Scanner reader = new Scanner(System.in);
  // System.out.println("Enter a word: ");
  // String input = reader.nextLine();
  // System.out.println("Word Score: " + wordScoreCalculator(input));
  // }

  // public static final Map<Character, Integer> letterPoints = Map.ofEntries(
  // Map.entry('A', 1), Map.entry('B', 3), Map.entry('C', 3), Map.entry('D', 2),
  // Map.entry('E', 1), Map.entry('F', 4), Map.entry('G', 2), Map.entry('H', 4),
  // Map.entry('I', 1), Map.entry('J', 8), Map.entry('K', 5), Map.entry('L', 1),
  // Map.entry('M', 1), Map.entry('N', 1), Map.entry('O', 1), Map.entry('P', 3),
  // Map.entry('Q', 10), Map.entry('R', 1), Map.entry('S', 1), Map.entry('T', 1),
  // Map.entry('U', 3), Map.entry('V', 4), Map.entry('W', 4), Map.entry('X', 8),
  // Map.entry('Y', 1), Map.entry('Z', 10));

  // public static int wordScoreCalculator(String word) {
  // String normalised = word.toUpperCase();
  // AtomicInteger wordScore = new AtomicInteger();

  // normalised.chars()
  // .filter(Character::isAlphabetic)
  // .mapToObj(n -> (char) n)
  // .forEachOrdered(letter -> {
  // if (letterPoints.containsKey(letter)) {
  // wordScore.getAndAdd(letterPoints.get(letter));
  // } else {
  // System.out.println("Looks like we need to add " + letter);
  // }
  // });

  // return wordScore.get();
  // }
  // *******END OF WORD SCORE */
  // ********START CHALLENGE END OF YEAR SALE */
  // public static void main(String[] args) {
  // List<StoreItem> items = List.of(
  // new StoreItem("T-shirt small", 10, .5),
  // new StoreItem("T-shirt large", 20, .16),
  // new StoreItem("T-shirt medium", 15, .5),
  // new StoreItem("Shorts small", 100, .5),
  // new StoreItem("Shorts large", 120, .16),
  // new StoreItem("Shorts medium", 150, .125));

  // Optional<StoreItem> leastExpensiveOpt = StoreItem.leastExpensiveItem(items);
  // if (leastExpensiveOpt.isPresent()) {
  // System.out.println(leastExpensiveOpt.get());
  // }

  // }
  // ********END END OF YEAR SALE */

}

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
}

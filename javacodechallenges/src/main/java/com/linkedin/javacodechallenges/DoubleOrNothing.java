package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
  private static int startingPoints = 10;
  private Scanner reader = new Scanner(System.in);
  private Random random = new Random();
  private int currentPoints = startingPoints;
  private boolean isStillPlaying = true;

  public void playGame() {
    printWelcome();
    askUserToContinue();

    while (this.isStillPlaying) {
      printToTryDouble();

      if (shouldDouble()) {
        doubleCurrent();
        printCongrats();
        askUserToContinue();
      } else {
        printLost();
        return;
      }
    }
    printWalkaway();
  }

  private void printWelcome() {
    System.out.println("Let's play Double or Nothing. We'll start you with 10 points.");
  }

  private void printCongrats() {
    System.out.println("Congrats, you now have " + this.currentPoints + " points.");
  }

  private void printToTryDouble() {
    System.out.println("Attempting to double points");
  }

  private void printLost() {
    System.out.println("You lost all points.");
  }

  private void printWalkaway() {
    System.out.println("Congrats, you are walking away with " + this.currentPoints + " points.");
  }

  private void askUserToContinue() {
    System.out.println("Would you like to continue and try to double your points? Enter Yes");
    this.isStillPlaying = this.reader.nextLine().toUpperCase().equals("YES");
  }

  private boolean shouldDouble() {
    return this.random.nextInt(2) == 0;
  }

  public void doubleCurrent() {
    this.currentPoints = this.currentPoints * 2;
  }
}

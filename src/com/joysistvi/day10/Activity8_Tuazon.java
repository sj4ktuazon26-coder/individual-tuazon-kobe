package com.joysistvi.day10;

import java.util.Scanner;

public class Activity8_Tuazon {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    final byte SIZE = 5;
    int[] nums = new int[SIZE];

    System.out.println("Enter 5 numbers:");
    for(int i = 0; i < SIZE; i++) {
      System.out.print("Number " + (i+1) + ": ");
      nums[i] = scanner.nextInt();
    }

    System.out.println();

    System.out.println("You entered:");
    for(int i = 0; i < SIZE; i++) {
      System.out.println("Index " + i + ": " + nums[i]);
    }

    System.out.println();

    int sum = 0;
    for(int i = 0; i < SIZE; i++) {
      sum += nums[i];
    }
    System.out.println("Sum = " + sum);

    System.out.println("Average = " + ((float) sum / SIZE));

    int highest = nums[0];
    int lowest = nums[0];
    for(int i = 0; i < SIZE; i++) {
      highest = Math.max(highest, nums[i]);
      lowest = Math.min(lowest, nums[i]);
    }

    System.out.println();

    System.out.println("Highest Number: " + highest);
    System.out.println("Lowest Number: " + lowest);

    scanner.close();
  }
}

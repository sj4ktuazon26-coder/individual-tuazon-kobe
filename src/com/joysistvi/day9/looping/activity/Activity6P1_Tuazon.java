package com.joysistvi.day9.looping.activity;

import java.util.Scanner;

public class Activity6P1_Tuazon {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the multiplication table you want to display: ");
    int num = scanner.nextInt();

    System.out.println("Multiplication Table of " + num);
    for(int i = 0; i < 10; i++) {
      System.out.println(num + " x " + (i+1) + " = " + (num * (i+1)));
    }
  }
}

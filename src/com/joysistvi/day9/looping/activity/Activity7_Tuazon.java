package com.joysistvi.day9.looping.activity;

public class Activity7_Tuazon {
  public static void main(String[] args) {
    for(int i = 1; i <= 10; i++) {
      System.out.println("Multiplication Table of " + i);

      for(int j = 1; j <= 10; j++) {
        System.out.println(i + " x " + j + " = " + (i*j));
      }

      System.out.println();
    }
  }
}

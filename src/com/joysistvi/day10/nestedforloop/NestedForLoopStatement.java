package com.joysistvi.day10.nestedforloop;

public class NestedForLoopStatement {
  public static void main(String[] args) {
//    System.out.println("*** Multiplication Table ***");
//    for (int i = 1; i <= 10; i++) {
//      System.out.println("* Multiplication Table of " + i + " *");
//      for (int j = 1; j <= 10; j++) {
//        System.out.println(i + " * " + j + " = " + (i * j));
//      }
//      System.out.println();
//    }
//
//    for(int i = 1; i <= 5; i++) {
//      System.out.println(i);
//      for(int j = 1; j <= i; j++) {
//        System.out.println("\t" + j);
//      }
//    }

    // Pyramid.
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < (i+1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

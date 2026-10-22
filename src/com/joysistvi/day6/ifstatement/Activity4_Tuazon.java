package com.joysistvi.day6.ifstatement;

public class Activity4_Tuazon {

  /**
   * Age: 0 - 2 → Baby
   * Age: 3 - 12 → Child
   * Age: 13 - 19 → Teenager
   * Age: 20 - 29 → Young Adult
   * Age: 30 - 59 → Adult
   * Age: 60 - 100 → Senior
   */
  public static void main(String[] args) {
    // Initial Value.
    int age = 25;
    String category = null;

    if(age >= 0 && age <= 2) {
      category = "Baby";
    } else if(age >= 3 && age <= 12) {
      category = "Child";
    } else if(age >= 13 && age <= 19) {
      category = "Teenager";
    } else if(age >= 20 && age <= 29) {
      category = "Young Adult";
    } else if(age >= 30 && age <= 59) {
      category = "Adult";
    } else if(age >= 60 && age <= 100) {
      category = "Senior";
    } else {
      category = "Invalid Age";
    }

    System.out.println("Age: " + age);
    System.out.println("Category: " + category);
  }
}

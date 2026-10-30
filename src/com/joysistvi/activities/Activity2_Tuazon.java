package com.joysistvi.activities;

public class Activity2_Tuazon {
  public static void main(String[] args) {
    double income = 50000;
    double foodAllowance = 15000;
    double transportation = 2500;
    double rent = 4500;
    double utilityBill = 3500;

    System.out.printf("Income: %d", (int) income).println();
    System.out.printf("Food Allowance: %.1f %%", ((foodAllowance / income) * 100)).println();
    System.out.printf("Transportation: %.1f %%", ((transportation / income) * 100)).println();
    System.out.printf("Rent: %.1f %%", ((rent / income) * 100)).println();
    System.out.printf("Utility Bill: %.1f %%", ((utilityBill / income) * 100)).println();
    System.out.printf("Remaining Balance: %d", (int)(income - (foodAllowance + transportation + rent + utilityBill))).println();
  }
}
